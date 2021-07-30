package day06_while;

import java.util.Scanner;

public class Quiz14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int st;
		String id = null,id2 = null;
		String pw = null,pw2 = null;
		while(true) {
			System.out.println("1.로그인");
			System.out.println("2.회원가입");
			System.out.println("3.나가기");
			System.out.print(">>>");
			st = sc.nextInt();
			
			switch(st) {
			case 1:
				System.out.print("아이디 인증: ");
				id = sc.next();
				System.out.print("비밀번호 인증: ");
				pw = sc.next();
				if(id.equals(id2) && pw.equals(pw2)) {
					System.out.println("인증성공");
				}
				else {
					System.out.println("인증실패");
				}
				break;
			case 2:
				System.out.print("아이디 생성: ");
				id2 = sc.next();
				System.out.print("비밀번호 생성: ");
				pw2 = sc.next();
				break;
			case 3:
				System.out.println("종료");
				System.exit(3);
			}
		}
	}
}
