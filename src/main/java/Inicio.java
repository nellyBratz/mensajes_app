import java.sql.Connection;

public class Inicio {
    public static void main(String[] args) {
        Conexion connection = new Conexion();
        try (Connection cnx = connection.get_connection()) {

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
