package com.br.estudo_spring.data.jpa.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@NamedQueries({
		@NamedQuery(name = "listarNivelSigiloUsuarioUT", query = "select nsu from NivelSigiloUnidadeTramitadora nsu where nsu.numPontoUsuario = ? and nsu.ideGrupo = ?"),
		@NamedQuery(name = "listarSigilo", query = "select nsu from NivelSigiloUnidadeTramitadora nsu where nsu.numPontoUsuario = ? and nsu.ideGrupo = ?")
	
})
@Table(name = "Nivel_Sigilo_Unidade_Tramitadora")
public class NivelSigiloUnidadeTramitadora  {

	private static final long serialVersionUID = 1L;
	

	@Id
	@GeneratedValue
	@Column(name = "ide_nivel_sigilo_unidade_tramitadora")
	private Long id;

	@Column(name = "num_ponto_usuario", nullable = false)
	private String numPontoUsuario;

	@Column(name = "ide_grupo")
	private Long ideGrupo;

	
	@OneToMany(mappedBy ="nivelSigiloUnidadeTramitadora")
	private List<NivelSigilo> nivelSigilo;

	
	public NivelSigiloUnidadeTramitadora() {

	}

	public long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumPontoUsuario() {
		return numPontoUsuario;
	}

	public void setNumPontoUsuario(String numPontoUsuario) {
		this.numPontoUsuario = numPontoUsuario;
	}

	public Long getIdeGrupo() {
		return ideGrupo;
	}

	public void setIdeGrupo(Long ideGrupo) {
		this.ideGrupo = ideGrupo;
	}
	
	public List<NivelSigilo> getNivelSigilo() {
		return nivelSigilo;
	}

	public void setNivelSigilo(List<NivelSigilo> nivelSigilo) {
		this.nivelSigilo = nivelSigilo;
	}

}