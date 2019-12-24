public boolean firstLast6(int[] arr) {
  return arr[0] == 6 || arr[arr.length - 1] == 6;
}

public boolean sameFirstLast(int[] arr) {
  return arr.length > 0 && arr[0] == arr[arr.length-1];
}

public int[] makePi() {
  int[] arr = {3,1,4};
  return arr;
}

public boolean commonEnd(int[] a, int[] b) {
  return a[0] == b[0] || a[a.length-1] == b[b.length-1];
}

public int sum3(int[] nums) {
  return nums[0] + nums[1] + nums[2];
}

public int[] rotateLeft3(int[] nums) {
  int[] arr = {nums[1], nums[2], nums[0]};
  return arr;
}

public int[] reverse3(int[] nums) {
  int temp = nums[0];
  nums[0] = nums[2];
  nums[2] = temp;
  return nums;
}

public int[] maxEnd3(int[] nums) {
  int max = 0;
  if(nums[0] > nums[2]) max = nums[0];
  else max = nums[2];
  nums[0] = max;
  nums[1] = max;
  nums[2] = max;
  return nums;
}

public int sum2(int[] nums) {
  int sum = 0;
  if(nums.length > 0) sum += nums[0];
  if(nums.length > 1) sum += nums[1];
  return sum;
}

public int[] middleWay(int[] a, int[] b) {
  int arr[] = {a[1],b[1]};
  return arr;
}

public int[] makeEnds(int[] nums) {
  int[] arr = {nums[0], nums[nums.length-1]};
  return arr;
}

public boolean has23(int[] arr) {
  return arr[0] == 2 || arr[0] == 3 || arr[1] == 2 || arr[1] == 3;
}

public boolean no23(int[] arr) {
  return !(arr[0] == 2 || arr[0] == 3 || arr[1] == 2 || arr[1] == 3);
}

public int[] makeLast(int[] nums) {
  int[] arr = new int [nums.length * 2];
  arr[arr.length - 1] = nums[nums.length - 1];
  return arr;
}

public boolean double23(int[] arr) {
  if(arr.length < 2) return false;
  return (arr[0] == 2 && arr[1] == 2) || (arr[0] == 3 && arr[1] == 3);
}

public int[] fix23(int[] arr) {
  if(arr[0] == 2 && arr[1] == 3) arr[1] = 0;
  if(arr[1] == 2 && arr[2] == 3) arr[2] = 0;
  return arr;
}

public int start1(int[] a, int[] b) {
  int count = 0;
  if(a.length > 0 && a[0] == 1) count++;
  if(b.length > 0 && b[0] == 1) count++;
  return count;
}

public int[] biggerTwo(int[] a, int[] b) {
  if(a[0] + a[1] >= b[0] + b[1]) return a;
  return b;
}

public int[] makeMiddle(int[] nums) {
  int[] arr = {nums[nums.length/2 - 1], nums[nums.length/2]};
  return arr;
}

public int[] plusTwo(int[] a, int[] b) {
  int arr[] = {a[0], a[1], b[0], b[1]};
  return arr;
}

public int[] swapEnds(int[] nums) {
  int temp = nums[0];
  nums[0] = nums[nums.length-1];
  nums[nums.length-1] = temp;
  return nums;
}

public int[] midThree(int[] nums) {
  int[] arr = {nums[nums.length/2 - 1], nums[nums.length/2], nums[nums.length/2 + 1]};
  return arr;
}

public int maxTriple(int[] nums) {
  int max = Math.max(nums[0], nums[nums.length/2]);
  max = Math.max(max, nums[nums.length-1]);
  return max;
}

public int[] frontPiece(int[] nums) {
  if(nums.length == 0){
    int[] arr = {};
    return arr;
  }
  if(nums.length == 1){
    int[] arr = {nums[0]};
    return arr;
  }
  int[] arr= {nums[0],nums[1]};
  return arr;
}

public boolean unlucky1(int[] arr) {
  if(arr.length >= 2 && arr[0] == 1 && arr[1] == 3) return true;
  if(arr.length >= 3 && arr[1] == 1 && arr[2] == 3) return true;
  if(arr.length >= 4 && arr[arr.length-2] == 1 && arr[arr.length - 1] == 3) return true;
  return false;
}

public int[] make2(int[] a, int[] b) {
  if(a.length == 0){
    int[] arr = {b[0], b[1]};
    return arr;
  }
  if(a.length == 1){
    int[] arr = {a[0],b[0]};
    return arr;
  }
  int[] arr = {a[0],a[1]};
  return arr;  
}

public int[] front11(int[] a, int[] b) {
  if(a.length == 0 && b.length == 0){
    int[] arr = {};
    return arr;
  }
  else if(a.length == 0) {
    int[] arr= {b[0]};
    return arr;
  }
  else if(b.length == 0) {
    int[] arr = {a[0]};
    return arr;
  }
  int[] arr = {a[0],b[0]};
  return arr;
}
