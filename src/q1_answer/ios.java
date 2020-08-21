package q1_answer;

public class ios extends mobilePhone {

	int screendpi = 500;
	String chargesocketType = "Lightning";

	@Override
	public boolean startApp() {

		return true;
	}

	public boolean closeApp() {
		return true;
	}

	public int getScreendpi() {
		return screendpi;
	}

	public void setScreendpi(int screendpi) {
		this.screendpi = screendpi;
	}

	public String getChargesocketType() {
		return chargesocketType;
	}

	public void setChargesocketType(String chargesocketType) {
		this.chargesocketType = chargesocketType;
	}

	public String listCourses(String a, String b) {
		// TODO Auto-generated method stub
		return a + " " + b;
	}

}
