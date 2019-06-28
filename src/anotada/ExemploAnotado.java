package anotada;

import anotacao.AnotacaoAtributo;
import anotacao.AnotacaoClasse;
import anotacao.AnotacaoMetodo;

@AnotacaoClasse("Esta é uma classe anotada")
public class ExemploAnotado {

	@AnotacaoAtributo("Este é um atributo anotado")
	private String exemploAtributoAnotado;
	
	@AnotacaoMetodo("Este é um método anotado")
	public void exemploMetodoAnotado() {
		System.out.println("Qualquer coisa " + exemploAtributoAnotado);
	}
}
