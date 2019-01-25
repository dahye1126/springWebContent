package member;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		
		String[] config = new String[]{"memberConfig.xml"};
		ApplicationContext context = new ClassPathXmlApplicationContext(config);
		Menu menu = (Menu)context.getBean("memMenu");
		Scanner sc = new Scanner(System.in);

		boolean flag = true;
		
		while(flag) {
			System.out.println("1.회원관리 2.게시판");
			int num = sc.nextInt();
			switch(num) {
			case 1 : 
				//member.Menu memberMenu = new member.Menu();
				//memberMenu.run(sc);
				menu.run(sc);
				break;
			case 2 :
				board.Menu boardMenu = new board.Menu();
				//boardMenu.run(sc);
				break;
			}
			
		}

	}

}
