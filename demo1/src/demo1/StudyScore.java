package demo1;

public class StudyScore {
	public static void main(String[] args) {
		// 1 2 3
		int score = 85;
		//
		if (score < 60) {
			System.out.println("该学生成绩不及格");
		} else if (score <= 69) {
			System.out.println("该学生成绩及格");
		} else if (score <= 79 && score >= 70) {
			System.out.println("该学生成绩一般");
		} else if (score <= 89 && score >= 80) {
			System.out.println("该学生成绩良好");
		} else if (score <= 100 && score >= 90) {
			System.out.println("该学生成绩优秀");
		}
		//
	}
}
