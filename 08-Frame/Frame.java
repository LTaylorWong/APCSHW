public class Frame{
  
     public String line(String c, int n){
	String s = "";
	for (int i=0;i<n;i++){
	    s=s+c;
	}
	return s;
     }
    public String frame(int r, int c){
	String s="";
	int x = 0;
        s=s+ line("*",c);
	s=s+"\n";
	int a =r-2;
	int b=c-2;
	int y=0;
	while (y<=a){
	    s=s+"*";
	    s=s+ line(" ",b);
	    s=s+"* \n";
	    y=y+1;}
	s=s+line("*",c);
	return s;
    }

 public String stringSplosion(String str) {
  String s = "";
  for (int i=0; i<str.length(); i++) {
    s = s + str.substring(0, i+1);
  }
  return s;
}

public String stringX(String str) {
  String s = "";
  for (int i=0; i<str.length(); i++) {
      if (!((i > 0) && (i < (str.length()-1)) && (str.substring(i, i+1).equals("x")))) {
      s = s + str.substring(i, i+1); 
    }
  }
  return s;
}
}
