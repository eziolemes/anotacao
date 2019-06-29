package extrator;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import anotacao.AnotacaoAtributo;
import anotacao.AnotacaoClasse;
import anotacao.AnotacaoMetodo;

public class ExtratorAnotacao {


	public void extrairMetaDados(Object t) throws ClassNotFoundException {

		Annotation anotacoesClasse[] = t.getClass().getAnnotations();

		for(Annotation ac : anotacoesClasse) {

			if(ac instanceof AnotacaoClasse) {
				System.out.println("* Anotação da classe: " + ((AnotacaoClasse) ac).value());
			} else {
				System.out.println("* Anotação da classe (tipo desconhecido)");
			}
		}

		Field atributos[] = t.getClass().getDeclaredFields();

		for(Field a : atributos) {

			System.out.println("Atributo: " + a.getName());

			Annotation anotacoesAtributo[] = a.getAnnotations();

			for(Annotation aa : anotacoesAtributo) {

				if(aa instanceof AnotacaoAtributo) {
					System.out.println("    * Anotação do atributo: ");
					System.out.println("          Column: " + ((AnotacaoAtributo) aa).name());
					System.out.println("          Type: " + ((AnotacaoAtributo) aa).type());
					System.out.println("          Precision: " + ((AnotacaoAtributo) aa).precision());
				} else {
					System.out.println("    * Anotação de atributo (tipo desconhecido)");
				}

			}

		}

		Method metodos[] = t.getClass().getDeclaredMethods();

		for(Method m : metodos) {
			System.out.println("método: " + m.getName());

			Annotation anotacoesMetodo[] = m.getAnnotations();

			for(Annotation mm : anotacoesMetodo) {

				if(mm instanceof AnotacaoMetodo) {
					System.out.println("    * Anotação do método: " + ((AnotacaoMetodo) mm).value());
				} else {
					System.out.println("    * Anotação do método (tipo desconhecido)");
				}

			}
		}

	}
}