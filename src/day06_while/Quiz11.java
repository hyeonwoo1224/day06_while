package day06_while;

import java.util.Scanner;

public class Quiz11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=0, sum=0;
		while(true) {
			System.out.println("�� �Է�(10~20)");
			i = sc.nextInt();
			if(i>=10 && i<=20) {
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
