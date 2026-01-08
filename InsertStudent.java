import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class InsertStudent {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe",
                    "system",
                    "oracle"
            );

            System.out.print("Enter Student ID: ");
            int id = sc.nextInt();

            System.out.print("Enter Student Name: ");
            String name = sc.next();

            System.out.print("Enter Student Age: ");
            int age = sc.nextInt();

            String sql = "INSERT INTO students VALUES (" + id + ", '" + name + "', " + age + ")";

            Statement stmt = con.createStatement();
            int result = stmt.executeUpdate(sql);

            if (result > 0) {
                System.out.println("Student Record Inserted Successfully");
            }

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }

        sc.close();
    }
}1