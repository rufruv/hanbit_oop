package test;

import java.util.Scanner;

public class Controller {
	public static void main(String[] args) { // local variable 반드시 initialize
		Scanner s = new Scanner(System.in);
		int i = 0 ;
		String ssn= "";                      // local variable
		String gender= "";     
		String bmiResult = "";
		String tempUid = "";
		Member member = new Member();                
		while(true){
			System.out.println("어떤 작업을 원하세요? 1.회원등록  2.BMI측정 3.로또 4.성적표 0.종료");
			int selector = s.nextInt();
			switch (selector) {
			case 0: return;
				
			case 1:
				System.out.println("아이디, 이름, 주민번호(앞자리7자리까지)?");
				member.setUid(s.next());
				member.setName(s.next());
				// Input SSN
				while (true) {                     // validation 유효성 체크
					System.out.println("주민번호: ");
					ssn = s.next();
					char ch = ssn.charAt(7);
					if (ch == '0' || ch == '7' || ch == '8' || ch == '9') {
						System.out.println("다시 입력하세요");
					} else {
						break;
					}
				}
				member.setSsn(ssn);
				// [2] calcGender를 standardAlone method로 
				gender = member.calcGender(ssn);
				System.out.printf("%s(%s)\n", member.getName(), gender );
				// 한석규(남)
				
			case 2:
				Bmi bmi = new Bmi() ;
				while(true){
					System.out.println("아이디?");
					tempUid = s.next();
					if(member.getUid().equals(tempUid)){
						break ;
					}else{
						System.out.println("다시 입력하세요");
					}
				}
				bmi.setUid(tempUid);
				// member.getUid().equals(tempUid);
				System.out.println("몸무게, 키?");
				bmi.setWeight(s.nextDouble());
				bmi.setHeight(s.nextDouble());
				bmiResult = bmi.calcBmi(bmi.getWeight(), bmi.getHeight());
				System.out.printf("%s(%s) %s\n", member.getName(), gender, bmiResult);
				// 한석규(남) 과체중
				break;
			
			case 3:
				// lotto
				break;
			case 4:
				ReportCard card = new ReportCard() ;
				System.out.print("Name:");
				card.setName(s.next());
				int score=0, total=0; 
				for(i=0; i<6; i++){
					System.out.println("Score: ");
					System.out.println("If you want to stop, Type -1");
					System.out.println("If the number of Subject is 6, Auto quit!");
					score = s.nextInt();
					total += score;
				}
				card.setTotal(total);
				card.setAverage(total/6);
				card.calcGrade();
				
				System.out.printf("%s: %d\n","Name", card.getName());
				System.out.printf("%s: %d\n", "Total", card.getTotal());
				System.out.printf("%s: %d\n", "Average:", card.getAverage());
				System.out.printf("%s: %d", "Grade:", card.getGrade());
				break;
				
			case 5: 
				
				break;
				}
		   }
	   }
}
