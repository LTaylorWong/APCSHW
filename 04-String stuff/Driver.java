public String makeOutWord(String out, String word) {
  String s=out.substring(0,2);
  return s + word + out.substring (2, out.length());
}
public String firstHalf(String str) {
  int s=str.length()/2;
  return str.substring(0,s);
}
public boolean mixStart(String str) {
  if (str.length() < 3) return false;
  String s = str.substring(1, 3);
  if (s.equals("ix")) {
    return true;
  } else {
    return false;
  }
}
