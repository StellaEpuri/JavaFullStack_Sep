
public class CommandLineEx {

public static void main(String[] args) {//stella 12 27 25.5 true 

String name=args[0];

int i=Integer.parseInt(args[1]);
int j=Integer.parseInt(args[2]);

float f=Float.parseFloat(args[3]);

boolean b=Boolean.parseBoolean(args[4]);

int sum=i+j;

System.out.println("sum is:"+sum);

System.out.println(f);
System.out.println(b);


}

}
	
