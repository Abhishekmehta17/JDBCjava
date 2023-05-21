package tester;

import static com.jdbc.DBUtils.openConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class TesterSqlEmp {

	public static void main(String[] args) {

		try (
				Scanner sc = new Scanner(System.in);
				Connection cn = openConnection();
				PreparedStatement pst = cn.prepareStatement("select empno,ename,sal,deptno from emp where sal > ?");
				
				) {
			System.out.println("Enter salary ");
			Double sal = sc.nextDouble();
			pst.setDouble(1,sal);
			ResultSet rst = pst.executeQuery();
			while (rst.next()) {
				System.out.println("empno: " +rst.getInt(1) + "\nename: " + rst.getString(2) + "\nsal: " + rst.getDouble(3) + "\ndeptno: " + rst.getInt(4) );
			System.out.println("-----------------------------------------------");
			}
				
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
