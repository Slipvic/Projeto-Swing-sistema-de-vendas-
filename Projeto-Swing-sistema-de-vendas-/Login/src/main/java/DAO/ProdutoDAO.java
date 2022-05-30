package DAO;

import GerenciadorConexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Model.Produto;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProdutoDAO {
	
	/**
	 * @see Controller.Controller, Model.Produto
	 * @param p parâmetro do tipo Produto
	 * @return Insere um dado produto no banco de dados
	 */
	@SuppressWarnings("finally")
	public static boolean dadosProduto(Produto p) {
		boolean retorno = false;
		Connection conexao = null;
		PreparedStatement instrucaoSQL = null;
		
		try {
			conexao = GerenciadorConexao.Conexao.abreConexao();
			instrucaoSQL = conexao.prepareStatement("INSERT INTO Produto (Codigo, Nome, Quantidade, Valor_Compra, Valor_Venda, Fornecedor) VALUES(?,?,?,?,?,?)" , Statement.RETURN_GENERATED_KEYS);
			
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
	/**
	 * 
	 * @param codigo
	 * @return permite pesquisar um dado produto através do seu código
	 */
        public static List<Produto> pesquisarCod(int codigo) {

        Connection conexao = Conexao.abreConexao();
        PreparedStatement comando;
        ResultSet rs = null;

        List< Produto> farmacos = new ArrayList();

        try {
            comando = conexao.prepareStatement("SELECT * FROM produtos WHERE id_produto = ?");
            
            comando.setInt(1, codigo);
            
            rs = comando.executeQuery();

            while (rs.next()) {
                Produto farmaco = new Produto();
                farmaco.setCodigo(rs.getInt("Codigo Produto"));
                farmaco.setProduto(rs.getString("Nome"));
                farmaco.setQuantidade(rs.getInt("Estoque"));
                farmaco.setValorC(rs.getInt("Valor"));
                farmaco.setValorV(rs.getInt("Revenda"));
                farmaco.setFornecedor(rs.getString("Fornecedor"));
                
                farmacos.add(farmaco);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (rs != null)
                try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return farmacos;

    }
	
}
