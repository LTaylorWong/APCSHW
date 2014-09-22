import java.io.*;
import java.util.*;

public class greeter{
    //instance variables are almost always private
    //get access them with "accessor methods" get and set
    private String greeting =new String("HIIIIIIIIIIIIIIIIIII");
    /*Notes -the name is the same as the class name
            - there is no return type
	    -its ALWAYS public

	    a constuctor is run automartically when you instantiate teh class,
	    that is, if you have: greeter g=new greeter("Hello")
	    then Java will automatically call this constructor sending Hello
	    in as parameter f. It will then set the instance variable
	    greeting to what g refers to.
     */
    //constructors
    public greeter(String g){
	System.out.println("In the constructor");
	greeting =g
    }

    
    public void setGreeting(String s){
	greeting = s;
	//s refers to the string from before
    }
    
    //String is the return type, the type of data that we will
    //send back to the retun statement
    //void will return nothing
    public String getGreeting(){
	return greeting;
    }
    
    /* our original greet method just printed the greeting
       generall we want our methods to return information
     */
    
    public String greet(){
	return greeting;
    }

    public void ungreet(){
	System.out.println(greeting);
    }
}
