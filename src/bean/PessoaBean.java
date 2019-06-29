package bean;

import anotacao.AnotacaoAtributo;
import anotacao.AnotacaoClasse;

@AnotacaoClasse("PESSOA")
public class PessoaBean{

	@AnotacaoAtributo(name="ID_PESSOA", type="INTEGER", precision=11)
	private Integer id;
	
	@AnotacaoAtributo(name="NOME", type="VARCHAR", precision=50)
	private String nome;
	
	@AnotacaoAtributo(name="ENDERECO", type="VARCHAR", precision=100)
	private String endereco;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}
