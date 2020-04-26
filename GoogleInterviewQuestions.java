import java.util.HashSet;
import java.util.Set;

class GoogleInterviewQuestions{

  public static boolean containsCommonItem(char ar1[], char ar2[]){
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
