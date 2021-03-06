package test;

import javax.swing.JOptionPane;

import hospital.Bmi;

public class Controller {

	public void startTest() {
		// local variable 반드시 initialize
		int i = 0;
		String ssn = "";   // local variable
		Member member = null;
		ReportCard card =null;

		while (true) {
			switch (JOptionPane.showInputDialog("원하시는 작업을 입력하세요!\n1.회원등록  2.BMI측정 3.로또 4.성적표 0.종료")) {
			case "0":
				return;

			case "1":
				member = new Member();
				member.setUid(JOptionPane.showInputDialog("아이디"));
				member.setName(JOptionPane.showInputDialog("이름"));
				while (true) {   // validation 유효성 체크
					ssn = JOptionPane.showInputDialog("주민번호 (앞자리 7자리까지만 입력하세요)");
					char ch = ssn.charAt(7);
					if (ch == '0' || ch == '7' || ch == '8' || ch == '9') {
						JOptionPane.showMessageDialog(null, "주민번호가 잘못 입력되었습니다. 다시 입력해주세요.");
					} else {
						break;
					}
				}
				member.setSsn(ssn);
				JOptionPane.showMessageDialog(null, member.getName() + "(" + member.calcGender(ssn) + ")"); // 한석규(남)
				break;
			

			case "3":
				// lotto
				break;
			case "4":
				card = new ReportCard();
				card.setName(JOptionPane.showInputDialog("이름"));
				int total = 0;
				for (i = 0; i < 6; i++) {
					total += Integer.parseInt(JOptionPane.showInputDialog("점수"));
				}
				card.setTotal(total);
				card.setAverage(total / 6);
				card.calcGrade();

				JOptionPane.showMessageDialog(null, "Name:" + card.getName() + "\n" + "Total:" + card.getTotal() + "\n"
						+ "Average:" + card.getAverage() + "\n" + "Grade:" + card.getGrade());
				break;

			case "5":

				break;
			}
		}
	}
}