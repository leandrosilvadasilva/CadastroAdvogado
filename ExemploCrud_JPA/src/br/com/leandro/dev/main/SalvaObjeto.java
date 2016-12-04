package br.com.leandro.dev.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.leandro.dev.models.Cliente;

public class SalvaObjeto {

	public static void main(String[] args) {
		
		/* 1º Configurar EntityManager -  Ele que salva entidade no Banco de Dados
		 * 2º Criar pasta META-INF - Persistence.xml
		 * 3º Importar a interface entitymanagerFactory
		 * 4º name da persistence-unit
		 * 
		 */
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("devUnit");
		
		EntityManager em = emf.createEntityManager();
		
		Cliente cliente = new Cliente();
		cliente.setNome("Leandro");
		cliente.setIdade(36);
		cliente.setProfissao("Analista");
		cliente.setSexo("M");
		
		em.getTransaction().begin();
		em.persist(cliente);
		em.getTransaction().commit();
		
		System.out.println("Cliente salvo com sucesso");
		
		
		//em.close();
	}

}
