public int maxSpan(int[] nums) {
  int maxSpan = 0;
  for(int i = 0; i < nums.length - maxSpan; i++){
    int val = nums[i];
    int j = 0;
    for(j = nums.length - 1; j >= 0; j--){
      if(nums[j] == val){
        break;
      }
    }
    maxSpan = maxSpan < j - i + 1 ? j - i + 1 : maxSpan;
  }
  return maxSpan;
}

public int[] fix34(int[] nums) {
  int j = 0;
  for(int i = 0; i < nums.length - 1; i++){
    if(nums[i] == 3){
      while(j < nums.length){
        if(nums[j] == 4) break;
        j++;
      }
      nums[j] = nums[i + 1];
      nums[i + 1] = 4;
      j++;
    }
  }
  return nums;
}

public int[] fix45(int[] nums) {
  int j = 0;
  for(int i = 0; i < nums.length - 1; i++){
    if(nums[i] == 4 && nums[i+1] != 5){
      while(j < nums.length){
        if(nums[j] == 5){
          if(j == 0 || nums[j - 1] != 4) break;
        }
        j++;
      }
      if(j!=nums.length){
        nums[j] = nums[i + 1];
        nums[i + 1] = 5;
        i++;
        j++;
      }
    }
  }
  return nums;
}

public boolean canBalance(int[] nums) {
  int totalSum = 0;
  for(int n : nums){
    totalSum += n;
  }
  if(totalSum % 2 == 1) return false;
  int leftSum = 0;
  for(int i = 0; i < nums.length && leftSum < totalSum / 2; i++){
    leftSum += nums[i];
  }
  return leftSum == totalSum / 2;
}

public boolean linearIn(int[] outer, int[] inner) {
  int j = 0;
  for(int i = 0; i < inner.length; i++){
    int toFind = inner[i];
    while(j < outer.length && outer[j] < toFind){
      j++;
    }
    if(j == outer.length || toFind != outer[j]) return false;
  }
  return true;
}

public int[] squareUp(int n) {
  int[] arr = new int[n*n];
  for(int i = 0; i < n; i++){
    for(int j = n - 1; j >= n - 1 - i; j--){
      arr[n*i + j] = n - j;
    }
  }
  return arr;
}

public int[] seriesUp(int n) {
  int size = n * (n + 1) / 2;
  int[] arr = new int[size];
  int index = 0;
  for(int i = 1; i <= n; i++){
    for(int j = 1; j <= i; j++){
      arr[index] = j;
      index++;
    }
  }
  return arr;
}

public int maxMirror(int[] nums) {
  int max = 0;
  for(int i = 0; i < nums.length; i++) {
    int count = 0;
    for(int j = nums.length - 1; j >= 0 && i + count < nums.length; j--) {
      if(nums[i + count] == nums[j]) {
        count++;
      } 
      else {
        max = Math.max(max, count);
        count = 0;
      }
    }
    max = Math.max(max, count);
  }
  return max;
}

public int countClumps(int[] arr) {
  int numClumps = 0;
  boolean inClump = false;
  for(int i = 0; i < arr.length - 1; i++){
    if(inClump){
      if(arr[i] != arr[i - 1]) inClump = false;
    }
    if(!inClump && arr[i] == arr[i + 1]) {
      inClump = true;
      numClumps++;
    }
  }
  return numClumps;
}
