public String doubleChar(String str) {
  String s = "";
  for(int i = 0; i < str.length(); i++){
    s += str.charAt(i);
    s += str.charAt(i);
  }
  return s;
}

public int countHi(String str) {
  int num = 0;
  for(int i = 0; i < str.length() - 1; i++){
    if(str.charAt(i) == 'h' && str.charAt(i+1) == 'i'){
      num++;
      i++;
    }
  }
  return num;
}

public boolean catDog(String str) {
  int cats = 0;
  int dogs = 0;
  for(int i = 0; i < str.length()-2; i++){
    if(str.substring(i,i+3).equals("cat")){
      cats++;
      i += 2;
    }
    else if(str.substring(i,i+3).equals("dog")){
      dogs++;
      i += 2;
    }
  }
  return cats == dogs;
}

public int countCode(String str) {
  int num = 0;
  for(int i = 0; i < str.length() - 3; i++){
    if(str.charAt(i)=='c' && str.charAt(i+1)=='o'&& str.charAt(i+3)=='e'){
      num++;
      i+=3;
    } 
  }
  return num;
}

public boolean endOther(String a, String b) {
  a = a.toLowerCase();
  b = b.toLowerCase();
  if(a.length()<b.length()){
    return b.substring(b.length()-a.length()).equals(a);
  }
  return a.substring(a.length()-b.length()).equals(b);
}

public boolean xyzThere(String str) {
  for(int i = 0; i < str.length()-2; i++){
    if(str.substring(i, i+3).equals("xyz")){
      if(i != 0 && str.charAt(i-1) != '.') return true;
      if(i == 0) return true;
    }
  }
  return false;
}

public boolean bobThere(String str) {
  for(int i = 0; i < str.length()-2; i++){
    if(str.charAt(i) == 'b' && str.charAt(i+2) == 'b') return true;
  }
  return false;
}

public boolean xyBalance(String str) {
  for(int i = str.length()-1; i >= 0; i--){
    if(str.charAt(i) == 'y') return true;
    if(str.charAt(i) == 'x') return false;
  }
  return true;
}

public String mixString(String a, String b) {
  String temp = "";
  int min = Math.min(a.length(), b.length());
  int i = 0;
  for(i = 0; i < min; i++){
    temp += a.charAt(i);
    temp += b.charAt(i);
  }
  for(i = min; i < a.length(); i++){
    temp += a.charAt(i);
  }
  for(i = min; i < b.length(); i++){
    temp += b.charAt(i);
  }
  return temp;
}

public String repeatEnd(String str, int n) {
  String temp = str.substring(str.length()-n);
  String toRet = "";
  for(int i = 0; i < n; i++){
    toRet += temp;
  }
  return toRet;
}

public String repeatFront(String str, int n) {
  String temp = "";
  for(int i = n; i > 0; i--){
    temp += str.substring(0,i);
  }
  return temp;
}

public String repeatSeparator(String word, String sep, int count) {
  String temp = "";
  for(int i = 0; i < count - 1; i++){
    temp += word + sep;
  }
  if(count != 0) temp += word;
  return temp;
}

public boolean prefixAgain(String str, int n) {
  String toFind = str.substring(0,n);
  for(int i = 1; i < str.length() - n + 1; i++){
    if(str.substring(i, i + n).equals(toFind)) return true;
  }
  return false;
}

public boolean xyzMiddle(String str) {
  if(str.length() < 3) return false;
  boolean odd = str.length() % 2 == 1;
  if(odd){
    return str.substring((str.length()-1)/2 -1,(str.length()-1)/2+2).equals("xyz");
  }
  if(str.substring((str.length()/2)-2,str.length()/2 + 1).equals("xyz")){
    return true;
  }
  return str.substring(str.length()/2 - 1, str.length()/2 + 2).equals("xyz");
}

public String getSandwich(String str) {
  int leftIndex = -1;
  int rightIndex = -1;
  for(int i = 0; i < str.length() - 4; i++){
    if(str.substring(i, i + 5).equals("bread")){
      leftIndex = i;
      break;
    } 
  }
  if(leftIndex == -1) return "";
  for(int i = str.length() - 5; i >= 0; i--){
    if(str.substring(i,i+5).equals("bread")){
      rightIndex = i;
      break;
    }
  }
  if(leftIndex == rightIndex) return "";
  return str.substring(leftIndex + 5, rightIndex);
}

public boolean sameStarChar(String str) {
  for(int i = 0; i < str.length(); i++){
    if(str.charAt(i) == '*'){
      if(!(i == 0 || i == str.length()-1) && str.charAt(i - 1) != str.charAt(i + 1)) return false;
    }
  }
  return true;
}

public String oneTwo(String str) {
  String temp = "";
  for(int i = 0; i < str.length() - 2; i += 3){
    temp += str.charAt(i + 1); 
    temp += str.charAt(i + 2); 
    temp += str.charAt(i); 
  }
  return temp;
}

public String zipZap(String str) {
  String temp = "";
  for(int i = 0; i < str.length(); i++){
    if(i < str.length()-2 && (str.charAt(i) == 'z' && str.charAt(i+2) == 'p')) {
        temp += "zp";
        i += 2;
    }
    else {
      temp += str.charAt(i);
    }
  }
  return temp;
}

public String starOut(String str) {
  String temp = "";
  if(str.length() == 1 || (str.length() != 0 && str.charAt(1) != '*')){
    if(str.charAt(0) != '*') temp += str.charAt(0);
  }
  for(int i = 1; i < str.length()-1; i++){
    if(str.charAt(i - 1) != '*' && str.charAt(i) != '*' && str.charAt(i + 1) != '*'){
      temp += str.charAt(i);
    }
  }
  if(str.length() > 1 && str.charAt(str.length()-1) != '*' && str.charAt(str.length()-2) != '*'){
    temp += str.charAt(str.length()-1);
  }
  return temp;
}

public String plusOut(String str, String word) {
  String temp = "";
  for(int i = 0; i < str.length(); i++){
    if(i < str.length()-word.length() + 1
        && str.substring(i,i+word.length()).equals(word)){
      temp += word;
      i += word.length() - 1;
    }
    else{
      temp += '+';
    }
  }
  return temp;
}

public String wordEnds(String str, String word) {
  String temp = "";
  for(int i = 0; i < str.length() - word.length() + 1; i++){
    if(str.substring(i, i + word.length()).equals(word)){
      if(i != 0){
        temp += str.charAt(i - 1);
      }
      if(i != str.length() - word.length()){
        temp += str.charAt(i + word.length());
      }
    }
  }
  return temp;
}
