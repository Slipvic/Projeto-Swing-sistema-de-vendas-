package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Controller.Controller;
import Model.Cliente;

public class ClienteDAO {
	/**
	 * @see Controller.Controller, Model.Cliente
	 * @param p objeto do tipo Cliente
	 * @return Retorna instruções de criação da localização do cliente para o banco de dados
	 */
	
	@SuppressWarnings("finally")
	public static boolean info2 (Cliente p) {
		boolean retorno = false;
		Connection conexao = null;
		PreparedStatement instrucaoSQL = null;
		
		try {
			conexao = GerenciadorConexao.Conexao.abreConexao();
			instrucaoSQL = conexao.prepareStatement("INSERT INTO Cliente (Cep, Endereco, Numero, Complemento, Bairro, Cidade, Estado) VALUES(?,?,?,?,?,?,?)" , Statement.RETURN_GENERATED_KEYS);
			
			instrucaoSQL.setInt(10, p.getCEP());
			instrucaoSQL.setString(4, p.getEndereco());
			instrucaoSQL.setInt(11, p.getNumero());
			instrucaoSQL.setString(12, p.getComplemento());
			instrucaoSQL.setString(13, p.getBairro());
			instrucaoSQL.setString(14, p.getCidade());
			instrucaoSQL.setString(15, p.getEstado());
			
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
	
	/**
	 * @see Controller.Controller, Model.Cliente
	 * @param p Objeto do tipo Cliente
	 * @return Retorna instruções de criação do cliente para o banco de dados
	 */
	@SuppressWarnings("finally")
	public static boolean info (Cliente p) {
		boolean retorno = false;
		Connection conexao = null;
		PreparedStatement instrucaoSQL = null;
		
		try {
			conexao = GerenciadorConexao.Conexao.abreConexao();
			instrucaoSQL = conexao.prepareStatement("INSERT INTO Cliente (Nome, Cpf, E_mail, Telefone, Sexo, Data_de_Nascimento, Estado_Civil) VALUES(?,?,?,?,?,?,?)" , Statement.RETURN_GENERATED_KEYS);
			
			instrucaoSQL.setString(1, p.getNome());
			instrucaoSQL.setInt(2, p.getCpf());
			instrucaoSQL.setString(5, p.getEmail());
			instrucaoSQL.setInt(3, p.getTelefone());
			instrucaoSQL.setString(6, p.getSexo());
			instrucaoSQL.setString(7, p.getDataNascimento());
			instrucaoSQL.setString(8, p.getEstadoCivil());
			
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