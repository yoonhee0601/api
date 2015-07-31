package api.util.hashMap;

import java.util.Scanner;

public class MemberMain {
	public static void main(String[] args) {
		/*Scanner scanner = new Scanner(System.in);
		System.out.println("아이디를 입력해주세요");
		String id = scanner.next();
		System.out.println("비번를 입력해주세요");
		String password = scanner.next();
		System.out.println("이름를 입력해주세요");
		String name = scanner.next();
		System.out.println("나이를 입력해주세요");
		int age = scanner.nextInt();
		System.out.println("주소를 입력해주세요");
		String addr = scanner.next();
		
		
		 * 객체를 생성해서 완성시켜주세요.
		 * 객체를 생성하는 이유는 단 한가지...객체가 불러오는 메소드를 활용하기 위해서
		 * */
		MemberService service = new MemberServiceImpl();
String		id = "hong";
String		password = "pass";
String		name = "홍길동";
int		age = 20;
String		addr = "서울시";
		service.join(id, password, name, age, addr);
		
		System.out.println("회원가입이 되었습니다.");
		System.out.println("로그인을 해주셔요");
		
		System.out.println("ID 를 입력해주세요");
		id = "hong";
		System.out.println("비번을 입력해주세요");
		password = "pass";
		/*
		 * 객체가 호출하는 메소드로 완성시켜 주세요
		 * */
		service.login(id, password);
	}
}
