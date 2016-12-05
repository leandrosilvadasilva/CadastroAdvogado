package br.com.leandro.dev.testes;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.EntityManager;

import br.com.leandro.dev.models.Conta;
import br.com.leandro.dev.models.Movimentacao;
import br.com.leandro.dev.models.TipoMovimentacao;
import br.com.leandro.dev.util.JPAUtil;

public class TesteMovimentacao {

public static void main(String[] args) {
	
		
		
		EntityManager em = new JPAUtil().getEntityManager();
	
//		Conta conta = new Conta();
//		conta.setTitular("Leandro");
//		conta.setBanco("BB");
//		conta.setAgencia("Daqui");
//		conta.setNumero("9999");

		Movimentacao movimentacao = new Movimentacao();
		movimentacao.setData(Calendar.getInstance());
		movimentacao.setDescricao("conta Unimed");
		movimentacao.setTipoMovimentacao(TipoMovimentacao.SAIDA);
		movimentacao.setValor(new BigDecimal("323.12"));
		
		
		em.getTransaction().begin();
		em.persist(movimentacao);
		em.getTransaction().commit();
		//em.close();

	}
}
