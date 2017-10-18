package com.etc.test;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;

public class TestOracleProcedure2 {

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

			// �����͵��ô洢�����йصĶ���
			// {call <procedure-name>[(<arg1>,<arg2>, ...)]}
			CallableStatement cstmt = conn
					.prepareCall("{call PROC_ADDEMP2(?,?,?,?,?,?,?,?)}");

			// �������
			cstmt.setInt(1, 1217);
			cstmt.setString(2, "С��");
			cstmt.setString(3, "����");
			cstmt.setInt(4, 1234);

			// ����ע�⵽5Ӧ����һ��ʱ���ʽ��������
			// Sets the designated parameter to the given java.sql.Date
			//cstmt.setDate(5, new Date(System.currentTimeMillis()));// ��ǰʱ��

			
			cstmt.setInt(6, 9999);

			cstmt.setInt(7, 1);
			cstmt.setInt(8, 30);

			// ���ù���
			cstmt.executeUpdate();

			// ���
			System.out.println("ִ�����");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} finally {
			// �ͷ���Դ

		}

	}

}
