package week3.day2;

public class Browser {
	String browserName;
	int browserVersion;
	
	public void openURL() {
		System.out.println("Open the url");
	}
public void closeBrowser() {
		System.out.println("close the broeser");
	}
public void navigateback() {
	System.out.println("naviagte back");
	
}
	public static void main(String[] args) {
		
		Browser b =new Browser();
		b.closeBrowser();
		b.openURL();
		b.navigateback();
	}

}
