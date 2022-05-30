
package Model;




public class Produto {
    
public int id;
public int Codigo;
public String Produto;
public int Quantidade;
public double valorC;
public double valorV;
public String Fornecedor;


        public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

        public void setCodigo(int codigo) {
		Codigo = codigo;
	}
        public int getCodigo() {
		return Codigo;
	}

	public void setProduto(String produto) {
		Produto = produto;
	}

	public void setQuantidade(int quantidade) {
		Quantidade = quantidade;
	}

	public void setValorC(double valorC) {
		this.valorC = valorC;
	}

	public void setValorV(double valorV) {
		this.valorV = valorV;
	}
        
	public String getProduto() {
		return Produto;
	}

	public int getQuantidade() {
		return Quantidade;
	}

	public double getValorC() {
		return valorC;
	}

	public double getValorV() {
		return valorV;
	}

	public String getFornecedor() {
		return Fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		Fornecedor = fornecedor;
	}
    
        public void dadosProduto(String Codigo, String Produto, String Quantidade, String valorC, String valorV, String Fornecedor){
           this.Codigo = Integer.parseInt(Codigo);
           this.Produto = Produto;
           this.Quantidade = Integer.parseInt(Quantidade);
           this.valorC = Double.parseDouble(valorC);
           this.valorV = Double.parseDouble(valorV);
           this.Fornecedor = Fornecedor;
        }
}

