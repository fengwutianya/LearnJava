package learnjdbc; /**
 * Created by xuan on 2016/9/5.
 */
import java.sql.*;


public class learnsql {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Connection con = null;  //Connection getConnection
        Statement st = null;    //Statement createStatement
        ResultSet rs = null;    //ResultSet executeQuery
        String sql = null;

        Class.forName("com.mysql.jdbc.Driver").newInstance();
        try {
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/books",
                    "root", "14701470");
            st = con.createStatement();
            sql = "SELECT * FROM Books";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getString(1));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                    rs = null;
                }
                if (st != null) {
                    st.close();
                    st = null;
                }
                if (con != null) {
                    con.close();
                    con = null;
                }
            } catch (SQLException ex) {
                System.out.println("unable to close the connection to database");
            }
        }


    }
}
