import java.util.Scanner;

public class NestedIfEx {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter a country:");
		String country=scan.next();
		
		if(country.equals("india")) {
			
			System.out.println("enter a city:");
			String city=scan.next();
			
			
			if(city.equals("delhi")) {
				
				System.out.println("welcome to delhi");
			}
			else if(city.equals("hyderabad")) {
				
				System.out.println("welcome to hyderabad");
			}
			else {
				System.out.println("other parts of india");
			}
			
		}
		else {
			
			System.out.println("not india");
		}

	}

}
