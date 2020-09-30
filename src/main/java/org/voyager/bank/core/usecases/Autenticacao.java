package org.voyager.bank.core.usecases;

import java.util.Properties;

import org.voyager.bank.core.usecases.autenticacao.Usuario;


/**
 * CASO DE USO DE AUTHENTICACAO 
 */
public interface Autenticacao {
	
	boolean isAutenticado(Usuario user);
	
	Properties getPermicoes(Usuario user);
	
	boolean autenticarUsuario(Usuario user);
	
}
