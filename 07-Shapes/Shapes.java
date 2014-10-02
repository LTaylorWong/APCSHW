public class Shapes{
    
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
		
