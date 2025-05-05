package tratamentoExecoes;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class conexaoDB {

	public static void main(String[] args) {
		try {
			conectarBanco();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void conectarBanco() throws SQLException {
		
		String url = "jdbc:mysql://localhost:3306/sistema";
		String usuario = "root";
		String senha = "";
		
		Connection conexao = DriverManager.getConnection(url, usuario, senha);
		
		System.out.println("Conexão com o banco estabelecida");
		
		String sql = "INSERT INTO usuario(NOME, EMAIL, SENHA) VALUES (?,?,?)";
		
		PreparedStatement consQuery = conexao.prepareStatement(sql);
		consQuery.setString(1 , "Thammy");
		consQuery.setString(2 , "Thammy@gmail.com");
		consQuery.setString(3 , "5678");
		
		//Executar o comando
		consQuery.execute();
		
		//Encerra a Conexão
		consQuery.close();
		conexao.close();
		
	}

}
