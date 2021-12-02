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
@Table(name = "GRUPOCONTA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Grupoconta.findAll", query = "SELECT g FROM Grupoconta g"),
    @NamedQuery(name = "Grupoconta.findByIdgrupoconta", query = "SELECT g FROM Grupoconta g WHERE g.idgrupoconta = :idgrupoconta"),
    @NamedQuery(name = "Grupoconta.findByTipo", query = "SELECT g FROM Grupoconta g WHERE g.tipo = :tipo"),
    @NamedQuery(name = "Grupoconta.findByGrupoConta", query = "SELECT g FROM Grupoconta g WHERE g.grupoConta = :grupoConta"),
    @NamedQuery(name = "Grupoconta.findBySubGrupo", query = "SELECT g FROM Grupoconta g WHERE g.subGrupo = :subGrupo"),
    @NamedQuery(name = "Grupoconta.findByGrupoPai", query = "SELECT g FROM Grupoconta g WHERE g.grupoPai = :grupoPai"),
    @NamedQuery(name = "Grupoconta.findByIsgrupo", query = "SELECT g FROM Grupoconta g WHERE g.isgrupo = :isgrupo")})
public class Grupoconta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDGRUPOCONTA")
    private Integer idgrupoconta;
    @Size(max = 1)
    @Column(name = "TIPO")
    private String tipo;
    @Size(max = 20)
    @Column(name = "GRUPO_CONTA")
    private String grupoConta;
    @Size(max = 45)
    @Column(name = "SUB_GRUPO")
    private String subGrupo;
    @Size(max = 45)
    @Column(name = "GRUPO_PAI")
    private String grupoPai;
    @Column(name = "ISGRUPO")
    private Short isgrupo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "gctaIdgrupoconta")
    private Collection<Conta> contaCollection;

    public Grupoconta() {
    }

    public Grupoconta(Integer idgrupoconta) {
        this.idgrupoconta = idgrupoconta;
    }

    public Integer getIdgrupoconta() {
        return idgrupoconta;
    }

    public void setIdgrupoconta(Integer idgrupoconta) {
        this.idgrupoconta = idgrupoconta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getGrupoConta() {
        return grupoConta;
    }

    public void setGrupoConta(String grupoConta) {
        this.grupoConta = grupoConta;
    }

    public String getSubGrupo() {
        return subGrupo;
    }

    public void setSubGrupo(String subGrupo) {
        this.subGrupo = subGrupo;
    }

    public String getGrupoPai() {
        return grupoPai;
    }

    public void setGrupoPai(String grupoPai) {
        this.grupoPai = grupoPai;
    }

    public Short getIsgrupo() {
        return isgrupo;
    }

    public void setIsgrupo(Short isgrupo) {
        this.isgrupo = isgrupo;
    }

    @XmlTransient
    public Collection<Conta> getContaCollection() {
        return contaCollection;
    }

    public void setContaCollection(Collection<Conta> contaCollection) {
        this.contaCollection = contaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idgrupoconta != null ? idgrupoconta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Grupoconta)) {
            return false;
        }
        Grupoconta other = (Grupoconta) object;
        if ((this.idgrupoconta == null && other.idgrupoconta != null) || (this.idgrupoconta != null && !this.idgrupoconta.equals(other.idgrupoconta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.cradlesoft.model.Grupoconta[ idgrupoconta=" + idgrupoconta + " ]";
    }
    
}
