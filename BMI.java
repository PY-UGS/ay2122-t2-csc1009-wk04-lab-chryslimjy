package lab4;

public class BMI {

	double BMI;
	double weightInPounds;
	double weightInKG;
	double heightInInches;
	
	public static final double POUND = 0.45359237;
	public static final double INCH = 0.0254;
	

	double heightInMeters;
	String interpretation;

	public BMI(double weight, double height) {
		this.weightInPounds = weight;
		this.heightInInches = height;
	}
	
	
	public double getWeightInPounds() {
		return weightInPounds;
	}

	public void setWeightInPounds(double weightInPounds) {
		this.weightInPounds = weightInPounds;
	}

	public double getHeightInInches() {
		return heightInInches;
	}

	public void setHeightInInches(double heightInInches) {
		this.heightInInches = heightInInches;
	}
	
	
	

	public void convertToKG() {
		weightInKG = weightInPounds * POUND;
	}

	public void convertToMeters() {
		heightInMeters = heightInInches * INCH;
	}

	public double calculateBMI() {
		
		convertToKG();
		convertToMeters();
		
		BMI = weightInKG / (Math.pow(heightInMeters,2));
		
		return BMI;
	}
	
	public String interprete() {
		double getBMI = calculateBMI();
		
		if(getBMI >=30) {
			interpretation = "Obese";
		}else if(getBMI < 30 && getBMI >= 25.0) {
			interpretation = "Overweight";
		}
		else if(getBMI < 25 && getBMI >= 18.5) {
			interpretation = "Normal";
		}
		else {
			interpretation = "Underweight";
		}
		
		return interpretation;
	}

}
