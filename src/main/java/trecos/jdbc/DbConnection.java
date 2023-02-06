package trecos.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DbConnection {

    // Atributo objeto de conexão
    private Connection conn = null;

    // String de conexão com o banco de dados SQLite
    private final String SQLITEURL = "jdbc:sqlite:src/main/java/trecos/database/trecostest.db";

    // Método de conexão com o banco de dados
    public Connection dbConnect() {

        try {
            // Inicia a conexão usando a URL
            conn = DriverManager.getConnection(SQLITEURL);
        } catch (SQLException error) {
            System.err.println("DbConnection.dbConnect\n" + error);
            System.exit(0);
        }

        // Retorna a conexão estabelecida
        return conn;
    }

    // Método que encerra todos os recursos abertos
    public void dbClose(Connection conn, PreparedStatement pstm, ResultSet res) {

        if (res != null) try {
            res.close();
        } catch (SQLException ignore) {
        }

        if (pstm != null) try {
            pstm.close();
        } catch (SQLException ignore) {
        }

        if (conn != null) try {
            conn.close();
        } catch (SQLException ignore) {
        }
    }

    // Cria o banco de dados caso ele não exista.
    public static void main(String[] args) {

        try {
            DbConnection dbConnection = new DbConnection();
            Connection conn = dbConnection.dbConnect();
            String sql = "SELECT * FROM documents;";
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet res = pstm.executeQuery();
            while (res.next()) {
                System.out.println("ID: " + res.getString("dname"));
            }
            dbConnection.dbClose(conn, pstm, res);
        } catch (SQLException error) {
            System.err.println("DbConnection.main\n" + error);
            System.exit(0);
        }

    }
}
