package br.com.leandro.dev.models;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Processo {


	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String processoNome;
	

	@Enumerated(EnumType.STRING)
	private NaturezaDoProcesso naturezaProcesso;
	
	public NaturezaDoProcesso getNaturezaProcesso() {
		return naturezaProcesso;
	}

	public void setNaturezaProcesso(NaturezaDoProcesso naturezaProcesso) {
		this.naturezaProcesso = naturezaProcesso;
	}

	public String getProcessoNome() {
		return processoNome;
	}

	public void setProcessoNome(String processoNome) {
		this.processoNome = processoNome;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Processo [id=" + id + ", processoNome=" + processoNome + ", naturezaProcesso=" + naturezaProcesso + "]";
	}

	
}

	
	

