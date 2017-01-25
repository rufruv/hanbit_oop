package shopping;

import javax.swing.JOptionPane;

import shopping.Customer;
import shopping.CustomerService;
import shopping.CustomerServiceImpl;

public class Himart {
	public static void main(String[] args) {
		CustomerService service = new CustomerServiceImpl();
		String status = "";
		StringBuffer sb = new StringBuffer();
		while(true){
			switch(JOptionPane.showInputDialog("뭘살까? 0.종료 1.TV 2.폰 3.청소기 4.PC")){
			case "0": 
				JOptionPane.showMessageDialog(null, sb.toString());
				return;
			case "1": 
				Product tv = new TV();
				sb.append(tv.toString()+"\n");
				/*status = service.buy(tv);*/
				JOptionPane.showMessageDialog(null, service.buy(tv));
				break;
			case "2": 
				Product phone = new SmartPhone();
				sb.append(phone.toString()+"\n");
				/*status = service.buy(phone);*/
				JOptionPane.showMessageDialog(null, service.buy(phone));
				break;
			case "3": 
				Product cleaner = new Cleaner();
				sb.append(cleaner.toString()+"\n");
				/*status = service.buy(cleaner);*/
				JOptionPane.showMessageDialog(null, service.buy(cleaner));
				break;
			case "4": 
				Product pc = new Computer();
				sb.append(pc.toString()+"\n");
				/*status = service.buy(pc);*/
				JOptionPane.showMessageDialog(null, service.buy(pc));
				break;
			}   
		}
	}
}
