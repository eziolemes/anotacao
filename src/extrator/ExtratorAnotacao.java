package extrator;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import anotacao.AnotacaoAtributo;
import anotacao.AnotacaoClasse;
import anotacao.AnotacaoMetodo;
import anotada.ExemploAnotado;

public class ExtratorAnotacao {

	
	public static void main(String[] args) {
		
		Annotation anotacoesClasse[] = ExemploAnotado.class.getAnnotations();
		
		for(Annotation ac : anotacoesClasse) {
			
			if(ac instanceof AnotacaoClasse) {
				System.out.println("* Anota��o da classe: " + ((AnotacaoClasse) ac).value());
			} else {
				System.out.println("* Anota��o da classe (tipo desconhecido)");
			}
		}
		
		Field atributos[] = ExemploAnotado.class.getDeclaredFields();
		
		for(Field a : atributos) {
			
			System.out.println("Atributo: " + a.getName());
			
			Annotation anotacoesAtributo[] = a.getAnnotations();
			
			for(Annotation aa : anotacoesAtributo) {
				
				if(aa instanceof AnotacaoAtributo) {
					System.out.println("    * Anota��o do atributo: " + ((AnotacaoAtributo) aa).value());
				} else {
					System.out.println("    * Anota��o de atributo (tipo desconhecido)");
				}
					
			}
			
		}
		
		Method metodos[] = ExemploAnotado.class.getDeclaredMethods();
		
		for(Method m : metodos) {
			System.out.println("M�todo: " + m.getName());
			
			Annotation anotacoesMetodo[] = m.getAnnotations();
			
			for(Annotation mm : anotacoesMetodo) {
				
				if(mm instanceof AnotacaoMetodo) {
					System.out.println("    * Anota��o do m�todo: " + ((AnotacaoMetodo) mm).value());
				} else {
					System.out.println("    * Anota��o do m�todo (tipo desconhecido)");
				}
				
			}
		}
		
	}
}