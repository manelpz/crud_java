import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MySqlCRUD{


    //read trae info de la bd

    public void readCustomer(){

        try {
            Connection  var1 = DriverManager.getConnection("");
            try {
                String querySelect = "select * from customers";
                PreparedStatement var3 = var1.prepareStatement(querySelect);
                ResultSet var4 = var3.executeQuery();

            } catch (SQlException e) {
              System.out.println("hubo un error en la conexion :" +e);
            }

        } catch (SQLException e) {
            System.out.println("hubo un error en la conexion :" +e);
           
        }

    }
}