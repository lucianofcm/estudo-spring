package com.br.estudo_spring.data.jpa.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "grupo")
public class Grupo {
	
	@Id
	@Column(name = "ide_grupo")
	private long id;
	
	@Column(name = "nome_grupo")
	private String nome_grupo;
	
	@ManyToOne
	@JoinColumn(name = "grupoGestor_id")
	private GrupoGestor grupoGestor;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome_grupo() {
		return nome_grupo;
	}

	public void setNome_grupo(String nome_grupo) {
		this.nome_grupo = nome_grupo;
	}

	public GrupoGestor getGrupoGestor() {
		return grupoGestor;
	}

	public void setGrupoGestor(GrupoGestor grupoGestor) {
		this.grupoGestor = grupoGestor;
	}

}
