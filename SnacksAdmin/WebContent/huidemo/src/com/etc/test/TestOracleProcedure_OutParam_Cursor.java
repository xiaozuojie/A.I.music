package com.etc.test;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import oracle.jdbc.internal.OracleTypes;

public class TestOracleProcedure_OutParam_Cursor {

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
			//����1 Ϊ���������ģ����ѯ����������
			//����2 Ϊ������� ������cursor
			CallableStatement cstmt = conn
					.prepareCall("{call  package8.s(?,?)}");

			// �������
			cstmt.setString(1, "S");
			
			//�ڶ���������һ����� ����
			//ע���1  OracleTypes.CURSOR
			cstmt.registerOutParameter(2, OracleTypes.CURSOR);

			// ���ù���
			cstmt.execute();
			
			//ע���2 ȥ��ȡ������� ������һ��cusor ��ʱҪ��ȡ�Ķ���ת��ΪResultSet
			ResultSet rs = (ResultSet)cstmt.getObject(2);
			
			while(rs.next())
			{
				// ���
				System.out.println("ename :"+rs.getString("ename")+", sal:"+rs.getFloat("sal"));
			}

			
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} finally {
			// �ͷ���Դ
			// rs cstmt conn 

		}

	}

}
