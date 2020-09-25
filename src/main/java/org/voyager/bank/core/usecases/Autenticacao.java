package org.voyager.bank.core.usecases;

import java.util.Properties;

import br.com.bradesco.core.usecases.autenticacao.Usuario;

/**
 * cASO DE USO DE AUTHENTICACAO 
 */
public interface Autenticacao {
	
	boolean isAutenticado(Usuario user);
	
	Properties getPermicoes(Usuario user);
	
}
