import java.sql.*;

public class Cria {
  public static void main(String[] args) {
    try {
      Class.forName("org.hsql.jdbcDriver");
      Connection connection = DriverManager.getConnection("jdbc:HypersonicSQL:hsql://localhost:8080", "sa", "");
      Statement statement = connection.createStatement();
      statement.executeUpdate("CREATE TABLE CARTEIRA (NOME VARCHAR(30), TELEFONE FLOAT(12), CPF FLOAT(12), RG FLOAT(10))");
      statement.close();
      connection.close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
