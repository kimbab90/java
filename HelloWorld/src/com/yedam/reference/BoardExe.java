package com.yedam.reference;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * 1.글목록 2.등록 3.삭제 9.종료
 * 
 */
public class BoardExe {

	static Scanner scn = new Scanner(System.in);

	static Board[] boardRepo = new Board[100];

	public static void initData() throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		boardRepo[0] = new Board("title1", "content1", "writer1", sdf.parse("2025-01-01"));
		boardRepo[1] = new Board("title2", "content2", "writer2", sdf.parse("2025-01-02"));
		boardRepo[2] = new Board("title3", "content3", "writer3", sdf.parse("2025-01-03"));
		boardRepo[3] = new Board("title4", "content4", "writer4", sdf.parse("2025-01-04"));
		boardRepo[4] = new Board("title5", "content5", "writer5", sdf.parse("2025-01-05"));
		boardRepo[5] = new Board("title6", "content6", "writer6", sdf.parse("2025-01-06"));
		boardRepo[6] = new Board("title7", "content1", "writer1", sdf.parse("2025-01-07"));
		boardRepo[7] = new Board("title8", "content2", "writer2", sdf.parse("2025-01-08"));
		boardRepo[8] = new Board("title9", "content3", "writer3", sdf.parse("2025-01-09"));
		boardRepo[9] = new Board("title10", "content4", "writer4", sdf.parse("2025-01-10"));
		boardRepo[10] = new Board("title11", "content5", "writer5", sdf.parse("2025-01-11"));
		boardRepo[11] = new Board("title12", "content6", "writer6", sdf.parse("2025-01-12"));

	}

	public static void boardList() {

		int page = 1;

		while (true) {
			int firstIndex = (page - 1) * 5;
			int lastIndex = (page * 5) - 1;
			int lastPage = (int) Math.ceil(getMaxCount() / 5.0);

			int count = 0;
			int min = (page - 1) * 5;
			int max = (page) * 5;

			for (int i = 0; i < boardRepo.length; i++) {
				if (boardRepo[i] != null) {
//					System.out.println(count);
//					System.out.println(min);
//					System.out.println(max);
					if (count < max && count >= min) {
						System.out.printf("%3d : %s\n", i, boardRepo[i].showBoard());
					}
					count++;
				}

			}

			System.out.println("=====================================");

			for (int i = firstIndex; i <= lastIndex; i++) {
				if (boardRepo[i] != null) {
					System.out.printf("%3d : %s\n", i, boardRepo[i].showBoard());
				}
			}

			System.out.println("이전: p, 이후: n, 종료 : q");
			String paging = scn.nextLine();

			switch (paging) {
			case "p":
				if (page > 1) {
					page--;
				}
				break;
			case "n":
				if (page < lastPage) {
					page++;
				}
				break;
			case "q":
				return;
			default:
			}
		}

//		System.out.print("페이지>");
//		int page = Integer.parseInt(scn.nextLine());
//		int perPage = 5;
//		int countAll = 0;
//		int count = 0;
//
//		for (int i = 0; i < boardRepo.length; i++) {
//			if (boardRepo[i] != null) {
//				countAll++;
//				System.out.println(countAll);
//				if (page * perPage < countAll) {
//					count++;
//					System.out.println(count);
//
//					if (count < perPage) {
//						System.out.printf("%3d : %s\n", i, boardRepo[i].showBoard());
//					} else {
//						break;
//					}
//				}
//			}
//		}

//		for (int i = 0; i < boardRepo.length; i++) {
//			if (boardRepo[i] != null) {
//				System.out.printf("%3d : %s\n", i, boardRepo[i].showBoard());
//			}
//		}
	}

	public static int getMaxCount() {
		int count = 0;

		for (int i = 0; i < boardRepo.length; i++) {
			if (boardRepo[i] != null) {
				count++;
			}
		}

		return count;
	}

	public static void addBoard(String loginId) {
		System.out.print("제목>");
		String title = scn.nextLine();

		if (title.length() < 5 || title.length() > 15) {
			System.out.println("등록불가");
			return;
		} else {
			for (int i = 0; i < boardRepo.length; i++) {
				if (boardRepo[i] != null && title.equals(boardRepo[i].getTitle())) {
					System.out.println("이미 있는 제목");
					return;
				}
			}
		}

		System.out.print("내용>");
		String content = scn.nextLine();
//		System.out.print("작성자>");
//		String writer = scn.nextLine();
//		System.out.print("작성일자>");
//		String writeDate = scn.nextLine();

		for (int i = 0; i < boardRepo.length; i++) {
			if (boardRepo[i] == null) {
				boardRepo[i] = new Board(title, content, loginId, new Date());
				System.out.println("등록완료");
				break;
			}
		}
	}

	public static void removeBoard() {

		System.out.print("제목>");
		String title = scn.nextLine();

		for (int i = 0; i < boardRepo.length; i++) {
			if (boardRepo[i] != null && title.equals(boardRepo[i].getTitle())) {
				boardRepo[i] = null;
				System.out.println("삭제완료");
				sort();
				break;
			}
		}

//		System.out.print("번호>");
//		int index = Integer.parseInt(scn.nextLine());
//
//		if (boardRepo[index] != null) {
//			boardRepo[index] = null;
//			System.out.println("삭제완료");
//		} else {
//			System.out.println("잘못된 번호");
//		}
	}

	public static void sort() {
		Board[] boardRepoCopy = new Board[100];

		for (int i = 0; i < boardRepo.length; i++) {
			if (boardRepo[i] != null) {
				for (int j = 0; j < boardRepoCopy.length; j++) {
					if (boardRepoCopy[j] == null) {
						boardRepoCopy[j] = boardRepo[i];
						break;
					}
				}
			}
		}
		boardRepo = boardRepoCopy;
	}

	public static void main(String[] args) {

		MemberExe member = MemberExe.getInstance();

		String loginId;

		while (true) {

			System.out.println("ID 입력");
			String memberId = scn.nextLine();
			System.out.println("비밀번호 입력");
			String password = scn.nextLine();

			String memberName = member.login(memberId, password);

			if (memberName != null) {
				loginId = memberId;
				System.out.printf("%s 님 환영합니다\n", memberName);
				break;
			} else {
				System.out.println("로그인 실패");
			}
		}

		try {
			initData();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		boolean run = true;

		while (run) {

			System.out.println("=============================");
			System.out.println("1.글목록 2.등록 3.삭제 9.종료");
			System.out.print("선택>");

			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case 1:
				boardList();
				break;
			case 2:
				addBoard(loginId);
				break;
			case 3:
				removeBoard();
				break;
			case 9:
				System.out.println("종료");
				run = false;
				break;
			default:
				System.out.println("메뉴확인");
			}
		}
		System.out.println("프로그램 종료");
	}
}
