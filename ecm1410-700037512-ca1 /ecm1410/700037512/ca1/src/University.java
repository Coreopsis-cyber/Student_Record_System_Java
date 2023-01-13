public class University {

	private ModuleDescriptor[] moduleDescriptors;

	private Student[] students;

	private Module[] modules;

	private StudentRecord[] fullRecords;

	//constructor for the university class containing module descriptors students and modules
	public University(ModuleDescriptor[] moduleDescriptors, Student[] students, Module[] modules ){
		this.moduleDescriptors = moduleDescriptors;
		this.students = students;
		this.modules = modules;
	}


	/**
	 * @return The number of students registered in the system.
	 */
	public int getTotalNumberStudents() {
		int numberStudents = students.length;
		return numberStudents ;
	}

	/**
	 * @return The student with the highest GPA.
	 */
	public Student getBestStudent() {
		double highestGpa = 0.0;
		Student bestStudent = students[0];
		for (Student student : students){
			if (student.getGpa()>highestGpa){
				highestGpa = student.getGpa();
				bestStudent = student;
			}
		}

		return bestStudent;
	}

	/**
	 * @return The module transcript with the highest average score.
	**/
	public String getBestModule() {
		double max = 0.0;
		Module bestModule = modules[0];
		for (int i = 0; i < modules.length; i++){
			if (max < modules[i].getFinalAverageGrade())
			{
				max = modules[i].getFinalAverageGrade();
				bestModule = modules[i];
			}
		}

		return bestModule.toString();
	}

	public static void main(String[] args) {

	//initialise module
	ModuleDescriptor[] moduleDescriptor = new ModuleDescriptor[6];
	moduleDescriptor[0] = new ModuleDescriptor("ECM0002", "Real World Mathematics", new double[] {0.1, 0.3, 0.6});
	moduleDescriptor[1] = new ModuleDescriptor("ECM1400", "Programming", new double[] {0.25, 0.25, 0.25, 0.25});
	moduleDescriptor[2] = new ModuleDescriptor("ECM1406", "Data Structures", new double[] {0.25, 0.25, 0.5});
	moduleDescriptor[3] = new ModuleDescriptor("ECM1410", "Object-Oriented Programming", new double[] {0.2, 0.3, 0.5});
	moduleDescriptor[4] = new ModuleDescriptor("BEM2027", "Information Systems", new double[] {0.1, 0.3, 0.3, 0.3});
	moduleDescriptor[5]= new ModuleDescriptor("PHY2023", "Thermal Physics", new double[] {0.4, 0.6});

	//initialise students
	Student[] students = new Student[10];
	students[0] = new Student(1000, "Ana",'F');
	students[1] = new Student(1001, "Oliver", 'M');
	students[2] = new Student(1002, "Mary", 'F');
	students[3] = new Student(1003, "John", 'M');
	students[4] = new Student(1004, "Noah", 'M');
	students[5] = new Student(1005, "Chico", 'M');
	students[6] = new Student(1006, "Maria", 'F');
	students[7] = new Student(1007, "Mark", 'x');
	students[8] = new Student(1008, "Lia", 'F');
	students[9] = new Student(1009, "Rachel", 'F');

	//initialise modules
	Module[] module = new Module[7];
	module[0] = new Module(2019, (byte)1, moduleDescriptor[1], 7.85);
	module[1] = new Module(2019, (byte)1, moduleDescriptor[5], 7.280);
	module[2] = new Module(2019, (byte)2, moduleDescriptor[4], 7.482);
	module[3] = new Module(2019, (byte)2, moduleDescriptor[1],7.75);
	module[4] = new Module(2020, (byte)1, moduleDescriptor[2],8.325);
	module[5] = new Module(2020, (byte)1, moduleDescriptor[3],8.08);
	module[6] = new Module(2020, (byte)2, moduleDescriptor[0], 8.85);

	//initialise student records
	StudentRecord[] allRecords = new StudentRecord[40];
	allRecords[0] = new StudentRecord(students[0], module[0], new double[]{9, 10, 10, 10});
	allRecords[1] = new StudentRecord(students[1], module[0], new double[] {8, 8, 8, 9});
	allRecords[2]= new StudentRecord(students[2], module[0], new double[]{5, 5, 6, 5});
	allRecords[3]= new StudentRecord(students[3], module[0], new double[]{6, 4, 7, 9});
	allRecords[4]= new StudentRecord(students[4], module[0], new double[]{10, 9, 10, 9});
	allRecords[5] = new StudentRecord(students[5], module[1], new double[]{9,9});
	allRecords[6] = new StudentRecord(students[6], module[1], new double[]{6, 9});
	allRecords[7] = new StudentRecord(students[7], module[1], new double[]{5, 6});
	allRecords[8] = new StudentRecord(students[8], module[1], new double[]{9, 7});
	allRecords[9] = new StudentRecord(students[9], module[1], new double[]{8,5});
	allRecords[10] = new StudentRecord(students[0], module[2], new double[]{10, 10, 9.5, 10});
	allRecords[11] = new StudentRecord(students[1], module[2], new double[]{7, 8.5, 8.2, 8});
	allRecords[12] = new StudentRecord(students[2], module[2],new double[]{6.5, 7.0, 5.5, 8.5});
	allRecords[13] = new StudentRecord(students[3], module[2], new double[]{5.5, 5,6.5, 7 });
	allRecords[14] = new StudentRecord(students[4], module[2], new double[]{7, 5, 8, 6});
	allRecords[15] = new StudentRecord(students[5], module[3], new double[]{9, 10, 10, 10});
	allRecords[16] = new StudentRecord(students[6], module[3], new double[]{8, 8, 8, 9});
	allRecords[17] = new StudentRecord(students[7], module[3], new double[]{5, 5, 6, 5});
	allRecords[18] =new StudentRecord(students[8], module[3], new double[]{6, 4, 7, 9});
	allRecords[19] =new StudentRecord(students[9], module[3], new double[]{10, 9, 8, 9});
	allRecords[20] = new StudentRecord(students[0], module[4], new double[]{10, 10, 10});
	allRecords[21] = new StudentRecord(students[1], module[4], new double[]{8, 7.5, 7.5});
	allRecords[22] = new StudentRecord(students[2], module[4], new double[]{9,7,9});
	allRecords[23] = new StudentRecord(students[3], module[4], new double[]{9, 8, 7});
	allRecords[24] = new StudentRecord(students[4], module[4], new double[]{2, 7, 7});
	allRecords[25] = new StudentRecord(students[5], module[4], new double[]{10, 10, 10});
	allRecords[26] = new StudentRecord(students[6], module[4], new double[]{8, 7.5, 7.5});
	allRecords[27] = new StudentRecord(students[7], module[4], new double[]{10, 10, 10});
	allRecords[28] = new StudentRecord(students[8], module[4], new double[]{9, 8, 7});
	allRecords[29] = new StudentRecord(students[9], module[4], new double[]{8, 9, 10});
	allRecords[30] = new StudentRecord(students[0], module[5], new double[]{10, 9 , 10});
	allRecords[31] = new StudentRecord(students[1], module[5], new double[]{8.5, 9, 7.5});
	allRecords[32] = new StudentRecord(students[2], module[5], new double[]{10, 10, 5.5});
	allRecords[33] = new StudentRecord(students[3], module[5], new double[]{7, 7 ,7});
	allRecords[34] = new StudentRecord(students[4], module[5], new double[]{5, 6, 10});
	allRecords[35] = new StudentRecord(students[5], module[6], new double[]{8, 9, 8});
	allRecords[36] = new StudentRecord(students[6], module[6], new double[]{6.5, 9, 9.5});
	allRecords[37] = new StudentRecord(students[7], module[6], new double[]{8.5, 10, 8.5});
	allRecords[38] = new StudentRecord(students[8], module[6], new double[]{7.5, 8, 10});
	allRecords[39] = new StudentRecord(students[9], module[6], new double[]{10, 6, 10});

	//initialise university
	University universityOfKnowledge = new University(moduleDescriptor, students, module);

	//calculate final scores for every student in each module and check if they are above average
	for (StudentRecord record : allRecords){
		record.setIsAboveAverage(record.checkAboveAverage());
		record.setFinalScore(record.calculateFinalScore());
	}

	//add student records to students
	for(Student student : students){
		int i = 0;
		StudentRecord[] myRecords = new StudentRecord[4];
		for (StudentRecord record: allRecords){
			if (record.getStudent() == student){
				myRecords[i] = record;
				i++;
			}
		}
		student.setRecords(myRecords);
	}

	//calculating the gpa of students
	for(Student student: students){
		int i = 0;
		student.setGpa(0);
		double x = 0;
		while (i < 4){
			x += student.getRecord()[i].getFinalScore()/4;
			i++;
		}
		student.setGpa(x);
	}


	//Print Reports
  	System.out.println("The UoK has " + universityOfKnowledge.getTotalNumberStudents() + " students.");

	// best module
	System.out.println("The best module is:");
	System.out.println(universityOfKnowledge.getBestModule());

	// best student
	System.out.println("The best student is:");
	universityOfKnowledge.getBestStudent().printTranscript();
	}
}
