import java.sql.*;


class Select {
public static void main(String[] args){
    try{
        Class.forName("org.hsql.jdbcDriver");
        Connection connection = DriverManager.getConnection("jdbc:HypersonicSQL:hsql://localhost:8080", "sa", "");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM CARTEIRA");
        while(resultSet.next()){
            String nome = resultSet.getString("NOME");
            float telefone = resultSet.getFloat("TELEFONE");
            float cpf = resultSet.getFloat("CPF");
            float rg = resultSet.getFloat("RG");
            System.out.println(nome+telefone+cpf+rg);
        }
        statement.close();
        connection.close();
    }catch(Exception error){
        System.out.println(error);
    }
}    
}
