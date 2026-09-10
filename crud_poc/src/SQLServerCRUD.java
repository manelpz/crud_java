import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SQLServerCRUD {
private static final String JDBC_URL =
    "jdbc:sqlserver://iberopoo.database.windows.net:1433;" +
    "database=atm;" +
    "encrypt=true;" +
    "trustServerCertificate=false;" +
    "hostNameInCertificate=*.database.windows.net;" +
    "loginTimeout=30;";

private static final String USERNAME = "adminibero@iberopoo";
private static final String PASSWORD = "3a8ba5cc#";

    public void readCustomer() {

        try {

            Connection var1 = DriverManager.getConnection(
                JDBC_URL,
                USERNAME,
                PASSWORD
            );

            String querySelect = "SELECT * FROM Customers";

            PreparedStatement var3 =
                var1.prepareStatement(querySelect);

            ResultSet var4 = var3.executeQuery();

            while (var4.next()) {

                System.out.println(
                    var4.getInt("id") + " " +
                    var4.getString("firstName") + " " +
                    var4.getString("lastName") + " " +
                    var4.getInt("age")
                );
            }

        } catch (SQLException e) {

            System.out.println(
                "Hubo un error en la conexión: " + e
            );
        }
    }
}