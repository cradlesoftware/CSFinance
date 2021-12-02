/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cradlesoft.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author lucio
 */
@Entity
@Table(name = "CONTACORRENTE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Contacorrente.findAll", query = "SELECT c FROM Contacorrente c"),
    @NamedQuery(name = "Contacorrente.findByIdcontacorrente", query = "SELECT c FROM Contacorrente c WHERE c.idcontacorrente = :idcontacorrente"),
    @NamedQuery(name = "Contacorrente.findByCtacDescr", query = "SELECT c FROM Contacorrente c WHERE c.ctacDescr = :ctacDescr"),
    @NamedQuery(name = "Contacorrente.findBySaldoInicial", query = "SELECT c FROM Contacorrente c WHERE c.saldoInicial = :saldoInicial"),
    @NamedQuery(name = "Contacorrente.findBySaldoAtual", query = "SELECT c FROM Contacorrente c WHERE c.saldoAtual = :saldoAtual"),
    @NamedQuery(name = "Contacorrente.findByDtAtualizacao", query = "SELECT c FROM Contacorrente c WHERE c.dtAtualizacao  = :dtAtualizacao")})
public class Contacorrente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDCONTACORRENTE")
    private Integer idcontacorrente;
    @Size(max = 45)
    @Column(name = "CTAC_DESCR")
    private String ctacDescr;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SALDO_INICIAL")
    private Double saldoInicial;
    @Column(name = "SALDO_ATUAL")
    private Double saldoAtual;
    @Column(name = "DT_ATUALIZACAO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAtualizacao;
    @OneToMany(cascade = CascadeType.DETACH, mappedBy = "ctacIdcontacorrente")
    private Collection<Conta> contaCollection;

    public Contacorrente() {
    }

    public Contacorrente(Integer idcontacorrente) {
        this.idcontacorrente = idcontacorrente;
    }

    public Integer getIdcontacorrente() {
        return idcontacorrente;
    }

    public void setIdcontacorrente(Integer idcontacorrente) {
        this.idcontacorrente = idcontacorrente;
    }

    public String getCtacDescr() {
        return ctacDescr;
    }

    public void setCtacDescr(String ctacDescr) {
        this.ctacDescr = ctacDescr;
    }

    public Double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(Double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public Double getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(Double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }

    public Date getDtAtualizacao() {
        return dtAtualizacao;
    }

    public void setDtAtualizacao(Date dtAtualizacao) {
        this.dtAtualizacao = dtAtualizacao;
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
        hash += (idcontacorrente != null ? idcontacorrente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contacorrente)) {
            return false;
        }
        Contacorrente other = (Contacorrente) object;
        if ((this.idcontacorrente == null && other.idcontacorrente != null) || (this.idcontacorrente != null && !this.idcontacorrente.equals(other.idcontacorrente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.cradlesoft.model.Contacorrente[ idcontacorrente=" + idcontacorrente + " ]";
    }
    
}
