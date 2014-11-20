import java.io.*;
import java.util.*;

public class TwoD{
    public static void main(String[]args){
	int[][]a;
	a= new int[5][3];
	System.out.println(a.length);
	System.out.println(a[2].length);
	System.out.println(a[2][1]);

	for(int i=0;i<a.length;i++){
	    System.out.println("row "+i+" has length: "+a[1].length);
	    for(int j=0;j<a[i].length;j++){
		System.out.print(a[i][j]+",");
	    }
	    System.out.println();
	}
    }
}
