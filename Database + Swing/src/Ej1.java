import org.mariadb.jdbc.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ej1 {

            //INICIAR---------
    public void iniciar_conexion(){

        String userName = "root";
        String password = "root";
        String url = "jdbc:mariadb://localhost:3306/test_gorka";
        Connection connection = null;
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            connection = DriverManager.getConnection(url,userName,password);
            System.out.println("Conexion establecida");
            System.out.print("");




        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }



    //CERRAR------------

    public void Cerrar_conexion() {

        try{

            if(connection!=null){

                connection.close();
                System.out.print("\n");
                System.out.println("Conexion cerrada");
            }
        }catch (Exception e){

        }



    }

    public static void main(String[] args) {
        Ej1 aaaa= new Ej1();

        aaaa.iniciar_conexion();

    }
}
