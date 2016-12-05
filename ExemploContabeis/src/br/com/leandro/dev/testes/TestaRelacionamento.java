package br.com.leandro.dev.testes;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.EntityManager;

import br.com.leandro.dev.models.Conta;
import br.com.leandro.dev.models.Movimentacao;
import br.com.leandro.dev.models.TipoMovimentacao;
import br.com.leandro.dev.util.JPAUtil;

public class TestaRelacionamento {
	
	public static void main(String[] args) {

	      Conta conta = new Conta();
	      conta.setTitular("Marilia Santos");
	      conta.setBanco("Banrisul");
	      conta.setNumero("5555");
	      conta.setAgencia("456");

	      Movimentacao movimentacao = new Movimentacao();
	      movimentacao.setData(Calendar.getInstance());
	      movimentacao.setDescricao("Pagamento Serviço");
	      movimentacao.setTipoMovimentacao(TipoMovimentacao.ENTRADA);
	      movimentacao.setValor(new BigDecimal("80.5"));

	      movimentacao.setConta(conta);

	      EntityManager manager = new JPAUtil().getEntityManager();
	      manager.getTransaction().begin();

	      manager.persist(conta);
	      manager.persist(movimentacao);

	      manager.getTransaction().commit();
	      manager.close();
	   }

}
