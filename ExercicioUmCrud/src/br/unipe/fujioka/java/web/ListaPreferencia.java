package br.unipe.fujioka.java.web;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.unipe.fujioka.java.web.entidades.Cliente;
import br.unipe.fujioka.java.web.entidades.Preferencia;

public class ListaPreferencia {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cadastro");
		EntityManager manager = factory.createEntityManager();
		
		Query query = manager.createQuery("SELECT p FROM Preferencia p "
				+ "INNER JOIN p.idCliente c ON(p.idCliente = c.id)"
				+ "WHERE c.matricula = :matricula", Preferencia.class);
		
		query.setParameter("matricula", 101);
		
		List<Preferencia> preferencia = query.getResultList();
		
		for(Preferencia p : preferencia) {
			System.out.println(p);
		}

		manager.close();
		factory.close();
	}

}
