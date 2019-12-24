public int countYZ(String str) {
  str = str.toLowerCase();
  int count = 0;
  for(int i = 1; i < str.length(); i++){
    if(!Character.isLetter(str.charAt(i))){
      if(str.charAt(i-1) == 'y' || str.charAt(i-1) == 'z'){
        count++;
      }
    }
  }
  if(str.charAt(str.length()-1) == 'y' || str.charAt(str.length()-1) == 'z'){
    count++;
  }
  return count;
}

public String withoutString(String base, String remove) {
  String temp = "";
  for(int i = 0; i < base.length(); i++){
    if(i < base.length()-remove.length() + 1
    && base.substring(i,i+remove.length()).toLowerCase().equals(remove.toLowerCase())){
      i += remove.length() - 1;
    }
    else{
      temp += base.charAt(i);
    }
  }
  return temp;
}

public boolean equalIsNot(String str) {
  int isNum = 0;
  int notNum = 0;
  for(int i = 0; i < str.length() - 1; i++){
    if(str.substring(i, i+2).equals("is")){
      isNum++;
    }
  }
  for(int i = 0; i < str.length() - 2; i++){
    if(str.substring(i, i+3).equals("not")){
      notNum++;
    }
  }
  return isNum == notNum;
}

public boolean gHappy(String str) {
  for(int i = 0; i < str.length(); i++){
    if(str.charAt(i) == 'g'){
      if(str.length() == 1) return false;
      boolean temp = false;
      if(i != str.length() - 1){ // check to the right
        if(str.charAt(i + 1) == 'g') temp = true;
      }
      if(i != 0){ // check to the left
        if(str.charAt(i - 1) == 'g') temp = true;
      }
      if(!temp) return false; 
    }
  }
  return true;
}

public int countTriple(String str) {
  int num = 0;
  for(int i = 0; i < str.length() - 2; i++){
    char c = str.charAt(i);
    if(c == str.charAt(i+1) && c == str.charAt(i+2)){
      num++;
    }
  }
  return num;
}

public int sumDigits(String str) {
  int sum = 0;
  for(int i = 0; i < str.length(); i++){
    char c = str.charAt(i);
    if(Character.isDigit(c)){
      sum += Character.getNumericValue(c);
    }
  }
  return sum;
}

public String sameEnds(String string) {
  String longest = "";
  String temp = "";
  for(int i = 0; i < (string.length()) / 2; i++){
    temp = temp + string.charAt(i);
    if(string.substring(string.length() - 1 - i).equals(temp)){
      longest = temp;
    }
  }
  return longest;
}

public String mirrorEnds(String string) {
  String temp = "";
  for(int i = 0; i < string.length(); i++){
    if(string.charAt(i) == string.charAt(string.length()-1-i)){
      temp += string.charAt(i);
    }
    else break;
  }
  return temp;
}

public int maxBlock(String str) {
  int max = 0;
  int thisBlock = 0;
  char currentChar = ' ';
  for(int i = 0; i < str.length(); i++){
    if(str.charAt(i) == currentChar){
      thisBlock++;
    }
    else{
      if(max < thisBlock) max = thisBlock;
      currentChar = str.charAt(i);
      thisBlock = 1;
    }
  }
  if(max < thisBlock) max = thisBlock;
  return max;
}

public int sumNumbers(String str) {
  int sum = 0;
  for(int i = 0; i < str.length(); i++){
    if(Character.isDigit(str.charAt(i))){
      String num = "";
      int j = i;
      while(j < str.length() && Character.isDigit(str.charAt(j))){
        num += str.charAt(j);
        j++;
      }
      sum += Integer.parseInt(num);
      i = j - 1;
    }
  }
  return sum;
}

public String notReplace(String str) {
  String temp = "";
  for(int i = 0; i < str.length(); i++){
    if(i < str.length() - 1 && str.substring(i, i + 2).equals("is")
    && (i == 0 || !Character.isLetter(str.charAt(i - 1))) // check left char
    && (i == str.length() - 2 || !Character.isLetter(str.charAt(i + 2))) // check right char
    ){
      temp += "is not";
      i += 1;
    }
    else temp += str.charAt(i);
  }
  return temp;
}
