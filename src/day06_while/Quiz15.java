package day06_while;

import java.util.Scanner;

public class Quiz15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int won = 0,menu = 0;
		int coppy = 200;
		int cocoa = 250;
		
		System.out.print("����� ���� �ϼ��� >>> ");
		won = sc.nextInt();
		
		while(true) {
		System.out.println("===========Ŀ�� ���Ǳ�==========");
		System.out.println("1. Ŀ��(200)\t2.���ھ�(250)\t3.��ȯ\t4.����");
		System.out.print("�޴��� �����ϼ��� >>> ");
		menu = sc.nextInt();
		
		switch(menu) {
		case 1:
			if(won>=coppy) {
				won-=coppy;
				System.out.println("���ְ� �弼��");
			}
			else {
				System.out.println("����� �����մϴ�.");
				}
			break;
		case 2:
			if(won>=cocoa) {
				won-=cocoa;
				System.out.println("���ְ� �弼��");
			}
			else {
				System.out.println("����� �����մϴ�.");
			}
			break;
		case 3:
			System.out.println(won+"��ȯ");
			won-=won;
			break;
		case 4:
			System.out.println("����");
			System.exit(4);
		}
	}
	}
}
