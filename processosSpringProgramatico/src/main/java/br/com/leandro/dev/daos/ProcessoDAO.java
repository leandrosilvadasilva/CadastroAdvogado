package br.com.leandro.dev.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.leandro.dev.models.Processo;

@Repository
@Transactional
public class ProcessoDAO {

	@PersistenceContext
	private EntityManager manager;
	
	
	public void grava(Processo processo){
		manager.persist(processo);
				
	}


	public List<Processo> listar() {
		
		return manager.createQuery("select c from Processo c", Processo.class).getResultList();
	}
}
