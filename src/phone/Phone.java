package phone;

public class Phone{
	public final static String KIND="삼성전화기";
	protected String receiver, call;
	
	public void setReceiver(String receiver){
		this.receiver = receiver;
	}
	public String getReceiver(){
		return receiver;
	}
	public void setCall(String call){
		this.call = call;
	}
	public String getCall(){
		return call;
	}
	@Override //겉은 바꾸지 않고 내부의 기능은 바꿀수 있다.
	public String toString() {
		/*return super.toString();  */ //원래 기능
		/*String myProp="";
		myProp = KIND+"를 사용해서"+receiver+"에게"+call+"이라고 했다";*/
		return KIND+"를 사용해서"+receiver+"에게"+call+"이라고 했다";
	}
	
}
