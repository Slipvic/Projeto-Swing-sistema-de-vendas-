package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Model.Produto;

public class ProdutoDAO {
	@SuppressWarnings("finally")
	public static boolean dadosProduto(Produto p) {
		boolean retorno = false;
		Connection conexao = null;
		PreparedStatement instrucaoSQL = null;
		
		try {
			conexao = GerenciadorConexao.Conexao.abreConexao();
			instrucaoSQL = conexao.prepareStatement("INSERT INTO Produto (Codigo, Nome, Quantidade, Valor_Compra, ValorVenda, Fornecedor) VALUES(?,?,?,?,?,?)" , Statement.RETURN_GENERATED_KEYS);
			
			instrucaoSQL.setInt(1, p.getCodigo());
			instrucaoSQL.setString(2, p.getProduto());
			instrucaoSQL.setInt(3, p.getQuantidade());
			instrucaoSQL.setDouble(4, p.getValorC());
			instrucaoSQL.setDouble(5, p.getValorV());
			instrucaoSQL.setString(6, p.getFornecedor());
			
			int linhasAfetadas = instrucaoSQL.executeUpdate();
			
			if(linhasAfetadas>0)
			{
				retorno = true;
				ResultSet generatedKeys = instrucaoSQL.getGeneratedKeys(); //Recupero o ID do cliente
			if (generatedKeys.next()) {
				p.setId(generatedKeys.getInt(1));
			}else 
			{
			throw new SQLException("Falha ao obter o ID do cliente!");
			}
			}else{
			retorno = false;
			}			
		}
		catch (SQLException  ex) {
			System.out.println(ex.getMessage());
			retorno = false;
		}
		 
		finally {
			try {
				if(instrucaoSQL !=null) {
					instrucaoSQL.close();
					GerenciadorConexao.Conexao.fechaConexao(conexao);
				} 
		
			}catch (SQLException ex) {
				
			}
			return retorno;
		}
	}
	
}
