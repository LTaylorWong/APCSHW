public class Sarray3 {
    public String[] data;
    public int lastIndex;
    
    public Sarray3(){
	data = new String[5];
	lastIndex = 0;
    }
    
    public String toString() {
	String ans = "";
	for (int i = 0; i < data.length; i++) {
	    if (i < data.length - 1) {
		ans = ans + data[i] + ", ";
	    } else {
		ans = ans + data[i];
	    }
	}
	return ans;
    }
    
    public void expand() {
	if (lastIndex >= data.length) {
	    String[] ans = new String[data.length + 1];
	    for (int i = 0; i < data.length; i++){
		ans[i] = data[i];
	    }
	    data = ans;
	}
    }
    
    public String[] showList() {
	return data;
    }
    
    public boolean add(String i) {
	expand();
	data[lastIndex] = i;
	lastIndex = lastIndex + 1;
	return true;
    }
    
    public void add(String val, int index) {
	for (int i = lastIndex; i > 0; i--){
	    if (i > index) {
		data[i] = data[i - 1];
	    } else if (i == index) {
		data[i] = val;
		lastIndex = lastIndex + 1;
	    }
	}
    }
    
    public String get(int index) {
	return(data[index]);
    }
    
    public String set(String val, int index) {
	String original = data[index];
	data[index] = val;
	return original;
    }
    
    public int size() {
	return lastIndex;
    }
    
    public String remove(int index) {
	String original = data[index];
	String[] ans = new String[data.length - 1];
	int i = 0;
	//places all elements before the requested index in the new array
	for (i = i; i < index; i++) {
	    ans[i] = data[i];
	}
	//skip requested index, essentially removing it from the array
	//places all elements after the requested index in the array
	for (i = i; i < ans.length; i++) {
	    ans[i] = data[i+1];
	}
	data = ans;
	lastIndex = lastIndex - 1;
	return original;
    }

    public void shifter(newvalue){
	int i;
	for (i=last;newvalue<a[i]&&i>=0;i--){
	    a[i+1]=a[i];
	}
	a[i]=newvalue;
    }

    public void isort(n){
	int j;
	for (j=last;j<a.length;j--){
	    if (n.comparedTo(a[j])<0||n.comparedTo(a[j]>0)){
		shifter(n);
	    }
	}
    }

    /*
      selection sort:
      i=0
      look at the array from i to the end
      find min
      swap min for element i
      i=i++
     */


    public void ssort(){
	for(int i=0;i<data.length;i++){
	    for(int j=0;)


    
}

