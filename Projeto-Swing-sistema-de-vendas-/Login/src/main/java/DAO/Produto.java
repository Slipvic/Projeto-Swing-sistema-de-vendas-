
package DAO;




public class Produto {

    public int Codigo;
    public String Produto;
    public int Quantidade;
    public double valorC;
    public double valorV;
    public String Fornecedor;
    
        public void dadosProduto(String Codigo, String Produto, String Quantidade, String valorC, String valorV, String Fornecedor){
           this.Codigo = Integer.parseInt(Codigo);
           this.Produto = Produto;
           this.Quantidade = Integer.parseInt(Quantidade);
           this.valorC = Double.parseDouble(valorC);
           this.valorV = Double.parseDouble(valorV);
           this.Fornecedor = Fornecedor;
        }
}

