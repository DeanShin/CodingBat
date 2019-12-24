public int countEvens(int[] nums) {
  int count = 0;
  for(int num : nums){
    if(num % 2 == 0) count++;
  }
  return count;
}

public int bigDiff(int[] nums) {
  int max = Integer.MIN_VALUE;
  int min = Integer.MAX_VALUE;
  for(int num : nums){
    max = Math.max(num, max);
    min = Math.min(num, min);
  }
  return max - min;
}

public int centeredAverage(int[] nums) {
  int max = nums[0];
  int min = nums[0];
  int sum = 0;
  for(int num : nums){
    sum += num;
    if(num > max) max = num;
    if(num < min) min = num;
  }
  sum = sum - max - min;
  return sum / (nums.length - 2);
}

public int sum13(int[] nums) {
  int sum = 0;
  for(int i = 0; i < nums.length; i++){
    if(nums[i] == 13) i++;
    else sum += nums[i];
  }
  return sum;
}

public int sum67(int[] nums) {
  int sum = 0;
  boolean ignore = false;
  for (int num : nums){
    if(ignore){
      if(num == 7) ignore = false;
    }
    else{
      if(num == 6) ignore = true;
      else sum += num;
    }
  }
  return sum;
}

public boolean has22(int[] nums) {
  for(int i = 0; i < nums.length - 1; i++){
    if(nums[i] == 2 && nums[i + 1] == 2) return true;
  }
  return false;
}

public boolean lucky13(int[] nums) {
  for(int num : nums){
    if(num == 1 || num == 3) return false;
  }
  return true;
}

public boolean sum28(int[] nums) {
  int count = 0;
  for(int num : nums){
    if(num == 2) count++;
  }
  return count == 4;
}

public boolean more14(int[] nums) {
  int ones = 0;
  int fours = 0;
  for (int num : nums) {
    if(num == 1) ones++;
    if(num == 4) fours++;
  }
  return ones > fours;
}

public int[] fizzArray(int n) {
  int[] arr = new int[n];
  for(int i = 0; i < n; i++){
    arr[i] = i;
  }
  return arr;
}

public boolean only14(int[] nums) {
  for(int num : nums){
    if(num != 1 && num != 4) return false;
  }
  return true;
}

public String[] fizzArray2(int n) {
  String[] arr = new String[n];
  for(int i = 0; i < n; i++){
    arr[i] = String.valueOf(i);
  }
  return arr;
}

public boolean no14(int[] nums) {
  boolean no1 = true;
  boolean no4 = true;
  for(int num : nums){
    if(num == 1) no1 = false;
    if(num == 4) no4 = false;
  }
  return no1 || no4;
}

public boolean isEverywhere(int[] nums, int val) {
  for(int i = 0; i < nums.length-1; i++){
    if(nums[i] != val && nums[i+1]!= val) return false;
  }
  return true;
}

public boolean either24(int[] nums) {
  boolean has22 = false;
  boolean has44 = false;
  for(int i = 0; i < nums.length - 1; i++){
    if(nums[i] == 2 && nums[i + 1] == 2) has22 = true;
    if(nums[i] == 4 && nums[i + 1] == 4) has44 = true;
  }
  return has22 ^ has44;
}

public int matchUp(int[] nums1, int[] nums2) {
  int matches = 0;
  for(int i = 0; i < nums1.length; i++){
    int diff = Math.abs(nums1[i] - nums2[i]);
    if(diff > 0 && diff <= 2) matches++;
  }
  return matches;
}

public boolean has77(int[] nums) {
  if(nums.length < 2) return false;
  for(int i = 0; i < nums.length - 2; i++){
    if(nums[i] == 7 && (nums[i + 1] == 7 || nums[i + 2] == 7)) return true;
  }
  return nums[nums.length-2] == 7 && nums[nums.length-1] == 7;
}

public boolean has12(int[] nums) {
  boolean has1 = false;
  for(int num : nums){
    if(!has1){
      if(num == 1) has1 = true;
    }
    else{
      if(num == 2) return true;
    }
  }
  return false;
}

public boolean modThree(int[] nums) {
  for(int i = 0; i < nums.length - 2; i++){
    int rem = nums[i] % 2;
    if(nums[i + 1] % 2 == rem && nums[i + 2] % 2 == rem){
      return true;
    }
  }
  return false;
}

public boolean haveThree(int[] nums) {
  int num3s = 0;
  for(int i = 0; i < nums.length - 1; i++){
    if(nums[i] == 3){
      if(nums[i + 1] == 3) return false;
      num3s++;
    }
  }
  if(nums.length != 0 && nums[nums.length - 1] == 3) num3s++;
  return num3s == 3;
}

public boolean twoTwo(int[] nums) {  
  for(int i = 0; i < nums.length; i++){
    if(nums[i] == 2){
      boolean nextToTwo = false;
      if(i != 0 && nums[i - 1] == 2) nextToTwo = true;
      if(i != nums.length - 1 && nums[i + 1] == 2) nextToTwo = true;
      if(!nextToTwo) return false;
    }
  }
  return true;
}

public boolean sameEnds(int[] nums, int len) {
  for(int i = 0; i < len; i++){
    if(nums[i] != nums[nums.length - len + i]) return false;
  }
  return true;
}

public boolean tripleUp(int[] nums) {
  for(int i = 0; i < nums.length - 2; i++){
    int num = nums[i];
    if(nums[i+1] == num + 1 && nums[i+2] == num + 2){ return true; }
  }
  return false;
}

public int[] fizzArray3(int start, int end) {
  int[] arr = new int[end - start];
  for(int i = 0; i < end - start; i++){
    arr[i] = start + i;
  }
  return arr;
}

public int[] shiftLeft(int[] nums) {
  if(nums.length == 0) return nums;
  int first = nums[0];
  for(int i = 0; i < nums.length - 1; i++){
    nums[i] = nums[i+1];
  }
  nums[nums.length - 1] = first;
  return nums;
}

public int[] tenRun(int[] nums) {
  boolean beginChanging = false;
  int lastMult = 0;
  for(int i = 0; i < nums.length; i++){
    if(nums[i] % 10 == 0){
      beginChanging = true;
      lastMult = nums[i];
    }
    else if(beginChanging){
      nums[i] = lastMult;
    }
  }
  return nums;
}

public int[] pre4(int[] nums) {
  int index = nums.length;
  for(int i = 0; i < nums.length; i++){
    if(nums[i] == 4){
      index = i;
      break;
    }
  }
  int[] arr = new int[index];
  for(int i = 0; i < index; i++){
    arr[i] = nums[i];
  }
  return arr;
}

public int[] post4(int[] nums) {
  int size = 0;
  for(int i = nums.length - 1; i >= 0; i--){
    if(nums[i] == 4){
      size = i;
      break;
    }
  }
  int[] arr = new int[nums.length - size - 1];
  for(int i = 0; i < nums.length - size - 1; i++){
    arr[i] = nums[i + size + 1];
  }
  return arr;
}

public int[] notAlone(int[] nums, int val) {
  for(int i = 1; i < nums.length - 1; i++){
    if(nums[i] == val){
      int left = nums[i-1];
      int right = nums[i+1];
      if(left != val && right != val){
        nums[i] = left > right ? left : right;
      }
    }
  }
  return nums;
}

public int[] zeroFront(int[] nums) {
  if(nums.length < 2) return nums;
  int i = 0;
  int j = 0;
  while(j < nums.length){
    if(nums[j] == 0){
      int temp = nums[i];
      nums[i] = nums[j];
      nums[j] = temp;
      i++;
    }
    j++;
  }
  return nums;
}

public int[] withoutTen(int[] nums) {
  int[] arr = new int[nums.length];
  int i = 0;
  int j = 0;
  while(i < nums.length){
    if(nums[i] != 10){
      arr[j] = nums[i];
      j++;
    }
    i++;
  }
  return arr;
}

public int[] zeroMax(int[] nums) {
  int largestOdd = 0;
  for(int i = nums.length - 1; i >= 0; i--){
    if(nums[i] == 0){
      nums[i] = largestOdd;
    }
    else if(nums[i] % 2 == 1 && nums[i] > largestOdd){
      largestOdd = nums[i];
    }
  }
  return nums;
}

public int[] evenOdd(int[] nums) {
  int i = 0;
  int j = 0;
  while(j < nums.length){
    if(nums[j] % 2 == 0){
      int temp = nums[i];
      nums[i] = nums[j];
      nums[j] = temp;
      i++;
    }
    j++;
  }
  return nums;
}

public String[] fizzBuzz(int start, int end) {
  String[] arr = new String[end - start];
  for(int i = start; i < end; i++){
    if(i % 15 == 0){
      arr[i - start] = "FizzBuzz";
    }
    else if (i % 3 == 0){
      arr[i - start] = "Fizz";
    }
    else if (i % 5 == 0){
      arr[i - start] = "Buzz";
    }
    else {
      arr[i - start] = String.valueOf(i);
    }
  }
  return arr;
}
