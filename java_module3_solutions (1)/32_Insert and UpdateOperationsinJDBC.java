import java.sql.*;

public class StudentDAO {
    public void insertStudent(int id, String name) throws Exception {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/yourDB", "username", "password");
        PreparedStatement ps = conn.prepareStatement("INSERT INTO students VALUES (?, ?)");
        ps.setInt(1, id);
        ps.setString(2, name);
        ps.executeUpdate();
        conn.close();
    }

    public void updateStudent(int id, String newName) throws Exception {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/yourDB", "username", "password");
        PreparedStatement ps = conn.prepareStatement("UPDATE students SET name = ? WHERE id = ?");
        ps.setString(1, newName);
        ps.setInt(2, id);
        ps.executeUpdate();
        conn.close();
    }

    public static void main(String[] args) throws Exception {
        StudentDAO dao = new StudentDAO();
        dao.insertStudent(101, "Afrose");
        dao.updateStudent(101, "Afrose Mehazafin");
    }
}
