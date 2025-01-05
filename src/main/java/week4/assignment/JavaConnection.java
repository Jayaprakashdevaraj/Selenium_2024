package week4.assignment;

public class JavaConnection extends MySqlConnection{

	@Override
	public void connect() {
		System.out.println("Connect the database");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnect the database");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("Execute Update the from database");// TODO Auto-generated method stub
		
	}

	public void executeQuery() {
		System.out.println("Execute the query from mySQL database");
	}


}
