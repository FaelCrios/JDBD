import java.sql.*;

class Insere {
    public static void main(String[] args){
        try {
        Class.forName("org.hsql.jdbcDriver");
        Connection connection = DriverManager.getConnection("jdbc:HypersonicSQL:hsql://localhost:8080", "sa", "");
        Statement statement= connection.createStatement();
        statement.executeUpdate("INSERT INTO CARTEIRA " + "VALUES ('RAFAEL', 16111111111,11111111111,111111111)");
        statement.executeUpdate("INSERT INTO CARTEIRA " + "VALUES ('SANDRO', 16222222222,22222222222,222222222)");
        statement.executeUpdate("INSERT INTO CARTEIRA " + "VALUES ('ANA', 16333333333,33333333333,333333333)");
        statement.executeUpdate("INSERT INTO CARTEIRA " + "VALUES ('LAURA', 16444444444,44444444444,444444444)");
        statement.close();
        connection.close();
    } catch (Exception error) {
        System.out.println(error);
    }
}
}