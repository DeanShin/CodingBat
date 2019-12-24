public int factorial(int n) {
  if(n == 0) return 1;
  return n * factorial(n-1);
}

public int bunnyEars(int bunnies) {
  if(bunnies == 0) return 0;
  return 2 + bunnyEars(bunnies - 1);
}

public int fibonacci(int n) {
  if(n == 0) return 0;
  if(n == 1) return 1;
  return fibonacci(n - 1) + fibonacci(n - 2);
}

public int bunnyEars2(int bunnies) {
  if(bunnies == 0) return 0;
  if(bunnies % 2 == 0) return 3 + bunnyEars2(bunnies - 1);
  else return 2 + bunnyEars2(bunnies - 1);
}

public int triangle(int rows) {
  if(rows == 0) return 0;
  return rows + triangle(rows - 1);
}

public int sumDigits(int n) {
  if(n == 0) return 0;
  return n % 10 + sumDigits(n / 10);
}

public int count7(int n) {
  if(n == 0) return 0;
  if(n % 10 == 7) return 1 + count7(n / 10);
  return count7(n / 10);
}

public int count8(int n) {
  if(n == 0) return 0;
  if(n % 10 == 8){
    if ((n / 10) % 10 == 8){
      return 2 + count8(n / 10);  
    } 
    else {
      return 1 + count8(n / 10);
    }
  }
  return count8(n / 10);
}

public int powerN(int base, int n) {
  if(n == 0) return 1;
  return base * powerN(base, n - 1);
}

public int countX(String str) {
  if(str.length() == 0) return 0;
  if(str.charAt(0) == 'x') return 1 + countX(str.substring(1));
  return countX(str.substring(1));
}

public int countHi(String str) {
  if(str.length() < 2) return 0;
  if(str.substring(0,2).equals("hi")) return 1 + countHi(str.substring(1));
  return countHi(str.substring(1));
}

public String changeXY(String str) {
  if(str.length() == 0) return "";
  if(str.charAt(0) == 'x'){
    return "y" + changeXY(str.substring(1));  
  }
  return str.substring(0,1) + changeXY(str.substring(1));
}

public String changePi(String str) {
  if(str.length() <= 0) return "";
  if(str.length() != 1 && str.substring(0,2).equals("pi")){
    return "3.14" + changePi(str.substring(2));
  }
  return str.substring(0,1) + changePi(str.substring(1));
}

public String noX(String str) {
  if(str.length() == 0) return "";
  if(str.charAt(0) == 'x') return noX(str.substring(1));
  return str.substring(0,1) + noX(str.substring(1));
}

public boolean array6(int[] nums, int index) {
  if(index == nums.length) return false;
  if(nums[index] == 6) return true;
  return array6(nums, index + 1);
}

public int array11(int[] nums, int index) {
  if(index == nums.length) return 0;
  if(nums[index] == 11) return 1 + array11(nums, index + 1);
  return array11(nums, index + 1);
}

public boolean array220(int[] nums, int index) {
  if(index >= nums.length - 1) return false;
  if(nums[index + 1] == nums[index] * 10) return true;
  return array220(nums, index + 1);
}

public String allStar(String str) {
  if(str.length() <= 1) return str;
  return str.substring(0,1) + "*" + allStar(str.substring(1));
}

public String pairStar(String str) {
  if(str.length() < 2) return str;
  if(str.charAt(0) == str.charAt(1)) 
    return str.substring(0, 1) + '*' + pairStar(str.substring(1));
  return str.substring(0, 1) + pairStar(str.substring(1));
}
