public boolean scoresIncreasing(int[] scores) {
  for(int i = 0; i < scores.length - 1; i++){
    if(scores[i] > scores[i+1]) return false;
  }
  return true;
}

public boolean scores100(int[] scores) {
  for(int i = 0; i < scores.length - 1; i++){
    if(scores[i] == 100 && scores[i+1] == 100) return true;
  }
  return false;
}

public boolean scoresClump(int[] scores) {
  for(int i = 0; i < scores.length - 2; i++){
    if(scores[i+1] - scores[i] <= 2 && scores[i+2] - scores[i] <= 2)
      return true;
  }
  return false;
}

public int scoresAverage(int[] scores) {
    int firstHalfAverage = average(scores, 0, scores.length / 2);
    int secondHalfAverage = average(scores, scores.length / 2, scores.length);
    return Math.max(firstHalfAverage, secondHalfAverage);
}
public int average(int[] scores, int start, int end){
  int sum = 0;
  for(int i = start; i < end; i++){
    sum += scores[i];
  }
  return sum / (end - start);
}

public int wordsCount(String[] words, int len) {
  int num = 0;
  for(String word : words){
    if(word.length() == len) num++;
  }
  return num;
}

public String[] wordsFront(String[] words, int n) {
  String[] arr = new String[n];
  for(int i = 0; i < n; i++){
    arr[i] = words[i];
  }
  return arr;
}

public List wordsWithoutList(String[] words, int len) {
  int index = 0;
  ArrayList<String> list = new ArrayList<String>();
  for(String word : words){
    if(word.length() != len){
      list.add(index, word);
      index++;
    }
  }
  return list;
}

public boolean hasOne(int n) {
  while(n != 0){
    if(n % 10 == 1) return true;
    n = n / 10;
  }
  return false;
}

public boolean dividesSelf(int n) {
  int num = n;
  while(num != 0){
    if(num % 10 == 0 || n % (num % 10) != 0) return false;
    num = num / 10;
  }
  return true;
}

public int[] copyEvens(int[] nums, int count) {
  int[] arr = new int[count];
  int i = 0;
  for(int j = 0; j < nums.length && i < count; j++){
    if(nums[j] % 2 == 0) {
      arr[i] = nums[j];
      i++;
    }
  }
  return arr;
}

public int[] copyEndy(int[] nums, int count) {
  int[] arr = new int[count];
  int i = 0;
  for(int j = 0; j < nums.length && i < count; j++){
    int n = nums[j];
    if((n >= 0 && n <= 10) || (n >= 90 && n <= 100)){
      arr[i] = n;
      i++;
    }
  }
  return arr;
}

public int matchUp(String[] a, String[] b) {
  int count = 0;
  for(int i = 0; i < a.length; i++){
    if(a[i].length() != 0 && b[i].length() != 0 && a[i].charAt(0) == b[i].charAt(0)){
      count++;
    }
  }
  return count;
}

public int scoreUp(String[] key, String[] answers) {
  int score = 0;
  for(int i = 0; i < key.length; i++){
    if(key[i].equals(answers[i])) score += 4;
    else if (answers[i].equals("?")) score += 0;
    else score--;
  }
  return score;
}

public String[] wordsWithout(String[] words, String target) {
  int count = 0;
  for(String word : words){
    if(!word.equals(target)) count++;
  }
  String[] without = new String[count];
  int index = 0;
  for(String word : words){
    if(!word.equals(target)){
      without[index] = word;
      index++;
    }
  }
  return without;
}

public int scoresSpecial(int[] a, int[] b) {
  return largestSpecial(a) + largestSpecial(b);
}
public int largestSpecial(int[] arr){
  int largest = 0;
  for(int n : arr){
    if(n % 10 == 0 && n > largest) largest = n;
  }
  return largest;
}

public int sumHeights(int[] heights, int start, int end) {
  int sum = 0;
  for(int i = start; i < end; i++){
    sum += Math.abs(heights[i] - heights[i + 1]);
  }
  return sum;
}

public int sumHeights2(int[] heights, int start, int end) {
  int sum = 0;
  for(int i = start; i < end; i++){
    int diff = heights[i] - heights[i+1];
    if(diff < 0) diff *= -2;
    sum += diff;
  }
  return sum;
}

public int bigHeights(int[] heights, int start, int end) {
  int giantSteps = 0;
  for(int i = start; i < end; i++){
    if(Math.abs(heights[i] - heights[i+1]) >= 5) giantSteps++;
  }
  return giantSteps;
}

public int userCompare(String aName, int aId, String bName, int bId) {
  if(aName.compareTo(bName) < 0) return -1;
  if(aName.compareTo(bName) > 0) return 1;
  if(aId < bId) return -1;
  if(aId > bId) return 1;
  return 0;
}

public String[] mergeTwo(String[] a, String[] b, int n) {
  int ai = 0;
  int bi = 0;
  int ci = 0;
  String[] c = new String[n];
  while(ci < n){
    if(a[ai].compareTo(b[bi]) < 0){
      c[ci] = a[ai];
      ai++;
      ci++;
    }
    else if(a[ai].compareTo(b[bi]) > 0){
      c[ci] = b[bi];
      bi++;
      ci++;
    }
    else{
      c[ci] = a[ai];
      ai++;
      bi++;
      ci++;
    }
  }
  return c;
}

public int commonTwo(String[] a, String[] b) {
  int i = 0;
  int j = 0;
  int count = 0;
  while(i < a.length && j < b.length){
    if(a[i].compareTo(b[j]) > 0){
      j++;
    }
    else if(a[i].compareTo(b[j]) < 0){
      i++;
    }
    else {
      count++;
      String temp = a[i];
      while(i < a.length && a[i].equals(temp)){
        i++;
      }
      while(j < b.length && b[j].equals(temp)){
        j++;
      }
    }
  }
  return count;
}
