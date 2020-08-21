package q1_answer;

public class itslearning extends ios implements courses {

	String java, softwareSecurity;

	public String getJava() {
		return java;
	}

	public void setJava(String java) {
		this.java = java;
	}

	public String getSoftwareSecurity() {
		return softwareSecurity;
	}

	public void setSoftwareSecurity(String softwareSecurity) {
		this.softwareSecurity = softwareSecurity;
	}

	public itslearning(String java, String softwareSecurity) {
		super();
		this.java = java;
		this.softwareSecurity = softwareSecurity;
	}

	@Override
	public String listCourses(String a, String b) {
		// TODO Auto-generated method stub
		return a + "  " + b;
	}

}
