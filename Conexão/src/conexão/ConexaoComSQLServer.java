package conexão;

//importa o necessário para o java trabalhar com sql
import java.sql.*;

public class ConexaoComSQLServer {

	public static void main(String args[]) {
		
		//string de conexão com o banco de dados SQL Server, conecta no localhost atraves da porta 1433
		//no banco de dados vazio nomeado "bancoTeste"
		String connectionUrl = "jdbc:sqlserver://localhost:1433;" + "databaseName=bancoTeste;";
		
		try {
			//intancia uma classe que está no driver que foi baixado para efetuar a conexão
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
			
			//faz a conexão, "sa" é o usuario e "123456" a senha de logon
			Connection conn = DriverManager.getConnection(connectionUrl, "sa", "123456");
			
			//se tudo ocorrer normalmente a mensagem abaixo é retornada, se não ele vai para o catch
			System.out.println("Conexão obtida com sucesso!");
		}
		catch (SQLException ex) {//se algo não ocorrer bem o programa executa o catch
			//retorna a mensagem de erro
			System.out.println("SQLException: " + ex.getMessage());
			//retorna o estado do sql
			System.out.println("SQLState: " + ex.getSQLState());
			//retorna o código de erro
			System.out.println("VendorError: " + ex.getErrorCode());
		}
		catch (Exception e) {
			System.out.println("Não foi possível conectar ao banco" + e);
		}
	}
}
