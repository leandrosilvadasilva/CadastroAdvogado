package br.com.leandro.dev.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.leandro.dev.daos.ProcessoDAO;
import br.com.leandro.dev.models.NaturezaDoProcesso;
import br.com.leandro.dev.models.Processo;
import br.com.leandro.dev.validation.ProcessoValidation;

@Controller
@RequestMapping("processo" )
public class ProcessoController {

	@Autowired
	private ProcessoDAO processoDao;
	
	@InitBinder
	public void InitBinder(WebDataBinder binder){
		binder.addValidators(new ProcessoValidation());
	}
	
	@RequestMapping("/CadastroProcesso")
	public ModelAndView cadProcessos(){
		ModelAndView modelAndView = new ModelAndView("processo/formCadProcesso");
		modelAndView.addObject("naturezaProcesso", NaturezaDoProcesso.values());
		
		return modelAndView;
	}
	
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView grava(@Valid Processo processo, BindingResult result,
			RedirectAttributes redirectAttributes){
		
		System.out.println(processo);
		
		
		// FAZER VALIDAÇÃO: 
		if (result.hasErrors()) {
			return cadProcessos();
		}
				
		processoDao.grava(processo);
				
		//redireciona num escopo pequeno
		redirectAttributes.addFlashAttribute("sucesso", "Processo cadastrado com sucesso");
		
		//fazer um redirect (302) Always redirect after post
		return new ModelAndView("redirect:processo");
		
		
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView listar(){
		List<Processo> processos = processoDao.listar();
		ModelAndView modelAndView = new ModelAndView("processo/listaprocesso");
		modelAndView.addObject("processos", processos);
		
		
		return	modelAndView;
	}
}

