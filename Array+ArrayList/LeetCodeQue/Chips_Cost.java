//https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/description/
public class Chips_Cost {
    static int minCostToMoveChips(int[] position) { 
         
         int Ecount=0; 
         int Ocount=0;
        for (int i = 0; i < position.length; i++) {
        
            if(position[i]%2==0) 
            {
                Ecount++;
            } 
            else {
                Ocount++;
            }
        } 
        if(Ecount<Ocount)
        {
            return Ecount;
        } 
        return Ocount;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3}; 
        System.out.println(minCostToMoveChips(arr));
    }
}
