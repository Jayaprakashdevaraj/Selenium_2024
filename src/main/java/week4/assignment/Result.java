package week4.assignment;

public class Result extends JavaConnection{
	public static void main(String[] args) {
		
		Result r= new Result();
		r.connect();
		r.disconnect();
		r.executeUpdate();
		r.executeQuery();
	}

}
