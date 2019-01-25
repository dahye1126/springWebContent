package member;

import java.util.Scanner;

public class Menu {
	private Service service;
	public static String LoginId = "";

	public void setService(Service service) {
		this.service = service;
	}
	
	public static String getLoginId() {
		return LoginId;
	}


	public void run(Scanner sc) {
		boolean flag = true;
		int menu;
		while(flag) {
			System.out.println("1.회원가입 2.로그인 3.로그아아웃 4.내정보확인 5.내정보수정 6.탈퇴 7.종료");
			menu = sc.nextInt();
			switch(menu) {
				case 1 :
					join(sc);
					break;
				case 2 :
					break;
				case 3 :
					break;
				case 4 :
					break;
				case 5 :
					break;
				case 6:
					 break;
				case 7 :
					flag = false;
					break;
			}
		}
	}

	
	public void join(Scanner sc) {
		System.out.println("id:");
		String id = "";
		do {
			id = sc.next();
		} while(!service.checkId(id));
		
		System.out.println("pwd:");
		String pwd = sc.next();
		System.out.println("name:");
		String name = sc.next();
		System.out.println("email:");
		String email = sc.next();
		System.out.println(id + pwd+name+email);
		service.join(new Member(id, pwd, name, email));
		
	}
	
}
