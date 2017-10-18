package com.etc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestTransaction2 {

	/**
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {

		Connection conn = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@192.168.9.250:1521:orcl", "scott",
					"tiger");

			// java�����ò��Զ��ύ
			conn.setAutoCommit(false);// Ĭ��Ϊtrue �Զ��ύ

			// 1 ѧ�� תǮ ��ѧ��
			// ѧ����Ǯ���� -balance
			String sql1 = "update t_account set balance = balance -1 where accountId=1";

			// 2ѧ�õ�Ǯ ���� +balance
			String sql2 = "update t_account set balance = balance +1 where accountId=2";
			// 3���׼�¼����һ��
			// insert
			String sql3 = "insert into t_transrecord(transid,fromid,toid,transmoney) values(11,1,2,1)";

			PreparedStatement pstmt1 = conn.prepareStatement(sql1);
			PreparedStatement pstmt2 = conn.prepareStatement(sql2);
			PreparedStatement pstmt3 = conn.prepareStatement(sql3);

			int n1 = pstmt1.executeUpdate();

			// �˴��쳣��
			System.out.println(1 / 0);

			int n2 = pstmt2.executeUpdate();
			int n3 = pstmt3.executeUpdate();


			System.out.println("n1: " + n1 + ",n2: " + n2 + ",n3 : " + n3);

			// �ͷ���Դ
			pstmt1.close();
			pstmt2.close();
			pstmt3.close();

			conn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			// �ع�
			try {
				//����ع���������ʲô?
				conn.rollback();
				System.out.println("ִ�г��������Զ��ع�");
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		//��������һ��ҵ��
		
		//��һ��ҵ��
		
		//�������ύ
		// �ֶ��ύ
		conn.commit();
		

	}

}
