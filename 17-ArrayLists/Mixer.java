import java.io.*;
import java.util.*;

public class Mixer{
    private int[] a;
    private ArrayList<Integer> al = new ArrayList<Integer>;

    public Mixer(int n){
	a= new int[n];
	for(int i=0;i<a.length;i++){
	    a[i]=i;
	    ai.add(i)
	}
    }

    //-------------------

    public int[] Mix(){
	int place =0;
	while (unSaturated){
	    int rand = (int)Math.ceil(Math.random()*9);
	    if (a[rand]!=-1) && (place<10){
		result[place]=a[rand];
		a[rand]= -1;
		place= place +1;
	    }
	}
	return result;
    }

    public boolean unSaturated(){
 	for (int i=0;i<10;i++){
	    if (a[i]=i){
		return true;
	    }
	}
	return false;
    }
    
    public static void main(String[] args){
	Mixer m= new Mixer(10);
    }
    
}
