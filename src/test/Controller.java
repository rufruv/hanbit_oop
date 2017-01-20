package test;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Controller {
	public static void main(String[] args) { // local variable 반드시 initialize
		Scanner s = new Scanner(System.in);
		int i = 0 ;
		String ssn = "";                      // local variable
		String gender= "";     
		String bmiResult = "";
		String tempUid = "";
		Member member = null;                
		while(true){
			/*System.out.println("어떤 작업을 원하세요? 1.회원등록  2.BMI측정 3.로또 4.성적표 0.종료");*/
			;
			/*int selector = s.nextInt();*/
			switch (JOptionPane.showInputDialog("원하시는 작업을 입력하세요!\n1.회원등록  2.BMI측정 3.로또 4.성적표 0.종료")){
			case "0": return;
				
			case "1":
				member = new Member();
				member.setUid(JOptionPane.showInputDialog("아이디"));
				member.setName(JOptionPane.showInputDialog("이름"));
				// Input SSN
				while (true) {                     // validation 유효성 체크
					ssn = JOptionPane.showInputDialog("주민번호 (앞자리 7자리까지만 입력하세요)");
					char ch = ssn.charAt(7);
					if (ch == '0' || ch == '7' || ch == '8' || ch == '9') {
						JOptionPane.showMessageDialog(null, "주민번호가 잘못 입력되었습니다. 다시 입력해주세요.");
					} else {
						break;
					}
				}
				member.setSsn(ssn);
				JOptionPane.showMessageDialog(null, member.getName()+"("+member.calcGender(ssn)+")");				// 한석규(남)
				break ;
			case "2":
				Bmi bmi = new Bmi() ;
				while(true){
					tempUid = JOptionPane.showInputDialog("아이디");
					if(member.getUid().equals(tempUid)){
						break ;
					}else{
						JOptionPane.showMessageDialog(null, "아이디가 일치하지 않습니다. 다시 입력해주세요");
					}
				}
				bmi.setUid(tempUid);
				bmi.setWeight(Integer.parseInt(JOptionPane.showInputDialog("몸무게")));
				bmi.setHeight(Integer.parseInt(JOptionPane.showInputDialog("키") ));
				/*bmiResult = bmi.calcBmi(bmi.getWeight(), bmi.getHeight());*/
				JOptionPane.showMessageDialog(null, member.getName() + gender + bmi.calcBmi(bmi.getWeight(), bmi.getHeight()));
				// 한석규(남) 과체중
				break;
			
			case "3":
				// lotto
				break;
			case "4":
				ReportCard card = new ReportCard() ;
				card.setName(JOptionPane.showInputDialog("이름"));
				int score=0, total=0; 
				for(i=0; i<6; i++){
					score = Integer.parseInt(JOptionPane.showInputDialog("점수(6과목 점수를 연속으로 입력해 주세요)"));
					total += score;
				}
				card.setTotal(total);
				card.setAverage(total/6);
				card.calcGrade();
				
				JOptionPane.showInternalMessageDialog(null, "Name:" + card.getName() + "Total:" + card.getTotal() + "Average:" + card.getAverage() + "Grade:" + card.getGrade());
				/*System.out.printf("%s: %d\n","Name", card.getName());
				System.out.printf("%s: %d\n", "Total", card.getTotal());
				System.out.printf("%s: %d\n", "Average:", card.getAverage());
				System.out.printf("%s: %d", "Grade:", card.getGrade());*/
				break;
				
			case "5": 
				
				break;
				}
		   }
	   }
}
