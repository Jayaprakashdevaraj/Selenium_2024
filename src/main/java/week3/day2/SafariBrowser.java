package week3.day2;

public class SafariBrowser extends Browser{
	public void readMode() {
		System.out.println("enable read mode");
	}
public void fullScreenMode() {
		System.out.println("enable Full screen mode");
	}
public static void main(String[] args) {
	
	SafariBrowser sb = new SafariBrowser();
		sb.openURL();
		sb.navigateback();
		sb.closeBrowser();
		sb.readMode();
		sb.fullScreenMode();
	
	
}


}
