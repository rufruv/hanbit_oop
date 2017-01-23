package phone;

import javax.swing.JOptionPane;

public class Controller {
	public void start() {
		Phone phone =null;
		Nokia nokia = null;
		while (true) {
			switch (JOptionPane.showInputDialog("기능선택: 0.종료 1.삼성전화기 2.노키아 3.아이폰 4.갤럭시")) {
			case "0":
				return;
			case "1":
				phone = new Phone();
				phone.setReceiver(JOptionPane.showInputDialog("누구세요?"));
				phone.setCall(JOptionPane.showInputDialog("전하실 내용은 무엇입니까?"));
				JOptionPane.showMessageDialog(null, phone.toString());
				break;
			case "2":
				nokia = new Nokia();
				nokia.setReceiver(JOptionPane.showInputDialog("누구세요?"));
				nokia.setCall(JOptionPane.showInputDialog("전하실 내용은 무엇입니까?"));
				nokia.setPortable(true);
				JOptionPane.showMessageDialog(null, nokia.toString());
				break;
			case "3":
				Iphone i = new Iphone();
				i.setReceiver(JOptionPane.showInputDialog("어디서 검색하고 있습니까?"));
				i.setData(JOptionPane.showInputDialog("어떤 정보를 검색하고 있습니까?"));
				i.setPortable(true);
				JOptionPane.showMessageDialog(null, i.toString());
				break;
			case "4":
				GallaxyNote gn = new GallaxyNote();
				gn.setReceiver(JOptionPane.showInputDialog("어디에서 검색하고 있습니까?"));
				gn.setData(JOptionPane.showInputDialog("어떤 정보를 검색하고 있습니까?"));
				gn.setSize(JOptionPane.showInputDialog("화면크기가 어떻습니까?"));
				gn.setPortable(true);
				JOptionPane.showMessageDialog(null, gn.toString());
				break;
			}
		}
	}
}
