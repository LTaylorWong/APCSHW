public class Sarray{
    private int[] data; //should be object()
    private int location;
    public Sarray(){
	//start array at size 10
	data = new int[10];
	location = 0;
    }
    //tells if array is full or not
    public boolean isFull(){
	return (location>=data.length);
    }
    //add to the end
    public void addToEnd(int i){
	if (isFull()){
	}else{
	    set (location, i);
    }
    //add to a location and shift everything down
    public void addToLoc(int index, int i){

    }
    //get int index
    public int get(int index){
    }
    //set in index
    public void set(int index, int i){
	if (index>location){
	    location = index +1;
	}else{ 
	location++;
    }
    //size of the set
    public int size(){
	return data.length;
    }
    //remove
    public void remove(int index){
    }
    //grows array
    public void grow()
