// https://www.geeksforgeeks.org/problems/maximum-meetings-in-one-room/0

import java.util.ArrayList;

public class MaximumMeetingsinOneRoom {
    public static void main(String[] args) {
       int  N = 6;
        int [] S = {1,3,0,5,8,5};
        int[] F = {2,4,6,7,9,9};   
        System.out.println(maxMeetings(N,S,F));

    } 
        static ArrayList<Integer> maxMeetings(int N, int[] S, int[] F) {
 
            ArrayList<Integer> ans=new ArrayList<Integer>();
            int en=F[0];
            for (int i = 0; i < F.length; i++) { 
               
                if(i==0)
                {
                    en=F[0]; 
                    ans.add(1);
                } 
                else 
                {
                    if(en<S[i])
                    {
                        en=F[i];  
                        ans.add(i+1);
                        
                    }
                }
            } 
            return ans;
    }
}
