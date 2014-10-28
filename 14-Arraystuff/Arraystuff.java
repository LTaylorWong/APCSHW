import java.util.*;

public class Arraystuff{
    private int[] a;
    
    public int find(int n){
	int x =0;
	int y=-1
	while (x<a.length && y==-1){
	    if (a[x].equals(n)){
		y=x;
	    }
	    x=x+1;
	}
	return y;
	    
    }

    public int maxVal(){
	int x = 0;
	int y=1;
	while (x<a.length){   
	if (a[x]>a[y]){
	    y=y+1;
	}
	x=x+1;
	}
	return x;
    }
    
   
