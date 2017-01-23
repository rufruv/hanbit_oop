package phone;

public class GallaxyNote extends Iphone {
	public final static String BRAND="갤럭시";
	private String size;
	
	 public void setSize(String size){
		 this.size = size;
	 }
	 public String getSize(){
		 return size;
	 }
	
	@Override
	public String toString() {
		return String.format("%s 때문에 %s한 상태에서 %s에서 %s으로 %s를 검색했습니다."
		                      , BRAND, move, size, receiver, data);
	}
	// 갤럭시노트 때문에 이동가능한 상태에서 대화면으로 네이버에서 날씨를 검색했다.
}
