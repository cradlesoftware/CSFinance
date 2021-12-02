/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cradlesoft.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author lucio
 */
@Entity
@Table(name = "CONTA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Conta.findAll", query = "SELECT c FROM Conta c"),
    @NamedQuery(name = "Conta.findByIdconta", query = "SELECT c FROM Conta c WHERE c.idconta = :idconta"),
    @NamedQuery(name = "Conta.findByCctIdCentrocusto", query = "SELECT c FROM Conta c WHERE c.cctIdcentrocusto = :cctIdcentrocusto"),
    @NamedQuery(name = "Conta.findByCliIdCliente", query = "SELECT c FROM Conta c WHERE c.cliIdcliente = :cliIdcliente"),
    @NamedQuery(name = "Conta.findByCtacIdContacorrente", query = "SELECT c FROM Conta c WHERE c.ctacIdcontacorrente = :ctacIdcontacorrente"),
    @NamedQuery(name = "Conta.findByGctaIdGrupoconta", query = "SELECT c FROM Conta c WHERE c.gctaIdgrupoconta = :gctaIdgrupoconta"),
    @NamedQuery(name = "Conta.findByDtEmissao", query = "SELECT c FROM Conta c WHERE c.dtEmissao = :dtEmissao"),
    @NamedQuery(name = "Conta.findByDtVencimento", query = "SELECT c FROM Conta c WHERE c.dtVencimento = :dtVencimento"),
    @NamedQuery(name = "Conta.findByDtPagamento", query = "SELECT c FROM Conta c WHERE c.dtPagamento = :dtPagamento"),
    @NamedQuery(name = "Conta.findByValorPrev", query = "SELECT c FROM Conta c WHERE c.valorPrev = :valorPrev"),
    @NamedQuery(name = "Conta.findByValorReal", query = "SELECT c FROM Conta c WHERE c.valorReal = :valorReal"),
    @NamedQuery(name = "Conta.findByNumDoc", query = "SELECT c FROM Conta c WHERE c.numDoc = :numDoc"),
    @NamedQuery(name = "Conta.findByParcelas", query = "SELECT c FROM Conta c WHERE c.parcelas = :parcelas"),
    @NamedQuery(name = "Conta.findByHistorico", query = "SELECT c FROM Conta c WHERE c.historico = :historico"),
    @NamedQuery(name = "Conta.findByCtaDtCriacao", query = "SELECT c FROM Conta c WHERE c.ctaDtCriacao = :ctaDtCriacao"),
    @NamedQuery(name = "Conta.findByCtaCriadoPor", query = "SELECT c FROM Conta c WHERE c.ctaCriadoPor = :ctaCriadoPor"),
    @NamedQuery(name = "Conta.findByCtaDtEdicao", query = "SELECT c FROM Conta c WHERE c.ctaDtEdicao = :ctaDtEdicao"),
    @NamedQuery(name = "Conta.findByCtaEditadoPor", query = "SELECT c FROM Conta c WHERE c.ctaEditadoPor = :ctaEditadoPor")})
public class Conta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDCONTA")
    private Integer idconta;
    @Column(name = "DT_EMISSAO")
    @Temporal(TemporalType.DATE)
    private Date dtEmissao;
    @Column(name = "DT_VENCIMENTO")
    @Temporal(TemporalType.DATE)
    private Date dtVencimento;
    @Column(name = "DT_PAGAMENTO")
    @Temporal(TemporalType.DATE)
    private Date dtPagamento;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR_PREV")
    private Double valorPrev;
    @Column(name = "VALOR_REAL")
    private Double valorReal;
    @Column(name = "NUM_DOC")
    private Integer numDoc;
    @Column(name = "PARCELAS")
    private Integer parcelas;
    @Column(name = "HISTORICO")
    private String historico;
    @Column(name = "CTA_DT_CRIACAO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ctaDtCriacao;
    @Size(max = 20)
    @Column(name = "CTA_CRIADO_POR")
    private String ctaCriadoPor;
    @Column(name = "CTA_DT_EDICAO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ctaDtEdicao;
    @Size(max = 20)
    @Column(name = "CTA_EDITADO_POR")
    private String ctaEditadoPor;
    
    /* Relaciomento removido 
    @JoinColumn(name = "CCT_IDCENTROCUSTO", referencedColumnName = "IDCENTROCUSTO")
    @ManyToOne(optional = false)
    private Centrocusto cctIdcentrocusto;
    @JoinColumn(name = "CLI_IDCLIENTE", referencedColumnName = "IDCLIENTE")
    @ManyToOne(optional = false)
    private Cliente cliIdcliente;
    @JoinColumn(name = "CTAC_IDCONTACORRENTE", referencedColumnName = "IDCONTACORRENTE")
    @ManyToOne(optional = false)
    private Contacorrente ctacIdcontacorrente;
    @JoinColumn(name = "GCTA_IDGRUPOCONTA", referencedColumnName = "IDGRUPOCONTA")
    @ManyToOne(optional = false)
    private Grupoconta gctaIdgrupoconta;
    */
    
    @NotNull    
    @Column(name = "CCT_IDCENTROCUSTO")
    private int cctIdcentrocusto;
    @NotNull    
    @Column(name = "CLI_IDCLIENTE")
    private int cliIdcliente;
    @NotNull    
    @Column(name = "CTAC_IDCONTACORRENTE")
    private int ctacIdcontacorrente;
    @NotNull    
    @Column(name = "GCTA_IDGRUPOCONTA")
    private int gctaIdgrupoconta;
    
    
    public Conta() {
    }

    public Conta(Integer idconta) {
        this.idconta = idconta;
    }

    public Integer getIdconta() {
        return idconta;
    }

    public void setIdconta(Integer idconta) {
        this.idconta = idconta;
    }

    public Date getDtEmissao() {
        return dtEmissao;
    }

    public void setDtEmissao(Date dtEmissao) {
        this.dtEmissao = dtEmissao;
    }

    public Date getDtVencimento() {
        return dtVencimento;
    }

    public void setDtVencimento(Date dtVencimento) {
        this.dtVencimento = dtVencimento;
    }

    public Date getDtPagamento() {
        return dtPagamento;
    }

    public void setDtPagamento(Date dtPagamento) {
        this.dtPagamento = dtPagamento;
    }

    public Double getValorPrev() {
        return valorPrev;
    }

    public void setValorPrev(Double valorPrev) {
        this.valorPrev = valorPrev;
    }

    public Double getValorReal() {
        return valorReal;
    }

    public void setValorReal(Double valorReal) {
        this.valorReal = valorReal;
    }

    public Integer getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(Integer numDoc) {
        this.numDoc = numDoc;
    }

    public Integer getParcelas() {
        return parcelas;
    }

    public void setParcelas(Integer parcelas) {
        this.parcelas = parcelas;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }
    
    public Date getCtaDtCriacao() {
        return ctaDtCriacao;
    }

    public void setCtaDtCriacao(Date ctaDtCriacao) {
        this.ctaDtCriacao = ctaDtCriacao;
    }

    public String getCtaCriadoPor() {
        return ctaCriadoPor;
    }

    public void setCtaCriadoPor(String ctaCriadoPor) {
        this.ctaCriadoPor = ctaCriadoPor;
    }

    public Date getCtaDtEdicao() {
        return ctaDtEdicao;
    }

    public void setCtaDtEdicao(Date ctaDtEdicao) {
        this.ctaDtEdicao = ctaDtEdicao;
    }

    public String getCtaEditadoPor() {
        return ctaEditadoPor;
    }

    public void setCtaEditadoPor(String ctaEditadoPor) {
        this.ctaEditadoPor = ctaEditadoPor;
    }

    
    /*
    public Centrocusto getCctIdcentrocusto() {
        return cctIdcentrocusto;
    }

    public void setCctIdcentrocusto(Centrocusto cctIdcentrocusto) {
        this.cctIdcentrocusto = cctIdcentrocusto;
    }

    public Cliente getCliIdcliente() {
        return cliIdcliente;
    }

    public void setCliIdcliente(Cliente cliIdcliente) {
        this.cliIdcliente = cliIdcliente;
    }

    public Contacorrente getCtacIdcontacorrente() {
        return ctacIdcontacorrente;
    }

    public void setCtacIdcontacorrente(Contacorrente ctacIdcontacorrente) {
        this.ctacIdcontacorrente = ctacIdcontacorrente;
    }

    public Grupoconta getGctaIdgrupoconta() {
        return gctaIdgrupoconta;
    }

    public void setGctaIdgrupoconta(Grupoconta gctaIdgrupoconta) {
        this.gctaIdgrupoconta = gctaIdgrupoconta;
    }
    
    */
        
    public int getCctIdcentrocusto() {
        return cctIdcentrocusto;
    }

    public void setCctIdcentrocusto(int cctIdcentrocusto) {
        this.cctIdcentrocusto = cctIdcentrocusto;
    }

    public int getCliIdcliente() {
        return cliIdcliente;
    }

    public void setCliIdcliente(int cliIdcliente) {
        this.cliIdcliente = cliIdcliente;
    }

    public int getCtacIdcontacorrente() {
        return ctacIdcontacorrente;
    }

    public void setCtacIdcontacorrente(int ctacIdcontacorrente) {
        this.ctacIdcontacorrente = ctacIdcontacorrente;
    }

    public int getGctaIdgrupoconta() {
        return gctaIdgrupoconta;
    }

    public void setGctaIdgrupoconta(int gctaIdgrupoconta) {
        this.gctaIdgrupoconta = gctaIdgrupoconta;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idconta != null ? idconta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Conta)) {
            return false;
        }
        Conta other = (Conta) object;
        if ((this.idconta == null && other.idconta != null) || (this.idconta != null && !this.idconta.equals(other.idconta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.cradlesoft.model.Conta[ idconta=" + idconta + " ]";
    }
    
}
