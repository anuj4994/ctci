import java.util.Arrays;
import java.util.HashMap;

// 1.2 Check if the given strings are permutation of each other or not

public class CheckPermutation{
  public static void main(String args[]){
    String str1 = "abcdef";
    String str2 = "ghijkl";
    System.out.println(checkPermutation(str1, str2));
  }

  /**
  * T.C. O(n)
  * S.C O(n)
  */

  public static boolean checkPermutation(String str1, String str2){
    if(str1.length() != str2.length()) return false;
    HashMap<Character, Integer> charMap = new HashMap<>();
    for(int i = 0 ; i < str1.length() ; i++) {
      if(charMap.containsKey(str1.charAt(i))){
        charMap.put(str1.charAt(i), charMap.get(str1.charAt(i)) + 1);
      } else {
        charMap.put(str1.charAt(i), 1);
      }

      if(charMap.containsKey(str2.charAt(i))){
        charMap.put(str1.charAt(i), charMap.get(str2.charAt(i)) - 1);
      } else {
        charMap.put(str1.charAt(i), -1);
      }
    }

    for(char c : charMap.keySet()){
      if(charMap.get(c) != 0)
        return false;
    }
    return true;

  }


  /**
  * T.C. O(nlogn)
  * S.C O(n)
  */
  /*
  public static boolean checkPermutation(String str1, String str2){
    if(str1.length() != str2.length()) return false;
    char[] charArray1 = str1.toCharArray();
    char[] charArray2 = str2.toCharArray();
    Arrays.sort(charArray1);
    Arrays.sort(charArray2);
    String sortedStr1 = new String(charArray1);
    String sortedStr2 = new String(charArray2);
    return sortedStr1.equals(sortedStr2);
  }
  */

}
