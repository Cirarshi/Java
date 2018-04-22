package jdbcexample;
import java.sql.*;
public class JdbcExample {
    public static void main(String[] args) throws SQLException,ClassNotFoundException{
        String url="jdbc:mysql://localhost:3306/Inventory";
        String user="siri.s";
        String pass="radhasrinivas";
        Connection con;
        Statement st;
        try{
            con=DriverManager.getConnection(url,user,pass);
            st=con.createStatement();
            String sql;
            sql="insert into Inventory"+"(itemNo,itemName,Category,no.ofitemsinshelf)"+"values('2','dove','soap','5')";
            st.executeUpdate(sql);
        }catch(SQLException e){
            System.err.println(e);
         
        }
    
    }
    
}