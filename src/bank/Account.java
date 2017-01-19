package bank;

import java.nio.channels.NonWritableChannelException;
import java.util.Calendar;

public class Account {
	public final static String BANK_NAME = "한빛뱅크";
	private int money, accountNo ;
	private String uid, accountType, createDate, bankName ;
	
	public Account(String uid, String accountType, int money){  //6자리 랜덤숫자
		this.accountNo = createAccountNo() ; 
		this.createDate = today(); 
		this.uid = uid;
		this.accountType= accountType;
		this.money = money;
	}
	
	public String today(){
		String today = "";
		StringBuffer sb = new StringBuffer();
		Calendar now = Calendar.getInstance();
		
		int yy = now.get(now.YEAR);
		int mm = now.get(now.MONTH)+1;
		int dd = now.get(now.DAY_OF_MONTH);
		 
		sb.append(yy);
		sb.append("년 ");
		sb.append(mm);
		sb.append("월 ");
		sb.append(dd);
		sb.append("일");
		today = sb.toString();
		
		return today;
	}
	public int createAccountNo(){
		int accountNum = 0;
		int max = 999999;
		int min = 100000;
		accountNum = (int)(Math.random()*(max-min+1)+ min);
		// 로직을 짜세요
		// math.random... 100,000~999,999
		return accountNum;
	}
	
	public String getAccountType(){
		return accountType;
	}
	
	public int getMoney(){
		return money;
	}
	/*public void setMoney(int money){
		this.money = money;
	}
	public int getMoney(){
		return money;
	}
	
	public void setUid(String uid){
		this.uid = uid;
	}
	public String getUid(){
		return uid;
	}
	
	public void accountType(String accountType){
		this.accountNo = accountNo;
	}
	public String accountType(){
		return accountType;
	}*/
}
