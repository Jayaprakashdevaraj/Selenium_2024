package week4.assignment;

public class LoginPage extends BasePage{
	
	public void performCommonTasks() {
		performCommonTasksInChild();
		}
	
	public void performCommonTasksInChild() {
		System.out.println("perform the child Tasks");
	}
	public static void main(String[] args) {
		LoginPage lp =new LoginPage();
		lp.performCommonTasks();
		lp.findElement();
		lp.clickElement();
		lp.enterText();
		
	}
	

}
