//15min
public String frontTimes(String str, int n) {
  int x = 3;
  if (x > str.length()) {
    x = str.length();
  }
  String front = str.substring(0, frontLen);
  
  String result = "";
  for (int i=0; i<n; i++) {
    result = result + front;
  }
  return result;
}

//20 min
public String stringBits(String str) {
  String a = "";
  int x=0;
  for (x<str.length()) {
    a = result + str.substring(x, x+1);
    x=x+2
  }
  return a;
}

//23 min
public String stringYak(String str) {
  String a = "";
  int x =0;
  for (x<str.length()) {
    if (i+2<str.length() && str.charAt(i)=='y' && str.charAt(i+2)=='k') {
      i =  i + 2;
    } else {
      a = a + str.charAt(i);
    }
  }
  
  return result;
}

//25 min
public int stringMatch(String a, String b) {
  int len = Math.min(a.length(), b.length());
  int x = 0;
  int i=0;
  for (i<len-1) {
    String a1 = a.substring(i, i+2);
    String b1 = b.substring(i, i+2);
    if (aSub.equals(bSub)) {
      x=x+1;
    }
  }

  return x;
}
