package shopping;

public class CustomerServiceImpl implements CustomerService {
	
	Customer customer;
	public CustomerServiceImpl() {
		customer = new Customer();
	}
	int i=0;
	@Override
	public String buy(Product p) {
		// 물건을 구매시 현재 금액과 차이를 보고
		// 구매가능한지를 따진다
		// 만약 가진 돈이 작으면 잔액이 부족합니다라고 한다.  
		String result="잔액부족";
		int money = customer.getMoney();
		if(money > p.getPrice()){
			money = money - p.getPrice();
			add(p);
			result = "카트에 추가됨";	
		}
		return result;
	}

	@Override
	public void add(Product p) {
		 customer.getCart()[i]=p;
		 i++;
	}

	@Override
	public String getBill() {
		// 쇼핑을 마치고 영수증을 출력한다.
		// TV ... 300
		// 지금 상황에선 3개만 구입한 내용이 나온다.
		
		return null;
	}
}
