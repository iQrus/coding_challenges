import java.util.HashSet;
import java.util.Set;

class Main {
  public static void main(String[] args) {
    char arr1[] = {'a', 'b', 'c', 'x', 'c'};
    char arr2[] = {'z', 'y', 'p', 'c'};

    System.out.println(containsCommonItem(arr1, arr2));

  }

  private static boolean containsCommonItem(char ar1[], char ar2[]){
    Set values = new HashSet<>();

    for(char c : ar1){
      values.add(c);
    }
    System.out.println(values.toString());
    for(char c : ar2){
      if(values.contains(c))
        return true;
    }
    return false;
  }
}