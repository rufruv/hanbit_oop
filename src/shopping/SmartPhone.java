package shopping;

public class SmartPhone extends Product{
	private String giga;
	
	public SmartPhone(){
		super(300);
	}
	@Override
	public String getName() {
		return "스마트폰";
	}

	public String getGiga() {
		return giga;
	}
	public void setGiga(String giga) {
		this.giga = giga;
	}

	@Override
	public String toString() {
		/*return "SmartPhone [name=" + name + ", price=" + super.getPrice() + "]";*/
		return String.format("품명: %s ----- 금액: %d", getName(), super.getPrice());
	}
}
