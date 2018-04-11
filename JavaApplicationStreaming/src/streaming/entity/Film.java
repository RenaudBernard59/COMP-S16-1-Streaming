/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author renob
 */
@Entity
@Table(name = "movie")
public class Film implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 32, unique = true)
    private String titre;   
    @Column(name = "Description", length = 4000)
    private String synopsis;
    @OneToMany(mappedBy = "film")
    private List<Lien> liens = new ArrayList<>();
    
    @ManyToOne
    @JoinTable(name = "film")
    private List<Acteur> acteur = new ArrayList<>();
    private List<Realisateur> realisateur = new ArrayList<>();
    
    
    
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public Date getDateSortie() {
        return dateSortie;
    }

    public void setDateSortie(Date dateSortie) {
        this.dateSortie = dateSortie;
    }

    public Long getLienFilm() {
        return lienFilm;
    }

    public void setLienFilm(Long lienFilm) {
        this.lienFilm = lienFilm;
    }

    public Long getPaysFilm() {
        return PaysFilm;
    }

    public void setPaysFilm(Long PaysFilm) {
        this.PaysFilm = PaysFilm;
    }

    public Long getPersonnesFilm() {
        return PersonnesFilm;
    }

    public void setPersonnesFilm(Long PersonnesFilm) {
        this.PersonnesFilm = PersonnesFilm;
    }
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(length = 4)
    private Date dateSortie;
    private Long lienFilm;
    private Long PaysFilm;
    private Long PersonnesFilm;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Film)) {
            return false;
        }
        Film other = (Film) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "streaming.entity.Film[ id=" + id + " ]";
    }
    
}
