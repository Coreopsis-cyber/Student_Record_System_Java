//this class contains info about the modules available at the university such as the year, term, module descriptor info, records and final average grade for the module.

public class Module {

	private int year;

	private byte term;

	private ModuleDescriptor module;

	private StudentRecord[] records;

	private double finalAverageGrade;

	//overloaded constructor containing arguments (year, term, records, finalAverageGrade, and module)
	public Module(ModuleDescriptor module,
				  int year,
				  byte term,
				  StudentRecord[] records,
				  double finalAverageGrade){
		this.module = module;
		this.year = year;
		this.term = term;
		this.records = records;
		this.finalAverageGrade = finalAverageGrade;
	}
	//overloaded constructor containing arguments (year, term and module and finalAverageGrade)
	public Module(int year, byte term, ModuleDescriptor module,double finalAverageGrade ){
		this.module = module;
		this.year = year;
		this.term = term;
		this.finalAverageGrade = finalAverageGrade;

	}
	//overloaded constructor containing arguments (year, term and module)
	public Module(int year, byte term, ModuleDescriptor module ) {
		this.module = module;
		this.year = year;
		this.term = term;
	}
	// public getters for private instance
	public ModuleDescriptor getModule(){
		return module;
	}
	public int getYear(){
		return year;
	}
	public byte getTerm(){
		return term;
	}
	public StudentRecord[] getRecords(){
		return records;
	}
	public double getFinalAverageGrade(){
		return finalAverageGrade;
	}

	//method to calculate the final average grade
	public double calculateFinalAverageGrade(){
		double finalAverageGrade = 0.0;
		Student student = null;
		for(StudentRecord record : records)
			student = record.getStudent();
			finalAverageGrade += student.getGpa();
		double average = finalAverageGrade /records.length;
		return average;
	}

	//public setter for private instance
	public void setFinalAverageGrade(double finalAverageGrade) {
		this.finalAverageGrade = finalAverageGrade;
	}

	//toString method to print out info about a particular module
	@Override
	public String toString() {
		return "Module: |" +
				"year=" + year +
				"| term=" + term +
				"| module=" + module.getCode() +
				"| finalAverageGrade=" + finalAverageGrade +
				'|';
	}
}
