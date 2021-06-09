/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cradlesoft.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author luciolima
 */
@Entity
@Table(name = "CLIENTE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c"),
    @NamedQuery(name = "Cliente.findByIdcliente", query = "SELECT c FROM Cliente c WHERE c.idcliente = :idcliente"),
    @NamedQuery(name = "Cliente.findByClaIdcla", query = "SELECT c FROM Cliente c WHERE c.claIdcla = :claIdcla"),
    @NamedQuery(name = "Cliente.findByCnpj", query = "SELECT c FROM Cliente c WHERE c.cnpj = :cnpj"),
    @NamedQuery(name = "Cliente.findByCpf", query = "SELECT c FROM Cliente c WHERE c.cpf = :cpf"),
    @NamedQuery(name = "Cliente.findByTipo", query = "SELECT c FROM Cliente c WHERE c.tipo = :tipo"),
    @NamedQuery(name = "Cliente.findByNome", query = "SELECT c FROM Cliente c WHERE c.nome = :nome"),
    @NamedQuery(name = "Cliente.findByRazao", query = "SELECT c FROM Cliente c WHERE c.razao = :razao"),
    @NamedQuery(name = "Cliente.findByEmail", query = "SELECT c FROM Cliente c WHERE c.email = :email"),
    @NamedQuery(name = "Cliente.findByInscest", query = "SELECT c FROM Cliente c WHERE c.inscest = :inscest"),
    @NamedQuery(name = "Cliente.findByInscmun", query = "SELECT c FROM Cliente c WHERE c.inscmun = :inscmun"),
    @NamedQuery(name = "Cliente.findByObs", query = "SELECT c FROM Cliente c WHERE c.obs = :obs"),
    @NamedQuery(name = "Cliente.findByEnd", query = "SELECT c FROM Cliente c WHERE c.end = :end"),
    @NamedQuery(name = "Cliente.findByBairro", query = "SELECT c FROM Cliente c WHERE c.bairro = :bairro"),
    @NamedQuery(name = "Cliente.findByCidade", query = "SELECT c FROM Cliente c WHERE c.cidade = :cidade"),
    @NamedQuery(name = "Cliente.findByUf", query = "SELECT c FROM Cliente c WHERE c.uf = :uf"),
    @NamedQuery(name = "Cliente.findByCep", query = "SELECT c FROM Cliente c WHERE c.cep = :cep"),
    @NamedQuery(name = "Cliente.findByTel1", query = "SELECT c FROM Cliente c WHERE c.tel1 = :tel1"),
    @NamedQuery(name = "Cliente.findByTel2", query = "SELECT c FROM Cliente c WHERE c.tel2 = :tel2"),
    @NamedQuery(name = "Cliente.findByTel3", query = "SELECT c FROM Cliente c WHERE c.tel3 = :tel3"),
    @NamedQuery(name = "Cliente.findByConcom", query = "SELECT c FROM Cliente c WHERE c.concom = :concom"),
    @NamedQuery(name = "Cliente.findByEndcob", query = "SELECT c FROM Cliente c WHERE c.endcob = :endcob"),
    @NamedQuery(name = "Cliente.findByBairrocob", query = "SELECT c FROM Cliente c WHERE c.bairrocob = :bairrocob"),
    @NamedQuery(name = "Cliente.findByCidadecod", query = "SELECT c FROM Cliente c WHERE c.cidadecod = :cidadecod"),
    @NamedQuery(name = "Cliente.findByUfcob", query = "SELECT c FROM Cliente c WHERE c.ufcob = :ufcob"),
    @NamedQuery(name = "Cliente.findByCepcob", query = "SELECT c FROM Cliente c WHERE c.cepcob = :cepcob"),
    @NamedQuery(name = "Cliente.findByTelcob", query = "SELECT c FROM Cliente c WHERE c.telcob = :telcob")})
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDCLIENTE")
    private Integer idcliente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CLA_IDCLA")
    private int claIdcla;
    @Size(max = 14)
    @Column(name = "CNPJ")
    private String cnpj;
    @Size(max = 11)
    @Column(name = "CPF")
    private String cpf;
    @Size(max = 45)
    @Column(name = "TIPO")
    private String tipo;
    @Size(max = 100)
    @Column(name = "NOME")
    private String nome;
    @Size(max = 150)
    @Column(name = "RAZAO")
    private String razao;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 150)
    @Column(name = "EMAIL")
    private String email;
    @Size(max = 9)
    @Column(name = "INSCEST")
    private String inscest;
    @Size(max = 30)
    @Column(name = "INSCMUN")
    private String inscmun;
    @Size(max = 255)
    @Column(name = "OBS")
    private String obs;
    @Size(max = 255)
    @Column(name = "END")
    private String end;
    @Size(max = 30)
    @Column(name = "BAIRRO")
    private String bairro;
    @Size(max = 30)
    @Column(name = "CIDADE")
    private String cidade;
    @Size(max = 2)
    @Column(name = "UF")
    private String uf;
    @Size(max = 10)
    @Column(name = "CEP")
    private String cep;
    @Size(max = 40)
    @Column(name = "TEL1")
    private String tel1;
    @Size(max = 30)
    @Column(name = "TEL2")
    private String tel2;
    @Size(max = 5)
    @Column(name = "TEL3")
    private String tel3;
    @Size(max = 30)
    @Column(name = "CONCOM")
    private String concom;
    @Size(max = 255)
    @Column(name = "ENDCOB")
    private String endcob;
    @Size(max = 30)
    @Column(name = "BAIRROCOB")
    private String bairrocob;
    @Size(max = 30)
    @Column(name = "CIDADECOD")
    private String cidadecod;
    @Size(max = 2)
    @Column(name = "UFCOB")
    private String ufcob;
    @Size(max = 10)
    @Column(name = "CEPCOB")
    private String cepcob;
    @Size(max = 40)
    @Column(name = "TELCOB")
    private String telcob;

    public Cliente() {
    }

    public Cliente(Integer idcliente) {
        this.idcliente = idcliente;
    }

    public Cliente(Integer idcliente, int claIdcla) {
        this.idcliente = idcliente;
        this.claIdcla = claIdcla;
    }

    public Integer getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(Integer idcliente) {
        this.idcliente = idcliente;
    }

    public int getClaIdcla() {
        return claIdcla;
    }

    public void setClaIdcla(int claIdcla) {
        this.claIdcla = claIdcla;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRazao() {
        return razao;
    }

    public void setRazao(String razao) {
        this.razao = razao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInscest() {
        return inscest;
    }

    public void setInscest(String inscest) {
        this.inscest = inscest;
    }

    public String getInscmun() {
        return inscmun;
    }

    public void setInscmun(String inscmun) {
        this.inscmun = inscmun;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTel1() {
        return tel1;
    }

    public void setTel1(String tel1) {
        this.tel1 = tel1;
    }

    public String getTel2() {
        return tel2;
    }

    public void setTel2(String tel2) {
        this.tel2 = tel2;
    }

    public String getTel3() {
        return tel3;
    }

    public void setTel3(String tel3) {
        this.tel3 = tel3;
    }

    public String getConcom() {
        return concom;
    }

    public void setConcom(String concom) {
        this.concom = concom;
    }

    public String getEndcob() {
        return endcob;
    }

    public void setEndcob(String endcob) {
        this.endcob = endcob;
    }

    public String getBairrocob() {
        return bairrocob;
    }

    public void setBairrocob(String bairrocob) {
        this.bairrocob = bairrocob;
    }

    public String getCidadecod() {
        return cidadecod;
    }

    public void setCidadecod(String cidadecod) {
        this.cidadecod = cidadecod;
    }

    public String getUfcob() {
        return ufcob;
    }

    public void setUfcob(String ufcob) {
        this.ufcob = ufcob;
    }

    public String getCepcob() {
        return cepcob;
    }

    public void setCepcob(String cepcob) {
        this.cepcob = cepcob;
    }

    public String getTelcob() {
        return telcob;
    }

    public void setTelcob(String telcob) {
        this.telcob = telcob;
    }

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
