package Controller;

import Model.Cliente;
import Model.Vendas;

public class Controller {
	
	//Cliente
	public static boolean salvarCliente(String nome, String cpf, String email, String telefone, String sexo, String dataN,String estadoC) {
		Cliente obj = new Cliente();
		obj.setNome(nome);
		obj.setCpf(cpf);
		obj.setEmail(email);
		obj.setTelefone(telefone);
		obj.setSexo(sexo);
		obj.setDataNascimento(dataN);
		obj.setEstadoCivil(estadoC);
		
		
		return Cliente.info(obj);//retornar pra DAO, prioridade
		
	}
	
	public static boolean info2(String CEP, String Endereco, String Numero, String Compl, String Bairro1, String Cidade1, String Estado1) {
		Cliente obj = new Cliente();
		obj.setCEP(CEP);
		obj.setEndereco(Endereco);
		obj.setNumero(Numero);
		obj.setComplemento(Compl);
		obj.setBairro(Bairro1);
		obj.setCidade(Cidade1);
		obj.setEstado(Estado1);
		
		
		return Cliente.Info2(obj);
	}
	
	//Produto
	
	public static boolean dadosProduto(String Codigo, String Produto, String Quantidade, String valorC, String valorV, String Fornecedor) {
		Model.Produto obj = new Model.Produto();
		obj.setCodigo(Codigo);
		obj.setProduto(Produto);
		obj.setQuantidade(Quantidade);
		obj.setValorC(valorC);
		obj.setValorV(valorV);
		obj.setFornecedor(Fornecedor);
		
		
		return Model.Produto.dadosProduto(obj);
		
	}
	
	//Vendas
	
	public static boolean Venda(String formaDePagamento, String dataVenda) {
		Vendas obj = new Vendas();
		obj.setFormaDePagamento(formaDePagamento);
		obj.setDataVenda(dataVenda);
		
		return Vendas.Venda(obj);
		
	}
	
	//Vendedor
	public static boolean Vendedor(String usuario, String senha) {
		Model.Vendedor obj = new Model.Vendedor();
		obj.setUsuario(usuario);
		obj.setSenha(senha);
		
		
		return Model.Vendedor.Vendedor(obj);
		
	}
	

}
