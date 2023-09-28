
//student_data
public class VariableEx {

	static String college_name="College";//static variable
	long contact=9898989898L;//instance variable
	
	public static void main(String[] args) {
	
		String name="stella"; //local variables
		int age=25;
		char gender='F';
		
		System.out.println("Student name is:"+name);
		System.out.println("Student age is:"+age);
		System.out.println("Student gender is:"+gender);
		
		VariableEx var=new VariableEx();
		System.out.println("Student contact is:"+var.contact);
		
		System.out.println("college name is:"+VariableEx.college_name);
		
		//VariableEx var1=new VariableEx();
		
	}
}



//syso--ctrl+space
//main()--ctrl+space