package databasequery;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class sqlconnect {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String dbUrl="jdbc:sqlserver://qdtestserver01.eastus2.cloudapp.azure.com:51418;databaseName=PMC_QAT_WHMIS;encrypt=false;trustServerCertificate=false";
		String username="sa";
		String password="BeAtHome$BeSafe#1";
		String query="SELECT Row_Number() over(Order By s.Sc_ID asc) as Sl_No,a.Amt_ID,s.Sc_Id,a.ConsFee,a.RegFee,s.Sc_DiscAmt,(a.ConsFee + a.RegFee) AS GrossAmt,CASE WHEN (a.ConsFee - s.Sc_DiscAmt) >= 0 THEN (a.ConsFee + a.RegFee - s.Sc_DiscAmt) ELSE a.RegFee END AS NetAmt,REPLACE(CONCAT(s.Sc_Description, a.AmtScenarioDesc), ' ', '') as Scenarios FROM Rpa_Amt a CROSS JOIN rpa_Scenario s ORDER BY s.Sc_ID, s.Sc_Code, Sc_Description"		
				
				
				 ;

		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    	Connection con = DriverManager.getConnection(dbUrl,username,password);
 	  	Statement stmt = con.createStatement();					
       
			// Execute the SQL Query. Store results in ResultSet		
  		ResultSet rs= stmt.executeQuery(query);							


	}

}
