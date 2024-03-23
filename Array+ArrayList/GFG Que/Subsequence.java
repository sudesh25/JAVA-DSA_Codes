    // https://www.geeksforgeeks.org/problems/sorted-subsequence-of-size-3/1?page=1&category=Arrays&difficulty=Easy,Medium&status=unsolved&sortBy=submissions


    import java.util.*;

    public class Subsequence {
        public static void main(String[] args) { 
            ArrayList<Integer> ans = new ArrayList<Integer>();
        ans.add(1);
        ans.add(2);
        ans.add(1);
        ans.add(1);
        ans.add(3);
        ans.add(1);

        System.out.println(find3Numbers(ans));
        }   
    static ArrayList<Integer> find3Numbers(ArrayList<Integer> arr) {
                
            Collections.sort(arr); 
                ArrayList<Integer> ans = new ArrayList<Integer>();  

            int ele=-1;   
           // ans.add(ele);
            int num=3;
            for (int i = 0; i < arr.size(); i++) {
                
                    if (arr.get(i) !=ele) {
                        ans.add(arr.get(i));
                    ele = arr.get(i);
                        num--;
                    }  
                    if (num == 0) {
                        break;
                    }
                
            }  
       
            if(num!=0)
            {
                ArrayList<Integer> ans2 = new ArrayList<Integer>(); 
                ans2.add(0);
                return (ans2);
            } 
            else 
            {
                ArrayList<Integer> ans3 = new ArrayList<Integer>(); 
                ans3.add(1); 
                return (ans3);
            }
        
        }
    }
