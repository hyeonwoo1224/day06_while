package day06_while;

import java.util.Scanner;

public class Quiz_2_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,j;
		long sum = 1;
		while(true) {
		System.out.print("수 입력 : ");
		j = sc.nextInt();
		if(j == 20) {
			break;
			}
		System.out.println("오류");
		}
		for (i=1; i<=j; i++) {
			sum*=i;
		}
		System.out.println("1부터 20까지의 곱은" + sum);
	}
}
