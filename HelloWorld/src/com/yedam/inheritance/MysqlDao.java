package com.yedam.inheritance;

public class MysqlDao extends Dao {


	@Override
	public void register() {
		// TODO Auto-generated method stub

		System.out.println("등록");
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub

		System.out.println("삭제");
	}

	@Override
	public void search() {
		// TODO Auto-generated method stub

		System.out.println("조회");
	}
}
