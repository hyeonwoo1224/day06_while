package day06_while;

import java.util.Scanner;

public class Quiz14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int st;
		String id = null,id2 = null;
		String pw = null,pw2 = null;
		while(true) {
			System.out.println("1.�α���");
			System.out.println("2.ȸ������");
			System.out.println("3.������");
			System.out.print(">>>");
			st = sc.nextInt();
			
			switch(st) {
			case 1:
				System.out.print("���̵� ����: ");
				id = sc.next();
				System.out.print("��й�ȣ ����: ");
				pw = sc.next();
				if(id.equals(id2) && pw.equals(pw2)) {
					System.out.println("��������");
				}
				else {
					System.out.println("��������");
				}
				break;
			case 2:
				System.out.print("���̵� ����: ");
				id2 = sc.next();
				System.out.print("��й�ȣ ����: ");
				pw2 = sc.next();
				break;
			case 3:
				System.out.println("����");
				System.exit(3);
			}
		}
	}
}
