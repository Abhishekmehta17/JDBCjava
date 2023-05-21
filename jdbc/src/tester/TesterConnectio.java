package tester;

import java.sql.Connection;
import static com.jdbc.DBUtils.*;
public class TesterConnectio {
	public static void main(String[] args) {
		try(Connection cn = openConnection()){
			
			System.out.println("Connection: " + cn);
			
			
		}catch (Exception e) {
			 e.printStackTrace();
		}
	}
}
