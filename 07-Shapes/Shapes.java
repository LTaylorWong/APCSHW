public class Shapes{
    
    /*
    public String tri1(int h){
	String s = "";
	int x =h;
	int a;
	while (x<=h){
	    a=x;
	    while (x>0){
		s= s+"*";
		x=x-1
	    }
	    s=s+"\n";
	    a=a+1;
	}
	return s;
    }
    
    public String tri2(int h){
	String s="";
	int x=1;
	int a;
	while (x<=h){
	    a=h-x;
	    while (a>0){
		s=s+" ";
	    }
	    s=s+"*";
	    x=x+1
	}
	return s;
    }
} 



/*

_ _ *    a=2, b=1    row1   (5-1)/2= (length-row)/2
_ * * *  a=1, b=3    row2   
* * * * *   a=0, b=5    row3
		
n = 3 --> 5
n = 4 --> 7

length = 2n-1


1+2+2+2...
2r+1
row1 i=1
row2 i=3
row3 i=5
*/
		
    public String tri3(int h){
	String shape = "";
        int n=h;
	int length = 2n-1;
	for (int r=0;r<=length;r++){
	    stars=2r+1;
	    while (stars>0){
		shape = shape + "*";
		stars= stars-1
       }
	    shape=shape+"\n";
		 return shape;
}
}

    public String tri4(int h){
	String s = "";
	int i = 0;
	int x;
        while (i<=h) {
	    x = 0;
	    while (x<i) {
		s = s + " ";
		x++;
	    }
	    s=s+"\n";
	    i++;
	}
	return s;
    }
    
