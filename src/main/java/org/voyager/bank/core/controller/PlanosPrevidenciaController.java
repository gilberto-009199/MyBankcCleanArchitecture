package org.voyager.bank.core.controller;

import javax.sound.midi.ControllerEventListener;

import br.com.bradesco.core.domain.PlanoPrevidenciaDAO;
import br.com.bradesco.core.usecases.plano.PlanoPrevidenciaRepository;


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
