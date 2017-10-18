package com.etc.test;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class TestOracleProcedure {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection conn = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@192.168.9.250:1521:orcl", "scott",
					"tiger");
			
			//�����͵��ô洢�����йصĶ���
			//{call <procedure-name>[(<arg1>,<arg2>, ...)]}
			CallableStatement cstmt = conn.prepareCall("{call PROC_ADDEMP2(?,?,?,?,?,?,?)}");
			
			//�������
			cstmt.setInt(1, 1212);
			cstmt.setString(2, "С��");
			cstmt.setString(3, "����");
			cstmt.setInt(4, 1234);
			cstmt.setInt(5, 9999);
			cstmt.setInt(6, 1);
			cstmt.setInt(7, 30);
			
			
			//���ù���
			cstmt.executeUpdate();
			
			//���
			System.out.println("ִ�����");
			
			
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

}
