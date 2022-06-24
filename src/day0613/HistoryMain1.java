package day0613;

import java.util.*;

public class HistoryMain1 {
	
	// 부모 타입의 참조변수로 자식의 객체를 다루기 : 업캐스팅, 형변환 생략 가능 
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5; // queue에는 최대 5개까지 저장 
	
	public static void main(String[] args) {
		/* 1. 큐를 생성
		 * 2. help를 입력하면 도움말을 볼 수 있습니다.
		 * 	표시한 후 명령어를 입력받음
		 * 3-1. 입력받은 내용에 따라서 내용이 "q"이면 강제로 종료
		 * 	System.exit() : 강제 종료
		 * 3-2. 입력받은 내용이 help면 
		 * 		help - 도움말을 보여줍니다.
		 * 		q 또는 Q - 프로그램을 종료합니다.
		 * 		history - 최근에 입력한 명령어를 5개 보여줍니다.
		 * 3-3. 입력받은 내용이 history이면
		 * 	history 명령어 저장
		 * 	저장되어 있는 명령을 화면에 출력해줌
		 * 3-4. 입력받은 내용이 위의 내용에 포함되지 않으면
		 * 	입력받은 명령어를 저장하고 화면에 출력
		 * 4. 입력받은 내용을 저장하는 save 메서드 생성 */
		
//		Queue<String> q = new LinkedList<String>();
//		
//		Scanner s = new Scanner(System.in);
//		
//		while(true){
//			System.out.print("help를 입력하면 도움말을 볼 수 있습니다. >> ");
//			String input = s.next();
//	
//			if (input.toLowerCase().equals("q")) {
//				break;
//			} else {
//				
//				switch(input) {
//				case "help" :
//					System.out.println("  help - 도움말을 보여줍니다.");
//					System.out.println("  q 또는 Q - 프로그램을 종료합니다.");
//					System.out.println("  history - 최근에 입력한 명령어를 5개 보여줍니다.");
//					break;
//				case "history" :
//					q.offer(input);
//					
//					if(q.size() > 5) {
//						q.remove();
//					}
//					
//					for(int i=1; i<=5; i++) {
//						String value = q.poll();
//						System.out.println(i + ". " + value);
//						System.out.println();
//					}
//					break;
//				default :
//					q.offer(input);
//					System.out.println(input);
//					if(q.size() > 5) {
//						q.remove();
//					}
//				}
//			}
//		
//		}
		
		
		// 강사님
		System.out.println("help를 입력하면 도움말이 출력됩니다.");
		
		while(true) {
			System.out.print("명령어 > ");
			
			try {

				Scanner s = new Scanner(System.in);
				String input = s.nextLine();
				
				// 명령어가 공백이면 while 재반복
				if(input.equals("")) continue;
				
				// 대소문자를 구별하지 않고 "q"를 입력받으면 종료함
				if(input.equalsIgnoreCase("q")) {
					System.out.println("종료");
					System.exit(0);
				} else if(input.equalsIgnoreCase("help")) {
					System.out.println("  help : 도움말을 보여줍니다.");
					System.out.println("  q 또는 Q : 프로그램을 종료합니다.");
					System.out.println("  history : 최근에 입력한 명령어 " + MAX_SIZE + "개를 보여줍니다.");
				} else if(input.equalsIgnoreCase("history")) {
					save(input);
					
						// 자식 타입의 참조변수로 부모 객체 다루기 : 다운캐스팅, 형변환 생략 불가능
					LinkedList list = (LinkedList) q; // 형변환
						
					for(int i=0; i<list.size(); i++) {	
						System.out.println((i+1) + ". " + list.get(i));
					}
					
				} else {
					save(input);
					System.out.println(input);
				}
			} catch(Exception e) {
				System.out.println("입력 오류입니다.");
			} // 혹시 모를 예외 발생에 대비한 try/catch문 
		}
	
	}

	public static void save(String input) {
		
		if(input != "" && !input.equals("")) {
			q.offer(input);
		}
		
		if (q.size() > MAX_SIZE) {
			q.remove();
		}
	}
}
