package com.yedam.reference;

public class ReferenceExe2 {

	public static void main(String[] args) {

		String[][] score = new String[5][2];
//		score[0][0] = "홍길동";
//		score[0][1] = "80";
		score[0] = new String[] { "홍길동", "80" };
		score[1][0] = "김민수";
		score[1][1] = "85";
		score[2][0] = "박헌수";
		score[2][1] = "88";
		score[3][0] = "심상현";
		score[3][1] = "90";
		score[4][0] = "최기동";
		score[4][1] = "75";

//		for (int i = 0; i < score.length; i++) {
//			for (int j = 0; j < score[i].length; j++) {
//				System.out.println(score[i][j]);
//			}
//		}

		// 총점
		int sum = 0;
		// 최고점
		int maxScore = 0;
//		// 최고점 학생
		String maxName = "";
		
//		String[] temp = new String[2];

		// 학생 순회
		for (int j = 0; j < score.length; j++) {

			// 점수 출력 및 총점 계산
			System.out.printf("점수는 %s\n", score[j][1]);
			int value = Integer.parseInt(score[j][1]);
			sum += value;

			// 최고점 비교 및 학생 저장
			if (maxScore < value) {
				maxScore = value;
				maxName = score[j][0];
//				temp = score[j];
			}
		}

		System.out.printf("최고점은 %d, 학생은 %s\n", maxScore, maxName);
		System.out.printf("총점은 %d, 평균은 %f", sum, (double) sum / score.length);
	}
}