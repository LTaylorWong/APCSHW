import java.io.*;
import java.util.*;
public class Interval{

    private int low,high;
    private Random r=new Random();
    private static int numIntervals=0;
    
    public Interval(int l, int h){
	low=l;
	high=h;
    }
    public Interval(){
	int l=r.nextInt(100);
	int h=l+l+r.nextInt(100);
	low=l;
	high=h;
    }
    public String toString(){
	String s="";
	s="["+low+','+high+"]";
	return s;
    }
    public static void printstuff(){
	System.out.println("Stuff");
    }
    
    //--------------------main-------------------------
    public static void main(String[]args){
    
	Interval ival=new Interval();
	ival.printstuff();
	printstuff();

	Interval[]a=new Interval[10];
	for(int i=0;i<a.length;i++){
	    a[i]= new Interval();
	}
	System.out.println(Arrays.toString(a));
    }
}
