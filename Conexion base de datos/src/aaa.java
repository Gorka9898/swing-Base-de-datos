import org.mariadb.jdbc.Statement;

import javax.crypto.Cipher;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;



public class aaa {
    public static void main(String[] args) {
        aaa p1 = new aaa();

        p1.conexion_db();

        p1.StudentList();

        p1.RemoveStudent(5);

        p1.StudentList();

        p1.añadir(20,"Gorka", "Larrañaga", "Azpeitia", 688743145, "8/04/2002");



    }
    public void conexion_db(){
        String userName = "root";
        String password = "root";
        String url = "jdbc:mariadb://localhost:3306/test_gorka";
        Connection connection = null;
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            connection = DriverManager.getConnection(url,userName,password);
            System.out.println("Conexion establecida");
            System.out.print("");


            String sql= "select * from Students";

            Statement st= (Statement) connection.createStatement( );
            ResultSet result = st.executeQuery(sql);

            while(result.next()){
                String id =result.getString("id");
                System.out.print(id + "\n");
            }




        if(connection!=null){

                connection.close();
            System.out.print("\n");
            System.out.println("Conexion cerrada");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    //---------------StudentList-------------

    public void StudentList()  {
        String userName = "root";
        String password = "root";
        String url = "jdbc:mariadb://localhost:3306/test_gorka";
        Connection connection = null;
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            connection = DriverManager.getConnection(url,userName,password);
            System.out.println("Conexion establecida");
            System.out.print("");


            String sql= "select * from Students";

            Statement st= (Statement) connection.createStatement( );
            ResultSet result = st.executeQuery(sql);

            while(result.next()){
                String id =result.getString("id");
                String Name =result.getString("Name");
                String Surname =result.getString("Surname");


                System.out.print(id);
                System.out.print(" ");
                System.out.print(Name);
                System.out.print(" ");
                System.out.print(Surname);
                System.out.print("\n");
            }




            if(connection!=null){

                connection.close();
                System.out.print("\n");
                System.out.println("Conexion cerrada");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    //---------------RemoveStudent-------------

    public void RemoveStudent(int num)  {
        String userName = "root";
        String password = "root";
        String url = "jdbc:mariadb://localhost:3306/test_gorka";
        Connection connection = null;
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            connection = DriverManager.getConnection(url,userName,password);
            System.out.println("Conexion establecida");
            System.out.print("");


            String sql= "select * from Students";

            Statement st= (Statement) connection.createStatement( );
            ResultSet result = st.executeQuery(sql);

            while(result.next()){
                String id =result.getString("id");
                String Name =result.getString("Name");
                String Surname =result.getString("Surname");


                System.out.print(id);
                System.out.print(" ");
                System.out.print(Name);
                System.out.print(" ");
                System.out.print(Surname);
                System.out.print("\n");
            }
            try {
                String sql2 = "delete from Students where id =" + num;

                Statement st2 = (Statement) connection.createStatement();
                ResultSet result2 = st.executeQuery(sql2);
            }catch(Exception e){
                System.out.print("Error");
            }


            if(connection!=null){

                connection.close();
                System.out.print("\n");
                System.out.println("Conexion cerrada");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }



    //---------------AddeStudent-------------

    public void añadir(int id2, String Name2, String Surname2, String city2, int Phone2, String Date2)  {


        String userName = "root";
        String password = "root";
        String url = "jdbc:mariadb://localhost:3306/test_gorka";
        Connection connection = null;
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            connection = DriverManager.getConnection(url,userName,password);
            System.out.println("Conexion establecida");
            System.out.print("");

            String sql= "select * from Students";

            Statement st= (Statement) connection.createStatement( );
            ResultSet result = st.executeQuery(sql);

            while(result.next()){
                String id =result.getString("id");
                String Name =result.getString("Name");
                String Surname =result.getString("Surname");
                String city =result.getString("city");
                String phone =result.getString("phone");
                String date =result.getString("date");


                System.out.print(id);
                System.out.print(" ");
                System.out.print(Name);
                System.out.print(" ");
                System.out.print(Surname);
                System.out.print("\n");
                System.out.print(city);
                System.out.print("\n");
                System.out.print(phone);
                System.out.print("\n");
                System.out.print(date);
                System.out.print("\n");
            }

            String sql2= "insert into Students values("+id2+","+Name2+","+Surname2+","+"city2"+","+Phone2+","+"Date2"+")";

            Statement st2= (Statement) connection.createStatement( );
            ResultSet result2 = st2.executeQuery(sql2);

            while(result2.next()){
                String id =result2.getString("id");
                System.out.print(id + "\n");
            }




            if(connection!=null){

                connection.close();
                System.out.print("\n");
                System.out.println("Conexion cerrada");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }




    }




    //Fin------
}