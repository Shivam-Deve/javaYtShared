import java.sql.*;

public class App {
    public static void main(String[] args) throws Exception {
        // connect to database
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String userName = "root";
        String password = "";
        Connection con = DriverManager.getConnection(url, userName, password);

        // create a table named student
        // String qry = "CREATE TABLE student(roll INT,name VARCHAR(255))";

        // Statement st = con.createStatement();
        // int count = st.executeUpdate(qry);
        // System.out.println(count);

        // insert a value into student table
        // String qry = "INSERT INTO student(roll,name) VALUES(1,'Aryan')";
        // Statement st = con.createStatement();
        // int count = st.executeUpdate(qry);
        // System.out.println(count);

        // int roll = 5;
        // String name = "Ramit";
        // String qry = "INSERT INTO student(roll,name) VALUES(?,?)";
        // PreparedStatement st = con.prepareStatement(qry);
        // st.setInt(1, roll);
        // st.setString(2, name);
        // int count = st.executeUpdate();
        // System.out.println(count);

        // get data from database
        // String qry = "Select * from student";
        // Statement st = con.createStatement();
        // ResultSet result = st.executeQuery(qry);

        // while (result.next()) {
        // System.out.println(result.getInt(1) + " " + result.getString(2));
        // }

        // delete data
        // String qry = "delete from student where roll=1";
        // Statement st = con.createStatement();
        // int count = st.executeUpdate(qry);
        // System.out.println(count);

        // update data
        // String qry = "UPDATE student SET roll=1 WHERE name='Ramit'";
        // Statement st = con.createStatement();
        // int count = st.executeUpdate(qry);
        // System.out.println(count);

        // drop student table
        String qry = "DROP table student";
        Statement st = con.createStatement();
        int count = st.executeUpdate(qry);
        System.out.println(count);

        st.close();
        con.close();
    }
}
