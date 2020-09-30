package org.voyager.bank.core.controller;

import javax.sound.midi.ControllerEventListener;
import javax.xml.transform.Templates;

import org.voyager.bank.core.domain.dao.PlanoPrevidenciaDAO;
import org.voyager.bank.core.usecases.plano.PlanoPrevidenciaRepository;


/* Pode estar em escopo de aplicacao para conservar  */
public class PlanosPrevidenciaController {
	
	private static PlanosPrevidenciaController controller;
	
	private PlanoPrevidenciaRepository repository;
	
	
	
	
	
	
	
	
	
	
	
	
	// Construtor privado
	private PlanosPrevidenciaController() { repository = new PlanoPrevidenciaDAO();	}
		
	public static PlanosPrevidenciaController getInstance(){
		if(controller == null)controller = new PlanosPrevidenciaController();
		
		return controller;
	}
	
}
