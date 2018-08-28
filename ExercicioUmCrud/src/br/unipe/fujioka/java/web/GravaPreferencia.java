package br.unipe.fujioka.java.web;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.unipe.fujioka.java.web.entidades.Cliente;
import br.unipe.fujioka.java.web.entidades.Preferencia;

public class GravaPreferencia {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cadastro");
		EntityManager manager = factory.createEntityManager();

		Preferencia preferencia = new Preferencia();
		Cliente cliente = new Cliente();
		
		cliente.setId(1L);
		
		preferencia.setId_cliente(cliente);
		preferencia.setDescricao("batata");
		
		manager.getTransaction().begin();
		manager.persist(preferencia);
		manager.getTransaction().commit();
		
		
		manager.close();
		factory.close();
		
	}

}
