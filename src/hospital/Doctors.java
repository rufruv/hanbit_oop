package hospital;

public class Doctors {
	String docName, docGen, docPhone, docEmail, docPosition, majorTreat ;
	int docId ;
	public String getGender(String docGen) {
		String result = " ";
		char ch = docGen.charAt(7);
		if (ch == '0' || ch == '7' || ch == '8' || ch == '9') {
			result = "다시 입력하세요";
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
}