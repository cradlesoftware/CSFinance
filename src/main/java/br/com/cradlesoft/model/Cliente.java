/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cradlesoft.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
@Table(name = "CLIENTE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c"),
    @NamedQuery(name = "Cliente.findByIdcliente", query = "SELECT c FROM Cliente c WHERE c.idcliente = :idcliente"),
    @NamedQuery(name = "Cliente.findByClaIdClassificacao", query = "SELECT c FROM Cliente c WHERE c.claIdClassificacao = :claIdClassificacao"),
    @NamedQuery(name = "Cliente.findByNome", query = "SELECT c FROM Cliente c WHERE c.nome = :nome"),
    @NamedQuery(name = "Cliente.findByEmail", query = "SELECT c FROM Cliente c WHERE c.email = :email"),
    @NamedQuery(name = "Cliente.findByTelefone", query = "SELECT c FROM Cliente c WHERE c.telefone = :telefone"),
    @NamedQuery(name = "Cliente.findByCelular", query = "SELECT c FROM Cliente c WHERE c.celular = :celular"),
    @NamedQuery(name = "Cliente.findByCpf", query = "SELECT c FROM Cliente c WHERE c.cpf = :cpf"),
    @NamedQuery(name = "Cliente.findByUf", query = "SELECT c FROM Cliente c WHERE c.uf = :uf"),
    @NamedQuery(name = "Cliente.findByCidade", query = "SELECT c FROM Cliente c WHERE c.cidade = :cidade"),
    @NamedQuery(name = "Cliente.findByCep", query = "SELECT c FROM Cliente c WHERE c.cep = :cep"),
    @NamedQuery(name = "Cliente.findByBairro", query = "SELECT c FROM Cliente c WHERE c.bairro = :bairro"),
    @NamedQuery(name = "Cliente.findByEndereco", query = "SELECT c FROM Cliente c WHERE c.endereco = :endereco"),
    @NamedQuery(name = "Cliente.findByTipo", query = "SELECT c FROM Cliente c WHERE c.tipo = :tipo"),
    @NamedQuery(name = "Cliente.findByCnpj", query = "SELECT c FROM Cliente c WHERE c.cnpj = :cnpj"),
    @NamedQuery(name = "Cliente.findByInsEst", query = "SELECT c FROM Cliente c WHERE c.insEst = :insEst"),
    @NamedQuery(name = "Cliente.findByInsMun", query = "SELECT c FROM Cliente c WHERE c.insMun = :insMun"),
    @NamedQuery(name = "Cliente.findByUfC", query = "SELECT c FROM Cliente c WHERE c.ufC = :ufC"),
    @NamedQuery(name = "Cliente.findByCidadeC", query = "SELECT c FROM Cliente c WHERE c.cidadeC = :cidadeC"),
    @NamedQuery(name = "Cliente.findByCepC", query = "SELECT c FROM Cliente c WHERE c.cepC = :cepC"),
    @NamedQuery(name = "Cliente.findByBairroC", query = "SELECT c FROM Cliente c WHERE c.bairroC = :bairroC"),
    @NamedQuery(name = "Cliente.findByEnderecoC", query = "SELECT c FROM Cliente c WHERE c.enderecoC = :enderecoC"),
    @NamedQuery(name = "Cliente.findByObs", query = "SELECT c FROM Cliente c WHERE c.obs = :obs"),
    @NamedQuery(name = "Cliente.findByCliDtCriacao", query = "SELECT c FROM Cliente c WHERE c.cliDtCriacao = :cliDtCriacao"),
    @NamedQuery(name = "Cliente.findByCliCriadoPor", query = "SELECT c FROM Cliente c WHERE c.cliCriadoPor = :cliCriadoPor"),
    @NamedQuery(name = "Cliente.findByCliDtEdicao", query = "SELECT c FROM Cliente c WHERE c.cliDtEdicao = :cliDtEdicao"),
    @NamedQuery(name = "Cliente.findByCliEditadoPor", query = "SELECT c FROM Cliente c WHERE c.cliEditadoPor = :cliEditadoPor")})
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDCLIENTE")
    private Integer idcliente;
    @Size(max = 60)
    @Column(name = "NOME")
    private String nome;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 35)
    @Column(name = "EMAIL")
    private String email;
    @Size(max = 10)
    @Column(name = "TELEFONE")
    private String telefone;
    @Size(max = 11)
    @Column(name = "CELULAR")
    private String celular;
    @Size(max = 11)
    @Column(name = "CPF")
    private String cpf;
    @Size(max = 2)
    @Column(name = "UF")
    private String uf;
    @Size(max = 35)
    @Column(name = "CIDADE")
    private String cidade;
    @Size(max = 8)
    @Column(name = "CEP")
    private String cep;
    @Size(max = 35)
    @Column(name = "BAIRRO")
    private String bairro;
    @Size(max = 255)
    @Column(name = "ENDERECO")
    private String endereco;
    @Size(max = 15)
    @Column(name = "TIPO")
    private String tipo;
    @Size(max = 13)
    @Column(name = "CNPJ")
    private String cnpj;
    @Size(max = 9)
    @Column(name = "INS_EST")
    private String insEst;
    @Size(max = 11)
    @Column(name = "INS_MUN")
    private String insMun;
    @Size(max = 2)
    @Column(name = "UF_C")
    private String ufC;
    @Size(max = 35)
    @Column(name = "CIDADE_C")
    private String cidadeC;
    @Size(max = 8)
    @Column(name = "CEP_C")
    private String cepC;
    @Size(max = 35)
    @Column(name = "BAIRRO_C")
    private String bairroC;
    @Size(max = 255)
    @Column(name = "ENDERECO_C")
    private String enderecoC;
    @Size(max = 255)
    @Column(name = "OBS")
    private String obs;
    @Column(name = "CLI_DT_CRIACAO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cliDtCriacao;
    @Size(max = 20)
    @Column(name = "CLI_CRIADO_POR")
    private String cliCriadoPor;
    @Column(name = "CLI_DT_EDICAO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cliDtEdicao;
    @Size(max = 20)
    @Column(name = "CLI_EDITADO_POR")
    private String cliEditadoPor;
    
    /*Relacionamento substituido pelo private int claIdClassificacao para retornar o ID e não a entidade
    //@JoinColumn(name = "CLA_IDCLASSIFICACAO", referencedColumnName = "IDCLASSIFICACAO")
    //@ManyToOne(optional = false)
    //private Classificacao claIdclassificacao;
    */
    
    @NotNull    
    @Column(name = "CLA_IDCLASSIFICACAO")
    private int claIdClassificacao;         

    public Cliente() {
    }

    public Cliente(Integer idcliente) {
        this.idcliente = idcliente;
    }

    public Integer getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(Integer idcliente) {
        this.idcliente = idcliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInsEst() {
        return insEst;
    }

    public void setInsEst(String insEst) {
        this.insEst = insEst;
    }

    public String getInsMun() {
        return insMun;
    }

    public void setInsMun(String insMun) {
        this.insMun = insMun;
    }

    public String getUfC() {
        return ufC;
    }

    public void setUfC(String ufC) {
        this.ufC = ufC;
    }

    public String getCidadeC() {
        return cidadeC;
    }

    public void setCidadeC(String cidadeC) {
        this.cidadeC = cidadeC;
    }

    public String getCepC() {
        return cepC;
    }

    public void setCepC(String cepC) {
        this.cepC = cepC;
    }

    public String getBairroC() {
        return bairroC;
    }

    public void setBairroC(String bairroC) {
        this.bairroC = bairroC;
    }

    public String getEnderecoC() {
        return enderecoC;
    }

    public void setEnderecoC(String enderecoC) {
        this.enderecoC = enderecoC;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public Date getCliDtCriacao() {
        return cliDtCriacao;
    }

    public void setCliDtCriacao(Date cliDtCriacao) {
        this.cliDtCriacao = cliDtCriacao;
    }

    public String getCliCriadoPor() {
        return cliCriadoPor;
    }

    public void setCliCriadoPor(String cliCriadoPor) {
        this.cliCriadoPor = cliCriadoPor;
    }

    public Date getCliDtEdicao() {
        return cliDtEdicao;
    }

    public void setCliDtEdicao(Date cliDtEdicao) {
        this.cliDtEdicao = cliDtEdicao;
    }

    public String getCliEditadoPor() {
        return cliEditadoPor;
    }

    public void setCliEditadoPor(String cliEditadoPor) {
        this.cliEditadoPor = cliEditadoPor;
    }

    public int getClaIdClassificacao() {
        return claIdClassificacao;
    }

    public void setClaIdClassificacao(int claIdClassificacao) {
        this.claIdClassificacao = claIdClassificacao;
    }
    
//    #referencia a linha 145 
//    public Classificacao getClaIdclassificacao() {
//        return claIdclassificacao;
//    }
//
//    public void setClaIdclassificacao(Classificacao claIdclassificacao) {
//        this.claIdclassificacao = claIdclassificacao;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcliente != null ? idcliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.idcliente == null && other.idcliente != null) || (this.idcliente != null && !this.idcliente.equals(other.idcliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.cradlesoft.model.Cliente[ idcliente=" + idcliente + " ]";
    }
    
}
