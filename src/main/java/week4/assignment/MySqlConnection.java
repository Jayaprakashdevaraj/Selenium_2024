package week4.assignment;

public abstract class MySqlConnection implements DatabaseConnection{
	
	@Override
	public void connect() {
		System.out.println("Connect the mySQL database");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnect the mySQL database");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("Execute Update the from mySQL database");	
	}
	public abstract void executeQuery();

}
