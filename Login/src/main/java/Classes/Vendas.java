package Classes;

public class Vendas {

    String formaDePagamento;
    String dataVenda;

    public Venda() {
		super();
	}
	public Venda(String formaDePagamento, String dataVenda) {
		super();
		this.formaDePagamento = formaDePagamento;
		this.dataVenda = dataVenda;
	}
	public String getFormaDePagamento() {
		return formaDePagamento;
	}
	public void setFormaDePagamento(String formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}
	public String getDataVenda() {
		return dataVenda;
	}
	public void setDataVenda(String dataVenda) {
		this.dataVenda = dataVenda;
	}

}
