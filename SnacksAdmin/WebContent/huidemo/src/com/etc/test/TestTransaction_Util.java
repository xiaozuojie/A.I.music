package com.etc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.etc.cms.util.BaseDao;

public class TestTransaction_Util {

	/**
	 * @param args
	 * @throws SQLException
	 */
	public static void main(String[] args) throws SQLException {

		Connection conn = null;

		try {

			conn = BaseDao.getConn();
			// java�����ò��Զ��ύ
			conn.setAutoCommit(false);// Ĭ��Ϊtrue �Զ��ύ

			// 1 ѧ�� תǮ ��ѧ��
			// ѧ����Ǯ���� -balance
			String sql1 = "update t_account set balance = balance -2 where accountId=1";

			// 2ѧ�õ�Ǯ ���� +balance
			String sql2 = "update t_account set balance = balance +2 where accountId=2";
			// 3���׼�¼����һ��
			// insert
			String sql3 = "insert into t_transrecord(transid,fromid,toid,transmoney) values(10,1,2,2)";

			BaseDao.execute(sql1, conn, null);
			BaseDao.execute(sql2, conn, null);
			BaseDao.execute(sql3, conn, null);
			// �˴��쳣��
			//System.out.println(1 / 0);

			// �ֶ��ύ
			conn.commit();
			
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			// �ع�
			try {
				// ����ع���������ʲô?
				 conn.rollback();
				 System.out.println("ִ�г��������Զ��ع�");
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}finally{
			conn.close();
		}

	}

}
