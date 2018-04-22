package jdbcexample1;
import java.sql.*;
public class JdbcExample1 {

    public static void main(String[] args) throws SQLException,ClassNotFoundException{
        String url="jdbc:mysql://localhost:3306/Inventory";
        String user="siri.s";
        String pass="radhasrinivas";
        String query="select MAX(TEMP) AS Lowtemp FROM City";
        Connection con;
        Statement st;
        try{
            con=DriverManager.getConnection(url,user,pass);
            st=con.createStatement();
                String sql;
            sql="SELECT MIN(TEMP) AS Lowtemp FROM City";
            st.executeQuery(sql);
            st.executeQuery(query);
        
    }catch(SQLException e){
            System.err.println(e);
    }
  }
}
