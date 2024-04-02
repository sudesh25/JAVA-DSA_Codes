 if(s.length()!=t.length())
         {
            return false;
         }  
        
        char A []=s.toCharArray() ;  
        char B []=t.toCharArray() ;  
        Arrays.sort(A);
        Arrays.sort(B); 
        for (int i = 0; i < B.length; i++) {
              if(A[i]==B[i])
              {
                 
              } 
              else 
              {
                return false;
              }
        } 
        return true;