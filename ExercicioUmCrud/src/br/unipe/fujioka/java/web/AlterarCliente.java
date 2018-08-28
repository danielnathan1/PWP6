package br.unipe.fujioka.java.web;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.unipe.fujioka.java.web.entidades.Cliente;

public class AlterarCliente {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cadastro");
		EntityManager manager = factory.createEntityManager();
		
		Cliente cliente = manager.find(Cliente.class, 1L);
		
		cliente.setNome("Daniel");
		
		manager.getTransaction().begin();
		manager.persist(cliente);
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();

	}

}
