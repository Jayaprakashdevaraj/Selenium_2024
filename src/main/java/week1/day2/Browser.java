package week1.day2;

public class Browser {
	float browserVersion =0f;
	
	public void launchBrowser() {
		System.out.println("browser launched successfully");
	}
	public void loadURL() {
		System.out.println("URL loaded successfully");
		
	}
	public static void main(String[] args) {
		Browser chrome = new Browser();
		Browser edge = new Browser();
		
		System.out.println("--------------Chrome Browser-----------");
		chrome.launchBrowser();
		chrome.loadURL();
		chrome.browserVersion =12.9f;
		System.out.println("chrome browser version is "+chrome.browserVersion);
		
		
		System.out.println("-------------edge browser--------------");
		edge.launchBrowser();
		edge.loadURL();
		edge.browserVersion =14.7f;
		System.out.println("edge browser version is "+edge.browserVersion);
		
	}

}
