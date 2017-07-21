package com.br.estudo_spring.data.jpa.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Nivel_Sigilo")
public class NivelSigilo  {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ide_nivel_sigilo")
	private long id;

	@Column(name = "nom_nivel_sigilo")
	private String nomNivelSigilo;
	
	@ManyToOne
	@JoinColumn(name = "nivelSigilo_id")
	private NivelSigiloUnidadeTramitadora nivelSigiloUnidadeTramitadora;

	public long getId() {
		return id;	
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomNivelSigilo() {
		return nomNivelSigilo;
	}

	public void setNomNivelSigilo(String nomNivelSigilo) {
		this.nomNivelSigilo = nomNivelSigilo;
	}

}
