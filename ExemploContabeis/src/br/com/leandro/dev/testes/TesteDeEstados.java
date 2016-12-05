package br.com.leandro.dev.testes;

import javax.persistence.EntityManager;

import br.com.leandro.dev.util.JPAUtil;

public class TesteDeEstados {
	
	 public static void main(String[] args) {

			EntityManager manager = new JPAUtil().getEntityManager();

			manager.getTransaction().begin();

			// Testes do capitulo

			manager.getTransaction().commit();

			manager.close();

	}

}
