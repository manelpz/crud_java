public class App {
    public static void main(String[] args) throws Exception {
        

        
        MySQLCRUD conn = new MySQLCRUD();

        System.out.println("\n===== leer clientes =====");
        conn.readCustomer();


    }
}
