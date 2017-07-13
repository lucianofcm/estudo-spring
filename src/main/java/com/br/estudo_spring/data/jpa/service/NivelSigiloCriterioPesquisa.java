/*
 * Copyright 2012-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.br.estudo_spring.data.jpa.service;

import java.io.Serializable;
import java.util.List;

import com.br.estudo_spring.data.jpa.domain.NivelSigilo;

public class NivelSigiloCriterioPesquisa implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String numPontoUsuario;
	private Long ideGrupo;
	private List<NivelSigilo> nivelSigilo;
	

	public NivelSigiloCriterioPesquisa(Long id, String numPontoUsuario, Long ideGrupo, List<NivelSigilo> nivelSigilo) {
		super();
		this.id = id;
		this.numPontoUsuario = numPontoUsuario;
		this.ideGrupo = ideGrupo;
		this.nivelSigilo = nivelSigilo;
	}

	public Long getId() {
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
