
package Model;




public class Produto {
    
public String id;
public String Codigo;
public String Produto;
public String Quantidade;
public String valorC;
public String valorV;
public String Fornecedor;


        public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

        public void setCodigo(String codigo) {
		Codigo = codigo;
	}
        public String getCodigo() {
		return Codigo;
	}

	public void setProduto(String produto) {
		Produto = produto;
	}

	public void setQuantidade(String quantidade) {
		Quantidade = quantidade;
	}

	public void setValorC(String valorC) {
		this.valorC = valorC;
	}

	public void setValorV(String valorV) {
		this.valorV = valorV;
	}
        
	public String getProduto() {
		return Produto;
	}

	public String getQuantidade() {
		return Quantidade;
	}

	public String getValorC() {
		return valorC;
	}

	public String getValorV() {
		return valorV;
	}

	public String getFornecedor() {
		return Fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		Fornecedor = fornecedor;
	}
    
        public void dadosProduto(String Codigo, String Produto, String Quantidade, String valorC, String valorV, String Fornecedor){
           this.Codigo = Codigo;
           this.Produto = Produto;
           this.Quantidade = Quantidade;
           this.valorC = valorC;
           this.valorV = valorV;
           this.Fornecedor = Fornecedor;
        }
}

