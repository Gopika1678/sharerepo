package databasequery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import databasequery.sqlconnect;
import junit.framework.Assert;
public class insertquery {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String dbUrl="jdbc:sqlserver://qdtestserver01.eastus2.cloudapp.azure.com:51418;databaseName=PMC_QAT_WHMIS;encrypt=false;trustServerCertificate=false";
		String username="sa";
		String password="BeAtHome$BeSafe#1";
		String query="Create table PMC_QAT_WHMIS.Automation Results(Result_id varchar (10),Amt_id varchar(10),Sc_id varchar(10),Amtscneariodesc(50),screen_regfee decimal(18,4),screen_consfee decimal(18,4),screen_dic_amt(18,4),screen_gross_amt(decimal(18,4),screen_net_amt(18,4),automation_result varchar(20)) on primary GO";
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    	Connection con = DriverManager.getConnection(dbUrl,username,password);
 	  	Statement stmt = con.createStatement();					
       String query1="SELECT Row_Number() over(Order By s.Sc_ID asc) as Sl_No,a.Amt_ID,s.Sc_Id,a.ConsFee,a.RegFee,s.Sc_DiscAmt,(a.ConsFee + a.RegFee) AS GrossAmt,CASE WHEN (a.ConsFee - s.Sc_DiscAmt) >= 0 THEN (a.ConsFee + a.RegFee - s.Sc_DiscAmt) ELSE a.RegFee END AS NetAmt,REPLACE(CONCAT(s.Sc_Description, a.AmtScenarioDesc), ' ', '') as Scenarios FROM Rpa_Amt a CROSS JOIN rpa_Scenario s ORDER BY s.Sc_ID, s.Sc_Code, Sc_Description";
			// Execute the SQL Query. Store results in ResultSet		
  		ResultSet rs= stmt.executeQuery(query);		
  		String insquery="insert into Automation Results(1,1,1,'description',10,0,0,10,10,'success')";
  		if(query1.equalsIgnoreCase(insquery)) {
  			System.out.println("success");
  			
  		}
	}

}
