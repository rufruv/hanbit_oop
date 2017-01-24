package bank2;

import java.util.Calendar;
import util.RandomGenerator;

public class WageAccount extends Account {
	public WageAccount(String uid, String accountType, int money){  
		accountNo = RandomGenerator.getRandomNum(100000,999999); 
		createDate = Calendar.getInstance().get(Calendar.YEAR)+"년"
				   + Calendar.getInstance().get(Calendar.MONTH)+1+"월"
				   + Calendar.getInstance().get(Calendar.DAY_OF_MONTH)+"일" ;
		super.uid = uid;
		super.accountType= accountType;
		super.money = money;
	}

	@Override
	public String deposit(int money) {
		String result = "";
		if(checkMoney(money)){
			this.money+=money;
			result=Account.DEPOSIT_SUCCESS;
		}else{
			money=this.money;
			result=Account.DEPOSIT_FAIL;
		}
		return result;
	}
	
	@Override
	public String withdraw(int money) {
		String result = "";
		if(checkMoney(this.money-money)){
			this.money-=money;
			result=Account.WITHDRAW_SUCCESS;
		}else{
			money=this.money;
			result=Account.WITHDRAW_FAIL;
		}
		return result;
		/*this.money=(this.money>=money)?this.money-money:this.money;*/
	}

	@Override
	public boolean checkMoney(int money) {
		/*return(money>=0)?true:false;*/
		return money>=0;
	}
}
