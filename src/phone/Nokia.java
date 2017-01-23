package phone;

public class Nokia extends Phone{
	public final static String BRAND="NOKIA";
	protected String move;
	protected boolean portable;  // 이동성
	
	protected void setMove(String move){
		this.move=move;
	}
	public String getMove(){
		return move;
	}
	public void setPortable(boolean portable){
		if(portable){
			setMove("이동 가능");
		}else{
			setMove("이동 불가능");
		}
		this.portable = portable;
	}
	public boolean isPortable(){
		return portable;
	}
	@Override
	public String toString() {
		return String.format("%s 때문에 %s한 상태에서 %s에게 %s이라고 했다"
				            , BRAND, this.move, super.receiver, super.call);
	}
}
