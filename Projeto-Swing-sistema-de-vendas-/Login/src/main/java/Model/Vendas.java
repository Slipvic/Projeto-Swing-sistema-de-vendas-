package Model;

public class Vendas {

	public int id;
	String formaDePagamento;
	String dataVenda;
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

    /**
     *
     */
    public Vendas() {
		super();
	}
	public String Venda (String formaDePagamento, String dataVenda) {
		
		this.formaDePagamento = formaDePagamento;
		this.dataVenda = dataVenda;
                return null;
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
