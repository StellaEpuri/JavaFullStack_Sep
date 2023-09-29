
//parameterized and default 
//static and instance
public class MethodEx {

	void displayMsg() {//default and instance
		
		System.out.println("This is a default method");
		
	}
	public static String sayHi() {// default and static
		
		return "hello";
	}
	
	public void show(String name,float marks) {//instance and parameterized
		System.out.println("This is a parameterized method");
		System.out.println("marks of"+name+":"+marks);
	}
	public static void main(String[] args) {
		
		MethodEx obj=new MethodEx();
		
		obj.displayMsg();
		
		System.out.println(MethodEx.sayHi());
		
		obj.show("stella", 99);
		
		
	}

}
