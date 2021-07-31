package day06_while;

import java.util.Scanner;

public class Quiz15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int won = 0,menu = 0;
		int coppy = 200;
		int cocoa = 250;
		
		System.out.print("요금을 투입 하세요 >>> ");
		won = sc.nextInt();
		
		while(true) {
		System.out.println("===========커피 자판기==========");
		System.out.println("1. 커피(200)\t2.코코아(250)\t3.반환\t4.종료");
		System.out.print("메뉴를 선택하세요 >>> ");
		menu = sc.nextInt();
		
		switch(menu) {
		case 1:
			if(won>=coppy) {
				won-=coppy;
				System.out.println("맛있게 드세요");
			}
			else {
				System.out.println("요금이 부족합니다.");
				}
			break;
		case 2:
			if(won>=cocoa) {
				won-=cocoa;
				System.out.println("맛있게 드세요");
			}
			else {
				System.out.println("요금이 부족합니다.");
			}
			break;
		case 3:
			System.out.println(won+"반환");
			won-=won;
			break;
		case 4:
			System.out.println("종료");
			System.exit(4);
		}
	}
	}
}
