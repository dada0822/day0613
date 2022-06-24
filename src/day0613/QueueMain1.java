package day0613;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Message {
	public String command;
	public String to;
	
	public Message(String command, String to) {
		this.command = command;
		this.to = to;
	}
}

public class QueueMain1 {
	public static void main(String[] args) {
		Queue<Message> msgQueue = new LinkedList<Message>(); // <Message> 타입을 받을 것
		
		msgQueue.offer(new Message("sendMail", "김그린"));
		msgQueue.offer(new Message("sendSMS", "이자바"));
		msgQueue.offer(new Message("sendKakaotalk", "하하하"));
		
		while(!msgQueue.isEmpty()) {
			Message msg = msgQueue.poll();
			switch(msg.command) {
			case "sendMail":
				System.out.println(msg.to + "님에게 메일을 보냅니다.");
				break;
			case "sendSMS" :
				System.out.println(msg.to + "님에게 문자를 보냅니다.");
				break;
			case "sendKakaotalk":
				System.out.println(msg.to + "님에게 카톡을 보냅니다.");
			}
		}
		
		System.out.println();
		
		Stack<Message> msgStack = new Stack<Message>();
		
		msgStack.push(new Message("sendMail", "김그린"));
		msgStack.push(new Message("sendSMS", "이자바"));
		msgStack.push(new Message("sendKakaotalk", "하하하"));
		
		while(!msgStack.isEmpty()) {
			Message msg = msgStack.pop();
			switch(msg.command) {
			case "sendMail":
				System.out.println(msg.to + "님에게 메일을 보냅니다.");
				break;
			case "sendSMS" :
				System.out.println(msg.to + "님에게 문자를 보냅니다.");
				break;
			case "sendKakaotalk":
				System.out.println(msg.to + "님에게 카톡을 보냅니다.");
			}
		}
		
	}

}