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
@Table(name = "CLASSIFICACAO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Classificacao.findAll", query = "SELECT c FROM Classificacao c"),
    @NamedQuery(name = "Classificacao.findByIdclassificacao", query = "SELECT c FROM Classificacao c WHERE c.idclassificacao = :idclassificacao"),
    @NamedQuery(name = "Classificacao.findByClaDescr", query = "SELECT c FROM Classificacao c WHERE c.claDescr = :claDescr")})
public class Classificacao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDCLASSIFICACAO")
    private Integer idclassificacao;
    @Size(max = 45)
    @Column(name = "CLA_DESCR")
    private String claDescr;
    //# atributo comentado para nçao retornar o Collection na entidade cliente
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "claIdclassificacao")
//    private Collection<Cliente> clienteCollection;

    public Classificacao() {
    }

    public Classificacao(Integer idclassificacao) {
        this.idclassificacao = idclassificacao;
    }

    public Integer getIdclassificacao() {
        return idclassificacao;
    }

    public void setIdclassificacao(Integer idclassificacao) {
        this.idclassificacao = idclassificacao;
    }

    public String getClaDescr() {
        return claDescr;
    }

    public void setClaDescr(String claDescr) {
        this.claDescr = claDescr;
    }

//    @XmlTransient
//    public Collection<Cliente> getClienteCollection() {
//        return clienteCollection;
//    }
//
//    public void setClienteCollection(Collection<Cliente> clienteCollection) {
//        this.clienteCollection = clienteCollection;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idclassificacao != null ? idclassificacao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Classificacao)) {
            return false;
        }
        Classificacao other = (Classificacao) object;
        if ((this.idclassificacao == null && other.idclassificacao != null) || (this.idclassificacao != null && !this.idclassificacao.equals(other.idclassificacao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.cradlesoft.model.Classificacao[ idclassificacao=" + idclassificacao + " ]";
    }
    
}
