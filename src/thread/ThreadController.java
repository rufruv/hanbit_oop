package thread;
import java.lang.Thread;

import java.lang.Object;
import java.lang.String;;
public class ThreadController {
	public static void main(String[] args) {
		ATM atm = new ATM();
		Runnable hong = new User("홍길동",atm); // ATM은 공유하니깐 ATM 생성자는 하나! -> 공유하는건 static, 그러나 static은 메로리를 프로그램 끝까지 점유 
		Runnable kim= new User("김유신",atm);
		Runnable lee = new User("이순신",atm);
		Thread thr1 = new Thread(hong);  // Deco Pattern : hong->객체(instance)
		thr1.start();
		Thread thr2 = new Thread(kim);
		thr2.start();
		Thread thr3 = new Thread(lee);
		thr3.start();
	}
}

class ATM {
	public synchronized void inchul(String name){
		System.out.println(name + "님이 인출요청함");
		for(int i=0;i<=5;i++){
			if(i==5){
				System.out.println(name+"님이 인출 중입니다.");
			}
		}
		System.out.println(name+"님이 인출해 나감");
	}
}
class User implements Runnable{
	private String name;
	private ATM atm;
	public User(String name, ATM atm){ // User와 ATM은 Asso관계 (has a)
		super(); //부모의것을 갖다 쓸게 있다. 
		this.atm=atm;
		this.name=name;
	}
	
	@Override
	public void run() {
		atm.inchul(name);
	}
}

