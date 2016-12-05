package br.com.leandro.dev.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.leandro.dev.models.Conta;
import br.com.leandro.dev.util.JPAUtil;

public class TesteJPA {
	public static void main(String[] args) {
	
		
		
		EntityManager em = new JPAUtil().getEntityManager();
//		
//		Conta conta = new Conta();
//		conta.setTitular("Leandro");
//		conta.setBanco("BB");
//		conta.setAgencia("Daqui");
//		conta.setNumero("9999");
//		
		
		Conta conta = em.find(Conta.class, 1);
				System.out.println(conta.getTitular());
				
				conta.setTitular("Joao Alfredo jr");
		
		em.getTransaction().begin();
		//em.persist(conta);
		em.getTransaction().commit();
		//em.close();

	}
}
