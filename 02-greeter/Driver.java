public class Driver {
    public static void main(String[]args){
	greeter g1= new greeter();
	greeter g2 =new greeter();

	g1.greet();
	g2.greet();

	//cant do cuz istance variable is private
	//instead we can use a set method
	g1.setGreeting(new String ("HEY"));
      
	//here, we're using the string literal Hi there! and Java just returns
	//it without grabbing a block of memory
	g2.setGreeting("Hi there!");
	
	System.out.println(g1.greet());
	System.out.println(g2.greet());


	String s =g1.getGreeting();
	System.out.println("g1's greeting is: "+s);
	System.out.println("g2's greeting is: "+g2.getGreeting());
	
	
    }
}
