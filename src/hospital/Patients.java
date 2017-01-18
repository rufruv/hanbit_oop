package hospital;

public class Patients {
	String patName, patGen, patJumin, patEmail, patAddr, patPhone, patJob;
	int patID, nurId, docId ;
	
	public String getGender(String patJumin) {
		String result = " ";
		char ch = patJumin.charAt(7);
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
	
	public int getAge(String patJumin){
		int year  = Integer.parseInt(patJumin.substring(0,2)) + 1900; 
		int age = 2017- year; 
		return age;
	}
}
