package com.trusthub.avaliacao.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.trusthub.avaliacao.model.Dados;
import com.trusthub.avaliacao.repository.DadosRepository;

@Controller
public class CadastroController {

	@Autowired
	private DadosRepository dadosRep;
	
	
	private Logger log = LoggerFactory.getLogger(CadastroController.class);
	
	
	@RequestMapping(value="/", method=RequestMethod.GET, produces="application/json")
	public @ResponseBody Iterable<Dados> listarDadosCadastrados() {
		log.info("CadastroController:listarDadosCadastrados()");
		return dadosRep.findAll();
	}
	
	
	
	@RequestMapping(value="/cadastrar", method=RequestMethod.POST, produces="application/json")
	public @ResponseBody void cadastrar(@RequestBody @Valid Dados dados) {

		log.info("CadastroController:cadastrar()");
		dadosRep.save(dados);
	}
}
