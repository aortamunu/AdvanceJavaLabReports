import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeDatabase {

    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/empinfo";
    private static final String DATABASE_USERNAME = "root";
    private static final String DATABASE_PASSWORD = "root";

    public static void main(String[] args) {

        try (Connection connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USERNAME, DATABASE_PASSWORD)) {

            String sql = "INSERT INTO employees (name, email, address) VALUES (?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);

            // set parameters for the statement
            statement.setString(1, "Seemana Karmacharya");
            statement.setString(2, "seemana@nacol.com");
            statement.setString(3, "Balaju, Kathmandu");

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Employee record inserted successfully!");
            }

        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
