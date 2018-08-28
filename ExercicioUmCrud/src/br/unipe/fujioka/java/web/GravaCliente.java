package br.unipe.fujioka.java.web;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.unipe.fujioka.java.web.entidades.Cliente;

public class GravaCliente {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cadastro");
		EntityManager manager = factory.createEntityManager();
		
		Cliente cliente = new Cliente();
		cliente.setNome("Daniel Nathan");
		cliente.setMatricula("1001");
		cliente.setAtivo(true);

		System.out.println("\tDados inseridos \t");
		System.out.println("Nome: " + cliente.getNome());
		System.out.println("Matricula: " + cliente.getMatricula());
		
		manager.getTransaction().begin();
		manager.persist(cliente);
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();

	}

}
