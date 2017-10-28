import java.util.Arrays;

//Problem 1.1 Is Unique
// Check if the string has all the unique characters or not with using extra space.

public class IsUnique{
  public static void main(String[] args){
    String input = args[0];
    System.out.println(isUnique(input));
  }


  /**
  * If String only cointains ascii chars than length is 128,
  * if extended than 256
  */
  public static boolean isUnique(String str){
    if(str.length() > 128) return false;
    boolean[] charMap = new boolean[128];
    for(int i = 0 ; i < str.length(); i++){
      int ascii = str.charAt(i);
      if(charMap[ascii]){
        return false;
      }
      charMap[ascii] = true;
    }
    return true;
  }
  /**
  * Other solution but uses array of size n.
  * T.C O(n)
  * S.C O(n)
  */
  /*
  public static boolean isUnique(String str){
    char[] chars = str.toCharArray();
    Arrays.sort(chars);
    for(int i = 0 ; i < chars.length - 1; i++){
      if(chars[i] == chars[i+1]){
        return false;
      }
    }
    return true;
  }
  */


  /**bruteforce solution.
  * T.C. O(n^2)
  * S.C. O(n)
  */

  /*
  public static boolean isUnique(String str){
    for(int i = 0 ; i < str.length() ; i++){
      for(int j = i + 1; j < str.length() ; j++ ){
        if(str.charAt(i) == str.charAt(j))
          return false;
      }
    }
    return true;
  }
  */

}
