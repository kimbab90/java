package com.yedam.reference;

public class MemberExe {

	private static MemberExe instance = new MemberExe();

	public static MemberExe getInstance() {
		return instance;
	}

	private MemberExe() {

	}

	private Member[] members = { new Member("user01", "1111", "김박사"), new Member("user02", "2222", "이박사"),
			new Member("user03", "3333", "최박사") };

	public String login(String memberId, String password) {
		for (int i = 0; i < members.length; i++) {
			if (members[i] != null && members[i].getMemberId().equals(memberId)
					&& members[i].getPassword().equals(password)) {
				return members[i].getMemberName();
			}
		}
		return null;
	}

}
