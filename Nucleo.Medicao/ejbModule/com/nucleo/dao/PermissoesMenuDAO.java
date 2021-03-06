package com.nucleo.dao;

import java.util.List;
import java.util.Set;

import javax.ejb.Remote;

import com.nucleo.dao.generic.DAO;
import com.nucleo.entity.cadastro.controleDeAcessos.Grupo;
import com.nucleo.entity.cadastro.controleDeAcessos.PermissoesMenu;

@Remote
public interface PermissoesMenuDAO extends DAO<PermissoesMenu, Integer>{
	PermissoesMenu buscarPermissaoPorIdEDescricao(int id, String nome);
	Set<PermissoesMenu>buscarPermissoesPorGrupo(Grupo grupo);
	PermissoesMenu buscarMenu(PermissoesMenu permissoesMenu);
	void deletarPermissao(PermissoesMenu menuDatached,int pessoaId);
	public int buscarUltimoId();
}
