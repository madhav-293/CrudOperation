import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ConnectionFactory{
    private static Connection connection=null;
    public static Connection getConnection(){

        if(connection==null){
            //To save the database credentials we have to put it in another file (sqlinjection)
            ResourceBundle resourceBundle=ResourceBundle.getBundle("dbConfig");
            String url=resourceBundle.getString("url");
            String uName=resourceBundle.getString("uName");
            String password=resourceBundle.getString("password");
            try {
                connection = DriverManager.getConnection(url, uName, password);
            }catch(SQLException e){
                throw new RuntimeException(e);

            }
        }
        return connection;
    }
}
//class generate{
//
//    Connection f1=ConnectionFactory.getConnection();
//}
