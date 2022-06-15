import java.sql.*;

public class KoneksiDBMS {
    String driverdbms = "com.mysql.cj.jdbc.Driver";
    String database = "jdbc:mysql://localhost:3306/dbandreas6492"; // port mysql
    String user = "andreas6492";
    String password = "";

    public KoneksiDBMS() {
    }

    public Connection BukaCn() throws SQLException {
        Connection condbms = null;
        try {
            Class.forName(driverdbms);
            condbms = DriverManager.getConnection(database, user, password);
            System.out.println("Koneksi Berhasil!");
            return condbms;
        } catch (SQLException se) {
            System.out.println("SQL Error!");
            return null;
        } catch (Exception ex) {
            System.out.println("Database Connection failed!");
            return null;
        }
    }
}
