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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author lucio
 */
@Entity
@Table(name = "USUARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u"),
    @NamedQuery(name = "Usuario.findByIdusuario", query = "SELECT u FROM Usuario u WHERE u.idusuario = :idusuario"),
    @NamedQuery(name = "Usuario.findByNome", query = "SELECT u FROM Usuario u WHERE u.nome = :nome"),
    @NamedQuery(name = "Usuario.findByEmail", query = "SELECT u FROM Usuario u WHERE u.email = :email"),
    @NamedQuery(name = "Usuario.findByLogin", query = "SELECT u FROM Usuario u WHERE u.login = :login"),
    @NamedQuery(name = "Usuario.findBySenha", query = "SELECT u FROM Usuario u WHERE u.senha = :senha"),
    @NamedQuery(name = "Usuario.findByUsuDtCriacao", query = "SELECT u FROM Usuario u WHERE u.usuDtCriacao = :usuDtCriacao"),
    @NamedQuery(name = "Usuario.findByUsuCriadoPor", query = "SELECT u FROM Usuario u WHERE u.usuCriadoPor = :usuCriadoPor"),
    @NamedQuery(name = "Usuario.findByUsuDtEdicao", query = "SELECT u FROM Usuario u WHERE u.usuDtEdicao = :usuDtEdicao"),
    @NamedQuery(name = "Usuario.findByUsuEditadoPor", query = "SELECT u FROM Usuario u WHERE u.usuEditadoPor = :usuEditadoPor")})
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDUSUARIO")
    private Integer idusuario;
    @Size(max = 60)
    @Column(name = "NOME")
    private String nome;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 35)
    @Column(name = "EMAIL")
    private String email;
    @Size(max = 20)
    @Column(name = "LOGIN")
    private String login;
    @Size(max = 20)
    @Column(name = "SENHA")
    private String senha;
    @Column(name = "USU_DT_CRIACAO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date usuDtCriacao;
    @Size(max = 20)
    @Column(name = "USU_CRIADO_POR")
    private String usuCriadoPor;
    @Column(name = "USU_DT_EDICAO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date usuDtEdicao;
    @Size(max = 20)
    @Column(name = "USU_EDITADO_POR")
    private String usuEditadoPor;

    public Usuario() {
    }

    public Usuario(Integer idusuario) {
        this.idusuario = idusuario;
    }

    public Integer getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Integer idusuario) {
        this.idusuario = idusuario;
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Date getUsuDtCriacao() {
        return usuDtCriacao;
    }

    public void setUsuDtCriacao(Date usuDtCriacao) {
        this.usuDtCriacao = usuDtCriacao;
    }

    public String getUsuCriadoPor() {
        return usuCriadoPor;
    }

    public void setUsuCriadoPor(String usuCriadoPor) {
        this.usuCriadoPor = usuCriadoPor;
    }

    public Date getUsuDtEdicao() {
        return usuDtEdicao;
    }

    public void setUsuDtEdicao(Date usuDtEdicao) {
        this.usuDtEdicao = usuDtEdicao;
    }

    public String getUsuEditadoPor() {
        return usuEditadoPor;
    }

    public void setUsuEditadoPor(String usuEditadoPor) {
        this.usuEditadoPor = usuEditadoPor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idusuario != null ? idusuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.idusuario == null && other.idusuario != null) || (this.idusuario != null && !this.idusuario.equals(other.idusuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.cradlesoft.model.Usuario[ idusuario=" + idusuario + " ]";
    }
    
}
