package ch3;

public class ifThen {

	public static void main(String[] args) {
		int a = 10, b= 20;
		boolean flag = true;
		
		if (a==10) {
			System.out.println("a가 10이면 참");
		}
		
		if (a==b) {
			System.out.println("a와 b가 같으면 참");
		}
		
		if (flag) {
			System.out.println("flag 값이 true이면 참");
		}
		
		System.out.println("이 문장은 if문과 상관없이 실행");
	}

}
