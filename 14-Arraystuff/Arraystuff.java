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
   
 //14b


    public int sum67(int[] nums) {
	int sum = 0;
	for (int i = 0; i < nums.length; i++) {
	    if (nums[i] != 6) sum += nums[i];
	    else
		while (nums[i] != 7) i++;
	}
	return sum;
    }   

    public boolean more14(int[] nums) {
	int ones = 0;
	int fours = 0;
	for (int i = 0; i < nums.length; i++) {
	    if (nums[i] == 1) ones=ones+1;
	    if (nums[i] == 4) fours=fours+1;
	}
	return ones > fours;
    }

    public boolean tripleUp(int[] nums) {
	for (int i = 0; i <= nums.length - 3; i++)
	    if (nums[i + 1] == nums[i] + 1 && nums[i + 2] == nums[i] + 2)
		return true;
	return false;
    }

    public int[] tenRun(int[] nums) {
	boolean replace = false;
	int x = 0; 
	for (int i = 0; i < nums.length; i++) {
	    if (nums[i] % 10 == 0) {
		if (!replace) {
		    replace = true;
		    x= nums[i];
		} else
		    x= nums[i];
	    }
	    if (nums[i] % 10 != 0 && replace) nums[i] = x;
	}
	return nums;
    }

    public int freq(x){
	int counter=0;
	y=a[x];
	for (int i=0;i<a.length;i++){
	    if(a[i]==y){
		counter=counter+1;
	    }
	}
	return counter;
    }

