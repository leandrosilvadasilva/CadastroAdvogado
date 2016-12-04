package br.com.leandro.dev.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.leandro.dev.models.Cliente;

public class ConsultaObjeto {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("devUnit");
		EntityManager em = emf.createEntityManager();
		
		Cliente cliente = em.find(Cliente.class, 1L);
			
		if(cliente != null){
			System.out.println("Nome: " + cliente.getNome());
			System.out.println("Idade: " + cliente.getIdade());
			System.out.println("Profissão: " + cliente.getProfissao());
			System.out.println("Sexo: " + cliente.getSexo());
		}
		else {
			System.out.println("Cliente não encontrado");
		}
	}

}
