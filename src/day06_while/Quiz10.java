package day06_while;

import java.util.Scanner;

public class Quiz10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=0, sum=0;
		while(true) {
			System.out.println("�� �Է�(1~10)");
			i = sc.nextInt();
			if(i>=1 && i<=10) {
				break;
			}
			System.out.println("�߸� �Է� �ٽ�");
		}
		for(int j=1; j<=i; j++) {
			sum += j;
		}
		System.out.println("�Է� ���� �������� �� : " + sum);
	}
}
