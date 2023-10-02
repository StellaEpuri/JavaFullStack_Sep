import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter a name:");
		String name=scan.next();
		
		System.out.println("enter a number:");
		int i=scan.nextInt();

		System.out.println(name);
		
		System.out.println("number is:"+i);
		
	}

}




//ctrl+shift+o----- to import