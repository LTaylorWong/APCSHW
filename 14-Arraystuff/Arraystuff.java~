import java.util.*;

public class Arraystuff{
    private int[] a;
    private Random rnd;

    public Arraystuff(int n){
	a=new int[n];
	for (int i=0;i<a.length;i++){
	    a[i]=75+rnd.nextInt(76);
	}
    }

    public Arraystuff(){
	this(100);
    }
    public String toString(){
	String s="";
	for (int i=0;i<a.length;i++){
	    s=s+a[i]+", ";
	}
	s=s+a[a.length];
	return s;
    }

    public static void main(String[]args){
	Arraystuff as=new Arraystuff();
	System.out.println(as);
    }
}
