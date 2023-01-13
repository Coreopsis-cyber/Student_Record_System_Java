//this class contains the students records, such as th modules they took, the marks they received, their final score and whether they were above the class average

public class StudentRecord {

	private Student student;

	private Module module;

	private double[] marks;

	private double finalScore;

	private Boolean isAboveAverage;

	//constructor containing arguments (
	public StudentRecord(Student student, Module module, double[] marks){
		this.student = student;
		this.module = module;
		this.marks = marks;
	}

	//public getters for private instances
	public Student getStudent(){
		return student;
	}
	public Module getModule(){
		return module;
	}
	public double[] getMarks(){
		return marks;
	}

	//method to calculate the final score of a student
	public double calculateFinalScore(){
		double[] weights = module.getModule().getContinuousAssignmentWeight();
		double calculatedScore;
		calculatedScore = 0.0;
		int i = 0;
		for (double mark: marks){
			calculatedScore += mark*weights[i];
			i ++;
		}
		return calculatedScore;
	}

	//public getter for private instance
	public double getFinalScore(){
		return finalScore;
	}

	//public setters for private instance
	public void setFinalScore(double finalScore){
		this.finalScore = finalScore;
	}

	//checks whether the student achieved above average in the module
	public boolean checkAboveAverage(){
		double grade = 0;
		grade = module.getFinalAverageGrade();
		if (grade > finalScore){
			isAboveAverage = true;
		}
		else{
			isAboveAverage = false;
		}
		return isAboveAverage;
	}

	//public getter for private instance
	public Boolean getAboveAverage() {
		return isAboveAverage;
	}

	//public setter for private instance
	public void setIsAboveAverage(Boolean isAboveAverage) {
		this.isAboveAverage = isAboveAverage;
	}

}

