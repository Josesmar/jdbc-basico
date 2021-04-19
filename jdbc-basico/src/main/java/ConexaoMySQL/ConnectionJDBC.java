//Essa classe foi utlizada apenas para testar a conexão com o banco de dados mysql
////package ConexaoMySQL;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
//public class ConnectionJDBC {
//
//    public static void main(String[] args) {
//
//
//
//        //Construção da string de conexão.
//        StringBuilder sb = new StringBuilder("jdbc:")
//                .append(driver).append("://")
//                .append(dataBaseAddress).append("/")
//                .append(dataBaseName);
//
//        String connectionUrl = sb.toString(); //sb.toString() == "jdbc:mysql://localhost/digital_innovation_one"
//        //Carregar a classe específica de implementação do driver na memória da JVM. (A partir da versão JDBC 4 não é mais necessário!!!)
//        //Class.forName("com.mysql.jdbc.Driver");
//        // 4 - Criar conexão usando o DriverManager, passando como parâmetros a string de conexão, usuário e senha do usuário.
//        try (Connection conn = DriverManager.getConnection(connectionUrl, user, password)) {
//            System.out.println("SUCESSO ao se conectar ao banco MySQL!");
//        } catch (SQLException e) {
//            System.out.println("FALHA ao se conectar ao banco MySQL!");
//            e.printStackTrace();
//        }
//    }
//}
