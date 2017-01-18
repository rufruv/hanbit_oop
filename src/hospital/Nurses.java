package hospital;

public class Nurses {
	String nurName, nurGen, nurPhone, nurEmail, nurPosition, majorJob ;
	int nurId;
	
	public void setNurName(String nurName){
		this.nurName = nurName ; 
	}
	public String getNurName(){
		return nurName ;
	}
	
	public void setNurGen(String nurGen){
		this.nurGen = nurGen ; 
	}
	public String getNurGen(){
		return nurGen ;
	}
	
	public void setNurPhone(String nurPhone){
		this.nurPhone = nurPhone ; 
	}
	public String getNurPhone(){
		return nurPhone ;
	}
	
	
	
	public String getGender(String nurGen) {
		String result = " ";
		char ch = nurGen.charAt(7);
		if (ch == '0' || ch == '7' || ch == '8' || ch == '9') {
			result = "주민번호 오류! 다시 입력하세요";
		}
		if (ch == '1' || ch == '3') {
			result = "남자";
		} else if (ch == '2' || ch == '4') {
			result = "여자";
		} else {
			result = "외국인";
		}
		return result;
	}
	
	public int getAge(String nurGen){
		int year  = Integer.parseInt(nurGen.substring(0,2)) + 1900; 
		int age = 2017- year; 
		return age;
	}
}
