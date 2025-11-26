import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {

        try(Connection conexao = ConexaoDB.conectar();
        Statement stmt = conexao.createStatement()){

            String comandoSql = "CREATE TABLE produtos (" +
                    "id_produto INTEGER PRIMARY KEY, " +
                    "nome_produto TEXT NOT NULL," +
                    "quantidade INTEGER, " +
                    "preco REAL," +
                    "status TEXT" +
                    ");";

            System.out.println(comandoSql);

            // execute o comando SQL
            stmt.execute(comandoSql);

            System.out.println("Tabela 'Produto' crida com sucesso!");

        }catch (SQLException e){
            System.out.println("ERRO ao criar a tabela" + e.getMessage());
            e.printStackTrace();
        }
    }
}