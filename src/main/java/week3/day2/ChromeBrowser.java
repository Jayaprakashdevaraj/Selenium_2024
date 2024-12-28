package week3.day2;

public class ChromeBrowser extends Browser{
	public void openIncognito() {
		System.out.println("Open the Incognito");
	}
public void clearCache() {
		System.out.println("clear the Cache in chrome broeser");
	}

public static void main(String[] args) {
	ChromeBrowser cb = new ChromeBrowser();
	cb.openURL();
	cb.navigateback();
	cb.closeBrowser();
	cb.openIncognito();
	cb.clearCache();
	cb.browserName = "ChromeBrwser";
}

}
