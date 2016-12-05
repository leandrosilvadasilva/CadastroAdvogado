package br.com.leandro.dev.util;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	private static EntityManagerFactory entityManagerFactory = Persistence
			.createEntityManagerFactory("devUnitContabeis");

	public EntityManager getEntityManager() {
		return entityManagerFactory.createEntityManager();
	}

}
