package bean;

import anotacao.AnotacaoAtributo;
import anotacao.AnotacaoClasse;

@AnotacaoClasse("PRODUTO")
public class ProdutoBean {

	@AnotacaoAtributo(name="ID", type="INTEGER", precision=11)
	private Integer id;

	@AnotacaoAtributo(name="DESCRICAO", type = "VARCHAR", precision=50)
	private String descricao;
	
	@AnotacaoAtributo(name="MARCA", type="VARCHAR", precision=50)
	private String marca;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
}