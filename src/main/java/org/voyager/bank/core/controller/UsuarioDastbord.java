package org.voyager.bank.core.controller;

import java.util.Properties;

import org.voyager.bank.core.usecases.Autenticacao;
import org.voyager.bank.core.usecases.autenticacao.Usuario;

public class UsuarioDastbord {
	
	private Autenticacao auth;
	
	public UsuarioDastbord(){ this.auth = new AutenticacaoImpl()}
	
	@Web("/dashtbord")
	public template index(Requisicao req, Response res){
		
		Usuario user = getUser();
		
		
		if( req.getForm("login").isExists() )this.auth.autenticarUsuario(user);
		
		if( auth.isAutenticado(user) )return new template("login");
		
		
		
		return new template("dastbord");
		
	}
	
	

	private Usuario getUser() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
