package q1_answer;

public abstract class mobilePhone {

	private String OperatingSystem;
	private String Applicatin;

	public mobilePhone() {

		OperatingSystem = null;
		Applicatin = null;

	}

	public String getOperatingSystem() {
		return OperatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		OperatingSystem = operatingSystem;
	}

	public String getApplicatin() {
		return Applicatin;
	}

	public void setApplicatin(String applicatin) {
		Applicatin = applicatin;
	}

	public abstract boolean startApp();

}
