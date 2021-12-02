/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cradlesoft.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author lucio
 */
@Entity
@Table(name = "CENTROCUSTO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Centrocusto.findAll", query = "SELECT c FROM Centrocusto c"),
    @NamedQuery(name = "Centrocusto.findByIdcentrocusto", query = "SELECT c FROM Centrocusto c WHERE c.idcentrocusto = :idcentrocusto"),
    @NamedQuery(name = "Centrocusto.findByDescr", query = "SELECT c FROM Centrocusto c WHERE c.descr = :descr")})
public class Centrocusto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDCENTROCUSTO")
    private Integer idcentrocusto;
    @Size(max = 45)
    @Column(name = "DESCR")
    private String descr;
    //@OneToMany(cascade = CascadeType.ALL, mappedBy = "cctIdcentrocusto")
    //private Collection<Conta> contaCollection;

    public Centrocusto() {
    }

    public Centrocusto(Integer idcentrocusto) {
        this.idcentrocusto = idcentrocusto;
    }

    public Integer getIdcentrocusto() {
        return idcentrocusto;
    }

    public void setIdcentrocusto(Integer idcentrocusto) {
        this.idcentrocusto = idcentrocusto;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    
//    @XmlTransient
//    public Collection<Conta> getContaCollection() {
//        return contaCollection;
//    }
//
//    public void setContaCollection(Collection<Conta> contaCollection) {
//        this.contaCollection = contaCollection;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcentrocusto != null ? idcentrocusto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Centrocusto)) {
            return false;
        }
        Centrocusto other = (Centrocusto) object;
        if ((this.idcentrocusto == null && other.idcentrocusto != null) || (this.idcentrocusto != null && !this.idcentrocusto.equals(other.idcentrocusto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.cradlesoft.model.Centrocusto[ idcentrocusto=" + idcentrocusto + " ]";
    }
    
}
