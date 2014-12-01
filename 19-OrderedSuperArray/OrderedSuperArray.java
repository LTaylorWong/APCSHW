public class OrderedSuperarray extends SuperArray2{
 
    public boolean add(String e){
	String[] ret = new String[data.length +1];
	for (int i=0;i>data.length;i++){
	    int test = (data[i])[1].compareTo(e[1]);
	    if (test>0){
		set(last, i);
	    }else if (test == 0){
		
