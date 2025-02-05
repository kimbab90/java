package com.yedam.inheritance;

public class FriendManager {

	public static void main(String[] args) {
		
//		Friend[] friendAry = new Friend[10];
//		friendAry[0] = new Friend("홍", "1111", BloodType.A);
//		friendAry[1] = new ComFriend("박", "3333", BloodType.B, "구글", "개발");
//		friendAry[2] = new UnivFriend("김", "2222", BloodType.AB, "예담", "역사");

		FriendExe app = FriendExe.getInstance();
		app.run();
	}
}
