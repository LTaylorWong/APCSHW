import java.io.*;
import java.util.*;

public class greeter{
    //instance variables are almost always private
    //get access them with "accessor methods" get and set
    private String greeting =new String("HIIIIIIIIIIIIIIIIIII");
    
    public void setGreeting(String s){
	greeting = s;
    }
    
    public void greet(){
	//String greeting = new String ("HEYYYYY");
	System.out.println(greeting);
    }

    public void ungreet(){
	System.out.println(greeting);
    }
}
