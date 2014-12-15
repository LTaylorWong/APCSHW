import java.util.Arrays;

public class Searching{
    public Comparable[]a;
    public int last;

    public Searching(int n){
	a=new Comparable[n];
	last = 0;
    }
    public int compareTo (Object other){
	 Comparable x= (Comparable)other;
	return this.compareTo(x);
    }

    public Comparable lsearch(Comparable item){
	for (int i=0;i<a.length;i++){
	    if (a[i]==item){
		return item;
	    }
	}
	return null;
    }

    public Comparable bsearch(Comparable item){
	int l=0;
	int len=a.length;
	int half=len/2;
	
	if(item.compareTo(a[0])<0||item.compareTo(a[len])>0) return null;

	while (l!=len){
	    if(item.compareTo(a[half])==0){
		return item;
	    }else {
		if (item.compareTo(a[half])>0){
		    1=half+1;
		    half=(l+len)/2;
		}else{
		    len=half;
		    half=(l+len)/2;
		}
	    }
	}
	return null;
    }

    public Comparable rbsearch(Comparable item){
    }
    
