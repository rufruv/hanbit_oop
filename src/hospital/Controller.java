package hospital;

import java.util.Scanner;
import test.Bmi;

public class Controller {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Bmi bmi = new Bmi();
		System.out.println("당신은 누구입니까? (의사:1, 간호사:2, 환자:3)");
		/* 아래처럼 출력되도록 하세요
		 * [의사] 한석규(남) 36세, han@test.com, 010-1234-5678 
		 * [간호사] 박신혜(여) 25세, park@test.com, 010-1234-5678 
		 * [환자] 홍길동(남) 15세, hong@test.com, 010-1234-5678
		 */
		int selector = s.nextInt();
		switch (selector) {
		case 1:
			Doctors doc = new Doctors();
			System.out.println("'이름, 주민번호(앞자리 7자리까지), 이메일, 휴대폰번호?");
			doc.docName = s.next();
			doc.docGen = s.next();
			doc.docEmail = s.next();
			doc.docPhone = s.next();
			System.out.printf("[의사] %s(%s) %d%s, %s, %s ", 
					doc.docName, doc.getGender(doc.docGen), doc.getAge(doc.docGen), "세", doc.docEmail, doc.docPhone );
			break;
		case 2:
			Nurses nur = new Nurses();
			System.out.println("이름, 주민번호(앞자리 7자리까지), 이메일, 휴대폰번호?");
			nur.nurName = s.next();
			nur.nurGen = s.next();
			nur.nurEmail = s.next();
			nur.nurPhone = s.next();
			System.out.printf("[간호사] %s(%s) %d%s, %s, %s ", 
					nur.nurName, nur.getGender(nur.nurGen), nur.getAge(nur.nurGen), "세", nur.nurEmail, nur.nurPhone );
			break;
		case 3:
			Patients pat = new Patients();
			System.out.println("이름, 주민번호(앞자리 7자리까지), 이메일, 휴대폰번호?");
			pat.patName = s.next();
			pat.patJumin = s.next();
			pat.patEmail = s.next();
			pat.patPhone = s.next();
			System.out.printf("[간호사] %s(%s) %d%s, %s, %s ", 
					pat.patName, pat.getGender(pat.patJumin), pat.getAge(pat.patJumin), "세", pat.patEmail, pat.patPhone );
			break;
		}
	}
}