package q1_answer;

public class android extends mobilePhone {

	int screendpi = 250;
	String chargesocketType = "Type-c";

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

}
