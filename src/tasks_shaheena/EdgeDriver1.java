package tasks_shaheena;

public class EdgeDriver1 implements WebDriver1  {
	
	
	public EdgeDriver1() {
		System.out.println("If this constructor is called, open  Edge Browser directly");
		
	}

	@Override
	public void get_url(String Url) {
		System.out.println("if this method is called, provided url (as input parameter)  will be open in Edgee Browser");
		
		
	}

	@Override
	public void close() {
		System.out.println("if this method is called, Edge Browser current window will be closed");

		
	}

	@Override
	public void quit() {
		System.out.println("If this method is called, all Edge Browser 's open windows will be closed ");
	
		
	}

}
