package hospital;

import java.util.Scanner;

public class Controller {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.printf("역할은? (의사:1, 간호사:2, 환자:3)\n" + "이름, 주민번호(800101-1), 이메일, 휴대폰\n");
		/*
		 * [의사] 한석규(남) 36세, han@test.com, 010-1234-5678 
		 * [간호사] 박신혜(여) 25세, park@test.com, 010-1234-5678 
		 * [환자] 홍길동(남) 15세, hong@test.com, 010-1234-5678
		 */
		int selector = s.nextInt();
		switch (selector) {
		case 1:
			Doctors doc = new Doctors();
			System.out.println("당신의 이름은 무엇입니까?");
			doc.docName = s.next();
			System.out.println("당신의 주민번호는 무엇입니까?");
			doc.docGen= s.next();
			System.out.println("당신의 이메일은 무엇입니까?");
			doc.docEmail = s.next();
			System.out.println("당신의 휴대폰번호는 무엇입니까?");
			doc.docPhone = s.next();
			System.out.printf("[의사] %s(%s), %s, %s ", doc.docName, doc.getGender(doc.docGen), doc.docEmail, doc.docPhone );
			return;
		case 2:
			Nurses nur = new Nurses();
			System.out.println("당신의 이름은 무엇입니까?");
			nur.nurName = s.next();
			System.out.println("당신의 주민번호는 무엇입니까?");
			nur.nurGen = s.next();
			System.out.println("당신의 이메일은 무엇입니까?");
			nur.nurEmail = s.next();
			System.out.println("당신의 휴대폰번호는 무엇입니까?");
			nur.nurPhone = s.next();
			System.out.printf("[간호사] %s(%s), %s, %s ", nur.nurName, nur.getGender(nur.nurGen), nur.nurEmail, nur.nurPhone );
			return;
		case 3:
			Patients pat = new Patients();
			System.out.println("당신의 이름은 무엇입니까?");
			pat.patName = s.next();
			System.out.println("당신의 주민번호는 무엇입니까?");
			pat.patGen = s.next();
			System.out.println("당신의 이메일은 무엇입니까?");
			pat.patEmail = s.next();
			System.out.println("당신의 휴대폰번호는 무엇입니까?");
			pat.patPhone = s.next();
			System.out.printf("[간호사] %s(%s), %s, %s ", pat.patName, pat.getGender(pat.patGen), pat.patEmail, pat.patPhone );
			return;
		}
	}
}
