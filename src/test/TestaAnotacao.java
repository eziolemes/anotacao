package test;

import bean.PessoaBean;
import bean.ProdutoBean;
import extrator.ExtratorAnotacao;

public class TestaAnotacao {
	
	public static void main(String[] args) {
		
		ExtratorAnotacao e = new ExtratorAnotacao();
		
		try {
			
			PessoaBean p = new PessoaBean();
			
			e.extrairMetaDados(p);
			
			System.out.println("----------------------");
			
			ProdutoBean produto = new ProdutoBean();
			
			e.extrairMetaDados(produto);
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

}