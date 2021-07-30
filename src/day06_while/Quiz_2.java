package day06_while;

public class Quiz_2 {
	public static void main(String[] args) {
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				if(i>=j) {
					System.out.println(i+"X"+j+"="+i*j);
				}
			}
		}
	}
}
