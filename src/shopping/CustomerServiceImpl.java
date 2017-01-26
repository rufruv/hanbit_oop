package shopping;

public class CustomerServiceImpl implements CustomerService {
	private int i;	   // 필드에서는 초기화하지 않는다. 따라서 생성자에서 !
	Customer customer; // 이걸 정의함으로써 인터페이스가 속성까지 가질수 있게 된다. (연관관계)
	Product[] cart;
	 /* TV[] t ;         // Product가 없다면...     
	Cleaner[] c ; */
	public CustomerServiceImpl() {
		customer = new Customer();  // 초기화는 생성자에서 !
		cart = new Product[4];
		/*t = new TV[10]; 
		c = new Cleaner[10]; */
		i=0; //초기화
	}
/**
 * 물건을 구매시 현재 금액과 차이를 보고
 * 구매가능한지를 따진다.
 * 만약 가진 돈이 작으면 잔액이 부족합니다라고 한다.  
 * */
	@Override
	public String buy(Product product) {
		String result="잔액부족";
		/*int money = customer.getMoney();*/
		if(customer.getMoney() > product.getPrice()){
			/*money = money - product.getPrice();*/
			customer.setMoney(customer.getMoney()-product.getPrice());
			add(product);
			result = "카트에 추가됨";	
		}
		return result;
	}

	@Override
	public void add(Product product) {
		/* Product[] cart = customer.getCart()[i]=product;*/
		 cart[i] = product;
		 i++;
	}
	
/**
 * 쇼핑을 마치고 영수증을 출력한다.
 * TV ... 300
 * 지금 상황에선 3개만 구입한 내용이 나온다.
 * */
	@Override
	public String getBill() {
		String bill = "";
		/*i=0;*/
		for(int ioi=0; ioi<i; ioi++){
			/*bill+=customer.getCart()[i].toString()+"\n";*/
			bill+=cart[ioi].toString()+"\n";
			/*i++;*/
		}
		return bill;
	}
	
}
