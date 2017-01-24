package hospital;

public class Bmi extends Treatment {
	private double weight, height;
	
	public void setWeight(double weight){
		this.weight = weight;
	}
	public double getWeight() {
		return weight;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getHeight() {
		return height;
	}
	@Override
	public String treat() {
		String bmiResult = "";
		double bmi = weight / (height/10 * height/10) ;
		if (bmi > 30.0) {
			bmiResult = "고도비만";
		} else if (bmi > 25.0) {
			bmiResult = "비만";
		} else if (bmi > 23.0) {
			bmiResult = "과체중";
		} else if (bmi > 18.5) {
			bmiResult = "정상";
		} else {
			bmiResult = "저체중";
		}
		return bmiResult ;
	}
	@Override
	public String toString() {
		return String.format("BMI지수: %s", treat());
	}
}
