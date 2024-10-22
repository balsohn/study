package F1Ranking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class F1Select {

	public static void main(String[] args) throws Exception {


		Class.forName("com.mysql.jdbc.Driver");
		String db="jdbc:mysql://localhost:3306/F1";
		Connection conn=DriverManager.getConnection(db,"root","1234");
		
		String sql="select * from F1Rank";
		
		PreparedStatement pstmt=conn.prepareStatement(sql);
		
		ResultSet rs=pstmt.executeQuery();
		
		while(rs.next())
		{
		System.out.print(rs.getString("name") + " ");
		System.out.print(rs.getString("country") + " ");
		System.out.print(rs.getString("RankNum")+ " ");
		System.out.print(rs.getInt("height")+ " ");
		System.out.println(rs.getInt("PB")+ " ");
		System.out.println();
		}
	}

}