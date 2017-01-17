package test;

import java.util.Scanner;

public class Controller {
	public static void main(String[] args) { // local variable 반드시 initialize
		Scanner scanner = new Scanner(System.in);
		System.out.println("어떤 작업을 원하세요? 1.BMI측정 2.성별입력 0.종료");
		int selector = scanner.nextInt();
		switch (selector) {
		case 0:
			return;
		case 1:
			Bmi[] patients = new Bmi[3];
			for (int i = 0; i < patients.length; i++) {
				System.out.println("이름, 나이, 몸무게, 키?");
				patients[i] = new Bmi(); // initialize(초기화)
				patients[i].name = scanner.next();
				patients[i].age = scanner.nextInt();
				patients[i].weight = scanner.nextDouble();
				patients[i].height = scanner.nextDouble() / 100;
			    System.out.printf(patients[i].getResult(patients[i].weight, patients[i].height));
				}break;
		case 2:
			Ssn member = new Ssn();

			System.out.println("이름:");
			member.name = scanner.next();
			System.out.println("주민번호: ");
			member.ssn = scanner.next();
			
			/* String gender = member.getGender = (member.ssn); */
			System.out.println(member.name + "(" + member.getGender(member.ssn) + ")");
			// 한석규(남)
		}
	}
}
