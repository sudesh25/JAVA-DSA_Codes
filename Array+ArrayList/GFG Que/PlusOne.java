import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

public class PlusOne {
 public static void main(String[] args) {

                ArrayList <Integer> arr = new ArrayList<>(Arrays.asList(1,2,4));
                System.out.println((increment(arr)));

} 
 static ArrayList<Integer> increment(ArrayList<Integer> arr) {
      
    ArrayList <Integer> ans =new ArrayList<>(); 
      StringBuilder str = new StringBuilder();
      for (int i = 0; i < arr.size(); i++) {
         str.append(arr.get(i));
      }
      String str2 = str.toString();
     BigInteger num = new BigInteger(str2); 
     num = num.add(BigInteger.ONE);
      
      String incrementedStr  =num.toString();
      for (int i = 0; i < incrementedStr.length(); i++) {
             ans.add(Character.getNumericValue(incrementedStr.charAt(i)));
      }
      return ans;
    }
}
hghffg