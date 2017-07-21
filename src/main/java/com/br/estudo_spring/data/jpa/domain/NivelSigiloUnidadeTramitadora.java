package com.br.estudo_spring.data.jpa.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
	
/*Exemplos namedQueries
 * @NamedQueries({ @NamedQuery(name = "contarGrupo", query = "select count(id) from GrupoConsultaWS"),
		@NamedQuery(name = "verificarGrupoExistente", query = "select count(g.id) from GrupoConsultaWS g where g.nome = ? "),
		@NamedQuery(name = "pesquisarGrupoPorNome", query = "select g from GrupoConsultaWS g where g.nome = ? order by g.nome"),
		@NamedQuery(name = "pesquisarGrupoPorNomeGestor", query = "select g from GrupoConsultaWS g where g.nome = ? and g.nomeGrupoGestor = ? order by g.nome"),
		@NamedQuery(name = "listarGrupoPorNome", query = "select g from GrupoConsultaWS g where g.nome = ?  order by g.nome "),
		@NamedQuery(name = "listarGrupoPorId", query = "select g from GrupoConsultaWS g where g.id = ? order by g.nome "),
		@NamedQuery(name = "listarGrupo", query = "select g from GrupoConsultaWS g  order by g.nome "),
		@NamedQuery(name = "listarTodosGruposSubTipoUTMesa", query = "select g from GrupoConsultaWS g where g.subTipoUnidadeTramitadora.id = 6  order by g.nome "),
		@NamedQuery(name = "listarTodosGruposSubTipoUTLideranca", query = "select g from GrupoConsultaWS g where g.subTipoUnidadeTramitadora.id = 7  order by g.nome "),
		@NamedQuery(name = "listarTodosGruposSubTipoUTGabinete", query = "select g from GrupoConsultaWS g where g.subTipoUnidadeTramitadora.id = 8  order by g.nome "),
		@NamedQuery(name = "listarTodosGruposSubTipoUTComissao", query = "select g from GrupoConsultaWS g where g.subTipoUnidadeTramitadora.id = 9  order by g.nome "),
		@NamedQuery(name = "listarTodosGruposAtivos", query = "select g from GrupoConsultaWS g where g.ativo = 'S' and g.subTipoUnidadeTramitadora.id is not null")
}) */

@Entity
@NamedQueries({
		@NamedQuery(name = "listarNivelSigiloUsuarioUT", query = "select nsu from NivelSigiloUnidadeTramitadora nsu where nsu.numPontoUsuario = ? and nsu.ideGrupo = ?")
		//@NamedQuery(name = "listarSigilo", query = "select nsu from NivelSigiloUnidadeTramitadora nsu where nsu.numPontoUsuario = ? and nsu.ideGrupo = ? and nsu.")

})
@Table(name = "Nivel_Sigilo_Unidade_Tramitadora")
public class NivelSigiloUnidadeTramitadora implements Serializable  {

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
	
	protected NivelSigiloUnidadeTramitadora() {
	}
	
	public NivelSigiloUnidadeTramitadora(Long id, String numPontoUsuario, Long ideGrupo,
			List<NivelSigilo> nivelSigilo) {
		super();
		this.id = id;
		this.numPontoUsuario = numPontoUsuario;
		this.ideGrupo = ideGrupo;
		this.nivelSigilo = nivelSigilo;
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