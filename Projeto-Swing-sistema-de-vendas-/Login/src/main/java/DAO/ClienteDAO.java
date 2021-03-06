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
			
			instrucaoSQL.setString(1, p.getCEP());
			instrucaoSQL.setString(2, p.getEndereco());
			instrucaoSQL.setString(3, p.getNumero());
			instrucaoSQL.setString(4, p.getComplemento());
			instrucaoSQL.setString(5, p.getBairro());
			instrucaoSQL.setString(6, p.getCidade());
			instrucaoSQL.setString(7, p.getEstado());
			
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
			instrucaoSQL.setString(2, p.getCpf());
			instrucaoSQL.setString(3, p.getEmail());
			instrucaoSQL.setString(4, p.getTelefone());
			instrucaoSQL.setString(5, p.getSexo());
			instrucaoSQL.setString(6, p.getDataNascimento());
			instrucaoSQL.setString(7, p.getEstadoCivil());
			
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