import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	ArrayList<Interger> i;
	i = new ArrayList<Interger>();
	Random r = new Random();
	for(int x=0;x<20;x++){
	    i.add(r.nextInt(20));
	}
	System.out.println(i);

	for(int y=0; y<i.length;y++){
	    if (i[y]==i[y+1]){
		i.remove(y+1);
	    }
	}
	
	System.out.println(i);
	    
    }
}
