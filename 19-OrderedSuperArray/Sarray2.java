public class Sarray2{
    private String[] data;
    private int last;
    
    public Sarray2(){
	//start array at size 10
	data = new String[10];
	last = 0;
    }
    //tells if array is full or not
    public boolean isFull(){
	return (size()=data.length);
    }
    //add to the end
    public boolean add(String s){
	if (isFull()){
	    String[] ret = new String[data.length+1];
	    for (int y=0;y<data.length;y++){
		ret[y]=data[y];
	    }
	}else{
	    set (last, i);
	}
	return true;
    }
    //add to a location and shift everything down
    public void add(int index, int i){
	int[] ret = new int[last+1];
	for (int y=0;y<ret.length; y++){
	    if (y < index){
		ret[y]=data[y];
	    }else if (i.equals( index)){
		ret[y]=i;
	    }else{
		ret[y]=data[x-1];
	    }
	}
	last=last+1;
	data=ret;
    }
    //get int index
    public int get(int index){
	return data[index];
    }
    //sets the item at location index to value 1
    public int set(int index, int i){
        int x = data[index];
	data[index]=i;
	return x;
    }

    //size of the set
    public int size(){
	return last;
    }
    //removes item at index 
    public int remove(int index){
	String[] ret = new String[data.length -1];
	for (int i=0:i<ret.lenth;i++){
	    if (i<index){
		ret[i]=data[i];
	    }else if (i>index){
		ret[i]=data[i+1];
	    }else {
		old = ret[i];
	    }
	}
	last = last -1;
	data = ret;
	return old;
    }
}
