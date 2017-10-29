// 1.3 Change space into %20 in a string inplace. with given proper length

public class URLify{
  public static void main(String args[]){
    System.out.println(urlify("Mr John Smith    ".toCharArray(), 13));
  }

  public static String urlify(char str[], int length){
    //Count space
    int spaceCount = 0;
    for(int i = 0 ; i < length ; i++) {
      if(str[i] == ' '){
        spaceCount++;
      }
    }
    int index = length + spaceCount*2;
    for(int i = length - 1; i >= 0 ; i--){
      if(str[i] == ' '){
        str[index - 1] = '0';
        str[index - 2] = '2';
        str[index - 3] = '%';
        index -= 3;
      } else {
        str[index - 1] = str[i];
        index--;
      }
    }
    return String.valueOf(str);
  }

}
