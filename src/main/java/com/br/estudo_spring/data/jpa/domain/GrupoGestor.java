package com.br.estudo_spring.data.jpa.domain;

import java.util.Collection;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "grupo_gestor")
public class GrupoGestor {
	
	@Id
	@Column(name = "ide_grupo_gestor")
	private long id;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "grupoGestor")
	private Collection<Grupo>grupoGestor;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Collection<Grupo> getGrupoGestor() {
		return grupoGestor;
	}

	public void setGrupoGestor(Collection<Grupo> grupoGestor) {
		this.grupoGestor = grupoGestor;
	}

	

}
		