package phone;

import javax.swing.JOptionPane;

public class Controller {
	public void start() {
		Phone phone = new Phone();
		while (true) {
			switch (JOptionPane.showInputDialog("기능선택: 0.종료 1.삼성전화기 2.노키아 3.아이폰 4.갤럭시")) {
			case "0":
				return;
			case "1":
				phone.setReceiver(JOptionPane.showInputDialog("누구세요?"));
				phone.setCall(JOptionPane.showInputDialog("전하실 내용은 무엇입니까?"));
				JOptionPane.showMessageDialog(null, phone.toString());
			case "2":
				break;
			case "3":
				break;
			case "4":
				break;
			}
		}
	}
}
