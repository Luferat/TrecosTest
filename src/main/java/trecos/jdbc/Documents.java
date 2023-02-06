package trecos.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Documents {

    // Faz conexão DAO
    private DbConnection dbConnection = new DbConnection();

    // Inicializa atributos DAO
    private Connection conn = null;
    private PreparedStatement pstm = null;
    private ResultSet res = null;
    private String sql = null;

    public void showAllDocs() {

        try {
            sql = "SELECT * FROM documents INNER JOIN categories ON dcategory = cid WHERE dstatus = 'on';";
            conn = dbConnection.dbConnect();
            pstm = conn.prepareStatement(sql);
            res = pstm.executeQuery();
            while (res.next()) {
                System.out.println("ID: " + res.getInt("did"));
                System.out.println("    Date: " + res.getString("ddate"));
                System.out.println("    Category: " + res.getString("cname"));
                System.out.println("    Name: " + res.getString("dname"));
                System.out.println("    Content: " + res.getString("dcontent"));
            }
        } catch (SQLException error) {
            System.err.println("ListAllDocs.showAllDocs\n" + error);
            System.exit(0);
        }

    }

}
