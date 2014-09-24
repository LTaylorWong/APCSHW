/*WORKING!!!1111!!!*/

//nearHundred
public boolean nearHundred(int n) {
     return ((Math.abs (n-100)<= 10) || (Math.abs (n-200)<=10));
}
//teaParty
public int teaParty(int tea, int candy) {
  if (tea < 5 || candy < 5){
    return 0;
  }
  if(tea >= (2*candy) || candy >= (2*tea)){
    return 2;
  }
  else{
    return 1;
  }
}
//lastDigit
public boolean lastDigit(int a, int b, int c) {
  return (((a%10) == (b%10)) || ((a%10) == (c%10)) || ((b%10) == (c%10)));
}
