//this class contains module descriptors such as the module code, name and the weight of each assignment

public class ModuleDescriptor {

	private String code;

	private String name;

	private double[] continuousAssignmentWeights;

	/*constructor containing 3 arguments (course code, course name
	and array of weights of the continuous assessments)*/
	public ModuleDescriptor(String mCode, String mName, double[] mContinuousAssignmentWeights) {
		setCode(mCode);
		setName(mName);
		setContinuousAssignmentWeight(mContinuousAssignmentWeights) ;
	}

	//public setters for private instances

	//verifying that name is not null
	public void setCode(String mCode) {
		if (mCode == null) {
			System.out.println("Code null");
			System.exit(1);
		} else {
			code = mCode;
		}
	}

	//verifying that name is not null
	public void setName(String mName) {
		if (mName == null) {
			System.out.println("Name null");
			System.exit(1);
		} else {
			name = mName;
		}
	}
 	//setting up continuous assignment weights so they are non negative and sum to 1
	public void setContinuousAssignmentWeight(double[] mContinuousAssignmentWeights) {
		for (double mContinuousAssignmentWeight : mContinuousAssignmentWeights)
			if (!(mContinuousAssignmentWeight <= 0)) {
				double sum = 0;
				for (double assignmentWeight : mContinuousAssignmentWeights) {
					sum = sum + assignmentWeight;
				}
				if (sum != 1) {
					System.out.println("Invalid weighing");
					System.exit(1);
				} else {
					continuousAssignmentWeights = mContinuousAssignmentWeights;
				}
			} else {
				System.out.println("Weights are negative");
				System.exit(1);
			}

	}
	// public getters for private instance
	public double[] getContinuousAssignmentWeight() {
		return continuousAssignmentWeights;
	}
	public String getCode(){
		return code;
	}

	public String getName(){
		return name;
	}
}