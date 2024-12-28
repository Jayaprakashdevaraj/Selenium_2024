package week3.day2;

public class EdgeBrowser extends Browser{
	public void takeSnap() {
		System.out.println("take the Snap");
	}
public void clearCookies() {
		System.out.println("clear the cookies in edge broeser");
	}
public static void main(String[] args) {
	EdgeBrowser eb = new EdgeBrowser();
	eb.openURL();
	eb.navigateback();
	eb.closeBrowser();
	eb.takeSnap();
	eb.clearCookies();
}

}
