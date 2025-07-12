import java.sql.*;

public class TransactionExample {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/yourDB", "username", "password");
            conn.setAutoCommit(false);

            PreparedStatement debit = conn.prepareStatement("UPDATE accounts SET balance = balance - 500 WHERE id = ?");
            debit.setInt(1, 1);
            debit.executeUpdate();

            PreparedStatement credit = conn.prepareStatement("UPDATE accounts SET balance = balance + 500 WHERE id = ?");
            credit.setInt(1, 2);
            credit.executeUpdate();

            conn.commit();
            conn.close();
        } catch (Exception e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }
    }
}
