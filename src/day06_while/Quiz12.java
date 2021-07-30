package day06_while;

public class Quiz12 {
	public static void main(String[] args) {
		int day=0;
		int money = 1;
		int i;
		for(i=1; i<=29; i++) {
			day=day+money;
			money*=2;
		}
		System.out.println(i+"일째"+money+"예금");
	}
}
