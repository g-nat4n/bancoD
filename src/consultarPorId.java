import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/* class consultarPorId (int id){
    String sql = "SELECT * FROM produtos WHERE id_produto= ?";
    try(PreparedStatement stmt = CONEXAO_DB.prepareStatement(sql)){
       stmt.setInt(1, id);
       try(ResultSet rs = stmt.executeQuery()){
           if (rs.next()){
               Produto produto = new Produto();
               produto.setId(rs.getInt("id_produto"));
               produto.setNome(rs.getString("nome_produto"));
               produto.setQuantidade(rs.getInt("quantidade"));
               produto.setStatus(rs.getString("status"));
               return produto;
           }
       }
    }catch (SQLException e){
        System.out.println("Erro ap consulat produto por ");
    }
}
*/