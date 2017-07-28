package com.br.estudo_spring.data.jpa.domain;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.NaturalId;

@Entity
@Table(name = "grupo_gestor")
public class GrupoGestor implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private long id;
	
	@ManyToOne(optional = false)
	private Grupo grupo;
	
	@ManyToOne(optional = false)
	private Grupo grupoGestao;

	public Grupo getGrupoGestao() {
		return grupoGestao;
	}

	public void setGrupoGestao(Grupo grupoGestao) {
		this.grupoGestao = grupoGestao;
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}



	

}
		