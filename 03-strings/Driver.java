public class Driver{
    public static void main(String[]args){
	String s="clark kent";
	int x= s.indexOf(" ");
	String f=s.substring(0,x);
	System.out.println("First name:"+f);
	String l=s.substring(x+1,s.length());
	System.out.println("Last name:"+l);
    }

}
