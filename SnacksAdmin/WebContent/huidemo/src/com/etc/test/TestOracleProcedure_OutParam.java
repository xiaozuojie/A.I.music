package com.etc.test;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import oracle.jdbc.internal.OracleTypes;

public class TestOracleProcedure_OutParam {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Connection conn = null;
		int deptno = 40;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@192.168.9.250:1521:orcl", "scott",
					"tiger");

			// �����͵��ô洢�����йصĶ���
			// {call <procedure-name>[(<arg1>,<arg2>, ...)]}
			CallableStatement cstmt = conn
					.prepareCall("{call PROC_GETEMPCOUNTBYDEMPT(?,?)}");

			// �������
			cstmt.setInt(1, deptno);
			
			//�ڶ���������һ����� ����
			//ע���1 OracleTypes.INTEGER�������Ϳ���ָ��Ϊ������������
			cstmt.registerOutParameter(2, OracleTypes.INTEGER);

			// ���ù���
			cstmt.execute();
			
			//ע���2 ȥ��ȡ�������
			int count = cstmt.getInt(2);

			
			// ���
			System.out.println("ִ����� ���� "+deptno+",����: "+count);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} finally {
			// �ͷ���Դ
			//cstmt conn

		}

	}

}
