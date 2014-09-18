public class Driver {
    public static void main(String[]args){
	greeter g1= new greeter();
	greeter g2 =new greeter();

	g1.greet();
	g2.greet();

	//cant do cuz istance variable is private
	//instead we can use a set method
	g1.greeting=new String ("HEY");
	g1.greet();
	g2.greet();
      
    }
}
