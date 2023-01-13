//this class contains the students enrolled at the university, it stores valid info about their id, name, gender, gpa and records.

public class Student {

	private int id;

	private String name;

	private char gender;

	private double gpa;

	private StudentRecord[] records;

	//overloaded constructor containing arguments (id, name, gender, records and gpa)
	public Student(int id, String name, char gender, StudentRecord[] records, double gpa){
		setId(this.id);
		setName(this.name);
		setGender(this.gender);
		this.gpa = gpa;
		this.records = records;
	}
	//overloaded constructor containing arguments (id, name and gender)
	public Student(int mId, String mName, char gender)
	{
		setId(mId);
		setName(mName);
		setGender(this.gender);
	}

	// public getters for private instance

	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public char getGender(){
		return gender;
	}
	public double getGpa(){
		return gpa;
	}
	public StudentRecord[] getRecord(){
		return records;
	}

	// public setters for private instances with required constraints

	//set ID so it is not null and is unique
	public void setId(int mId){
		//checks if it is not equal to null
		if(mId != 0) {
			id = mId;
		}else {
			System.out.println("ID was null");
			System.exit(1);
		}

	}

	//set gender to F,M,X or empty
	public void setGender(char gender){
		if(gender == 'M' || gender == 'F' || gender == 'X' || gender == '\0'){
			this.gender = gender;
		}else{
			System.out.println("Gender was not allowed character: F,M,X or blank");
			System.exit(1);
		}
	}

	//set name to something that is not null
	public void setName(String mName){
		if(mName == null){
			System.out.println("Name null");
			System.exit(1);
		}else{
			name = mName;
		}
	}

	public void setRecords(StudentRecord[] records){
		this.records = records;
	}
	public void setGpa(double gpa){
		this.gpa = gpa;
	}

	// prints info about a student in order of year and term
	public String printTranscript() {
		System.out.println("\t\t University of Knowledge - Official Transcript \n\n ID: " + getId() +"\n Name: "+ getName() +"\n GPA:" + getGpa() + "\n" );


		for (StudentRecord record:records){
			if (record.getModule().getYear() == 2019){
				if (record.getModule().getTerm() == 1){
					System.out.println("| "+ record.getModule().getYear() + " | " + record.getModule().getTerm() + " | " + record.getModule().getModule().getCode() + " | " + record.getFinalScore() + " |");
				}
			}
		}
		System.out.println(" ");
		for (StudentRecord record:records){
			if (record.getModule().getYear() == 2019){
				if (record.getModule().getTerm() == 2){
					System.out.println("| "+ record.getModule().getYear() + " | " + record.getModule().getTerm() + " | " + record.getModule().getModule().getCode() + " | " + record.getFinalScore() + " |");
				}
			}
		}
		System.out.println(" ");
		for (StudentRecord record:records){
			if (record.getModule().getYear() == 2020){
				if (record.getModule().getTerm() == 1){
					System.out.println("| "+ record.getModule().getYear() + " | " + record.getModule().getTerm() + " | " + record.getModule().getModule().getCode() + " | " + record.getFinalScore() + " |");
				}
			}
		}
		System.out.println(" ");
		System.out.println(" ");
		for (StudentRecord record:records){
			if (record.getModule().getYear() == 2020){
				if (record.getModule().getTerm() == 2){
					System.out.println("| "+ record.getModule().getYear() + " | " + record.getModule().getTerm() + " | " + record.getModule().getModule().getCode() + " | " + record.getFinalScore() + " |");
				}
			}
		}
		System.out.println(" ");

		return "";
	}
}