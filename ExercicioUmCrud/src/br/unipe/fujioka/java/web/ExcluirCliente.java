package br.unipe.fujioka.java.web;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.unipe.fujioka.java.web.entidades.Cliente;
import br.unipe.fujioka.java.web.entidades.Preferencia;

public class ExcluirCliente {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cadastro");
		EntityManager manager = factory.createEntityManager();

		Cliente cliente = manager.find(Cliente.class, 1L);

		manager.getTransaction().begin();
		manager.remove(cliente);
		manager.getTransaction().commit();

		manager.close();
		factory.close();

	}

}
