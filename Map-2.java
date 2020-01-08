//word0
public Map<String, Integer> word0(String[] strings) {
  Map<String, Integer> map = new HashMap();
  for(String s : strings){
    map.put(s, 0);
  }
  return map;
}

//wordLen
public Map<String, Integer> wordLen(String[] strings) {
  Map<String, Integer> map = new HashMap();
  for(String s : strings){
    if(!map.containsKey(s)){
      map.put(s, s.length());
    }
  }
  return map;
}

//pairs
public Map<String, String> pairs(String[] strings) {
  Map<String, String> map = new HashMap();
  for(String s : strings){
    if(s.length() != 0){
      map.put(s.substring(0,1), s.substring(s.length() - 1));
    }
  }
  return map;
}

//wordCount
public Map<String, Integer> wordCount(String[] strings) {
  Map<String, Integer> map = new HashMap();
  for(String s : strings){
    if(!map.containsKey(s)){
      map.put(s, 1);
    }
    else map.put(s, map.get(s) + 1);
  }
  return map;
}

//firstChar
public Map<String, String> firstChar(String[] strings) {
  Map<String, String> map = new HashMap();
  for(String s : strings){
    String firstChar = s.substring(0,1);
    if(!map.containsKey(firstChar)){
      map.put(firstChar, s);
    }
    else{
      map.put(firstChar, map.get(firstChar) + s);
    }
  }
  return map;
}

//wordAppend
public String wordAppend(String[] strings) {
  String res = "";
  Map<String, Integer> map = new HashMap();
  for(String s : strings){
    if(!map.containsKey(s)){
      map.put(s, 1);
    }
    else{
      map.put(s, map.get(s) + 1);
      if(map.get(s) % 2 == 0) res += s;
    }
  }
  return res;
}

//wordMultiple
public Map<String, Boolean> wordMultiple(String[] strings) {
  Map<String, Boolean> map = new HashMap();
  for(String s : strings){
    if(!map.containsKey(s)) map.put(s, false);
    else map.put(s, true);
  }
  return map;
}

//allSwap
public String[] allSwap(String[] strings) {
  Map<Character, Integer> map = new HashMap();
  for(int i = 0; i < strings.length; i++){
    if(strings[i].length() == 0) continue;
    char c = strings[i].charAt(0);
    if(!map.containsKey(c)) map.put(c, i);
    else{
      int index = map.get(c);
      String temp = strings[index];
      strings[index] = strings[i];
      strings[i] = temp;
      map.remove(c);
    }
  }
  return strings;
}

//firstSwap
public String[] firstSwap(String[] strings) {
  Map<Character, Integer> map = new HashMap();
  for(int i = 0; i < strings.length; i++){
    if(strings[i].length() == 0) continue;
    char c = strings[i].charAt(0);
    if(!map.containsKey(c)) map.put(c, i);
    else{
      int index = map.get(c);
      if(index == -1) continue;
      String temp = strings[index];
      strings[index] = strings[i];
      strings[i] = temp;
      map.put(c, -1);
    }
  }
  return strings;
}
