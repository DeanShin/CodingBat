public String helloName(String name) {
  return "Hello " + name + "!";
}

public String makeAbba(String a, String b) {
  return a+b+b+a;
}

public String makeTags(String tag, String word) {
  return "<" + tag + ">" + word + "</" + tag + ">";
}

public String makeOutWord(String out, String word) {
  return out.substring(0,2) + word + out.substring(2);
}

public String extraEnd(String str) {
  String end = str.substring(str.length()-2);
  return end + end + end;
}

public String firstTwo(String str) {
  if(str.length()<=2) return str;
  return str.substring(0,2);
}

public String firstHalf(String str) {
  return str.substring(0,str.length()/2);
}

public String withoutEnd(String str) {
  if(str.length()<=2) return "";
  return str.substring(1,str.length()-1);
}

public String comboString(String a, String b) {
  if(a.length()<b.length()){
    return a+b+a;
  }
  return b+a+b;
}

public String nonStart(String a, String b) {
  return a.substring(1) + b.substring(1);
}

public String left2(String str) {
  if(str.length()<3) return str;
  return str.substring(2) + str.substring(0,2);
}

public String right2(String str) {
  if(str.length()<3) return str;
  return str.substring(str.length()-2) + str.substring(0, str.length()-2);
}

public String theEnd(String str, boolean front) {
  String s = "";
  if(front) s += str.charAt(0);
  else s += str.charAt(str.length()-1);
  return s;
}

public String withouEnd2(String str) {
  if(str.length()<3) return "";
  return str.substring(1,str.length()-1);
}

public String middleTwo(String str) {
  return str.substring(str.length()/2-1,str.length()/2+1);
}

public boolean endsLy(String str) {
  if(str.length()<2) return false;
  return str.substring(str.length()-2).equals("ly");
}

public String nTwice(String str, int n) {
  return str.substring(0,n) + str.substring(str.length()-n);
}

public String twoChar(String str, int index) {
  if(index + 2 > str.length() || index < 0) return str.substring(0,2);
  return str.substring(index, index + 2);
}

public String middleThree(String str) {
  return str.substring(str.length()/2-1,str.length()/2+2);
}

public boolean hasBad(String str) {
  if(str.length() < 3) return false;
  if(str.substring(0,3).equals("bad")) return true;
  if(str.length() < 4) return false;
  return str.substring(1,4).equals("bad");
}

public String atFirst(String str) {
  if(str.length()>1) return str.substring(0,2);
  if(str.length() == 1) return str.substring(0,1) + "@";
  return "@@";
}

public String lastChars(String a, String b) {
  String temp = "";
  if(a.length()==0) temp += "@";
  else temp += a.charAt(0);
  if(b.length()==0) temp += "@";
  else temp += b.charAt(b.length()-1);
  return temp;
}

public String conCat(String a, String b) {
  if(a.length()>0 && b.length()>0){
    if(a.charAt(a.length()-1) == b.charAt(0)){
      return a + b.substring(1);
    }
  }
  return a + b;
}

public String lastTwo(String str) {
  if(str.length() < 2) return str;
  return str.substring(0,str.length()-2) + 
  str.charAt(str.length()-1)
  + str.charAt(str.length()-2);
}

public String seeColor(String str) {
  if(str.length() >= 3 && str.substring(0,3).equals("red")){
    return "red";
  }
  if(str.length() >= 4 && str.substring(0,4).equals("blue")){
    return "blue";
  }
  return "";
}

public boolean frontAgain(String str) {
  if(str.length()<2) return false;
  return str.substring(0,2).equals(str.substring(str.length()-2));
}

public String minCat(String a, String b) {
  int length = Math.min(a.length(), b.length());
  return a.substring(a.length()-length)+b.substring(b.length()-length);
}

public String extraFront(String str) {
  if(str.length()>=2) str = str.substring(0,2);
  return str + str + str;
}

public String without2(String str) {
  if(str.length()<2 || !str.substring(0,2).equals(str.substring(str.length()-2))) return str;
  return str.substring(2);
}

public String deFront(String str) {    
  String temp = "";
  if(str.length() > 0 && str.charAt(0) == 'a') temp += "a";
  if(str.length() > 1 && str.charAt(1) == 'b') temp += "b";
  if(str.length() > 2) temp += str.substring(2);
  return temp;
}

public String startWord(String str, String word) {
  if(str.length() == 0 || str.length()< word.length()) return "";
  String temp = "";
  temp += str.charAt(0);
  int min = word.length();
  if(str.substring(1,min).equals(word.substring(1,min))) {
    return temp + word.substring(1,min);
  }
  return "";
}

public String withoutX(String str) {
  if(str.length()==0) return str;
  if(str.charAt(0) == 'x') str = str.substring(1);
  if(str.length()==0) return str;
  if(str.charAt(str.length()-1) == 'x') str = str.substring(0,str.length()-1);
  return str;
}

public String withoutX2(String str) {
  if(str.length() > 1 && str.charAt(1) == 'x'){
    str = str.charAt(0) + str.substring(2);
  }
  if(str.length() > 0 && str.charAt(0) == 'x'){
    str = str.substring(1);
  }
  return str;
}
