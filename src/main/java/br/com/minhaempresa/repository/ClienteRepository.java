package br.com.minhaempresa.repository;

import javax.persistence.EntityManager;

public class ClienteRepository {

    private EntityManager entityManager = Conexao.getConexao();

}
