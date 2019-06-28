package anotada;

import anotacao.AnotacaoAtributo;
import anotacao.AnotacaoClasse;
import anotacao.AnotacaoMetodo;

@AnotacaoClasse("Esta � uma classe anotada")
public class ExemploAnotado {

	@AnotacaoAtributo("Este � um atributo anotado")
	private String exemploAtributoAnotado;
	
	@AnotacaoMetodo("Este � um m�todo anotado")
	public void exemploMetodoAnotado() {
		System.out.println("Qualquer coisa " + exemploAtributoAnotado);
	}
}
