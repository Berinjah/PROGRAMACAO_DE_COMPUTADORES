package conex�o;

//importa o necess�rio para o java trabalhar com sql
import java.sql.*;

public class ConexaoComSQLServer {

	public static void main(String args[]) {
		
		//string de conex�o com o banco de dados SQL Server, conecta no localhost atraves da porta 1433
		//no banco de dados vazio nomeado "bancoTeste"
		String connectionUrl = "jdbc:sqlserver://localhost:1433;" + "databaseName=bancoTeste;";
		
		try {
			//intancia uma classe que est� no driver que foi baixado para efetuar a conex�o
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
			
			//faz a conex�o, "sa" � o usuario e "123456" a senha de logon
			Connection conn = DriverManager.getConnection(connectionUrl, "sa", "123456");
			
			//se tudo ocorrer normalmente a mensagem abaixo � retornada, se n�o ele vai para o catch
			System.out.println("Conex�o obtida com sucesso!");
		}
		catch (SQLException ex) {//se algo n�o ocorrer bem o programa executa o catch
			//retorna a mensagem de erro
			System.out.println("SQLException: " + ex.getMessage());
			//retorna o estado do sql
			System.out.println("SQLState: " + ex.getSQLState());
			//retorna o c�digo de erro
			System.out.println("VendorError: " + ex.getErrorCode());
		}
		catch (Exception e) {
			System.out.println("N�o foi poss�vel conectar ao banco" + e);
		}
	}
}
