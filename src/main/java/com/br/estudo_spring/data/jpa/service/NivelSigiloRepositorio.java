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

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import com.br.estudo_spring.data.jpa.domain.City;
import com.br.estudo_spring.data.jpa.domain.NivelSigilo;
import com.br.estudo_spring.data.jpa.domain.NivelSigiloUnidadeTramitadora;

interface NivelSigiloRepositorio extends Repository<NivelSigiloUnidadeTramitadora, Long> {

	Page<NivelSigiloUnidadeTramitadora> findAll(Pageable pageable);

	Page<NivelSigiloUnidadeTramitadora> findByNumPontoUsuario(
			String numPontoUsuario,  Pageable pageable);

	/*NivelSigiloUnidadeTramitadora findByNameAndCountryAllIgnoringCase(Long id, String numPontoUsuario, Long ideGrupo,
			List<NivelSigilo> nivelSigilo);
*/
}
