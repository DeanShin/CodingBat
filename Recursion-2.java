//backtracking algorithm to find whether a sum can be constructed from an array of numbers

public boolean groupSum(int start, int[] nums, int target) {
  if(start >= nums.length) return target == 0;
  if(target == 0) return true;
  if(groupSum(start + 1, nums, target)) return true;
  return groupSum(start + 1, nums, target - nums[start]);
}

//same as above, except all sixes have to be used.

public boolean groupSum6(int start, int[] nums, int target) {
  if(start >= nums.length) return target == 0;
  if(nums[start] != 6 && groupSum6(start + 1, nums, target)) return true;
  return groupSum6(start + 1, nums, target - nums[start]);
}

//same as first, but chosen numbers cannot be adjacent

public boolean groupNoAdj(int start, int[] nums, int target) {
  if(start >= nums.length) return target == 0;
  if(target == 0) return true;
  if(groupNoAdj(start + 1, nums, target)) return true;
  return groupNoAdj(start + 2, nums, target - nums[start]);
}

//all multiples of five have to be included and a one immediately after a multiple of five is skipped.

public boolean groupSum5(int start, int[] nums, int target) {
  if(start >= nums.length) return target == 0;
  if(nums[start] % 5 == 0) {
    if(start != nums.length - 1 && nums[start + 1] == 1)
      return groupSum5(start + 2, nums, target - nums[start]);
    else return groupSum5(start + 1, nums, target - nums[start]);
  }
  if(groupSum5(start + 1, nums, target)) return true;
  return groupSum5(start + 1, nums, target - nums[start]);
}

//all numbers in a clump must be either all included or not included.

public boolean groupSumClump(int start, int[] nums, int target) {
  if(start >= nums.length) return target == 0;
  if(target == 0) return true;
  int clumpSize = 0;
  int clumpNum = nums[start];
  while(start < nums.length && nums[start] == clumpNum){
    clumpSize++;
    start++;
  }
  if(groupSumClump(start, nums, target)) return true;
  return groupSumClump(start, nums, target - clumpSize * clumpNum);
}

//is it possible to split an array into two groups whose sums are the same?
//can be done more efficiently with a sorting algorithm

public boolean splitArray(int[] nums) {
  return splitRec(0, nums, 0, 0);
}

public boolean splitRec(int index, int[] nums, int sum1, int sum2){
  if(index >= nums.length) return sum1 == sum2;
  if(splitRec(index + 1, nums, sum1 + nums[index], sum2)) return true;
  if(splitRec(index + 1, nums, sum1, sum2  + nums[index])) return true;
  return false;
}

//split into two groups, one of which is a multiple of 10, the other which is odd.

public boolean splitOdd10(int[] nums) {
  return splitRec(0, nums, 0, 0);
}

public boolean splitRec(int index, int[] nums, int sum1, int sum2){
  if(index >= nums.length) return sum1 % 10 == 0 && sum2 % 2 == 1;
  if(splitRec(index + 1, nums, sum1 + nums[index], sum2)) return true;
  if(splitRec(index + 1, nums, sum1, sum2  + nums[index])) return true;
  return false;
}

//split into two groups, all multiples of 5 must be separated from the remaining multiples of three

public boolean split53(int[] nums) {
  return splitRec(0, nums, 0, 0);
}

public boolean splitRec(int index, int[] nums, int sum1, int sum2){
  if(index >= nums.length) return sum1 == sum2;
  int n = nums[index];
  //all non-multiples of five
  if(n % 5 != 0) {
    if(splitRec(index+1, nums, sum1 + n, sum2)) return true;
  }
  //all non-multiples of three
  if(n % 3 != 0) {
    if(splitRec(index+1, nums, sum1, sum2 + n)) return true;
  }
  return false;
}
