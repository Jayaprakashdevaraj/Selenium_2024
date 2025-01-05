package week4.assignment;

public class APIClient {
	
	public void sendRequest(String endpoint) {
		System.out.println("Single input argument");
		
	}
	
public void sendRequest(String endpoint, String requestBody, String requestStatus) {
	System.out.println("Three input argument");
	}
public static void main(String[] args) {
	APIClient api = new APIClient();
	api.sendRequest("one");
	api.sendRequest("one", "Two", "Three");
}
}
