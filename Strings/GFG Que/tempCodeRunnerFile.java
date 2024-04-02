 s=s.toLowerCase();
         s=s.replace(" ",""); 
         char Sen[]=s.toCharArray(); 
         for (char i='a'; i <='z'; i++) {
              int flag=0;  
             for (int j = 0; j < Sen.length; j++) {
                if(i==Sen[j])
                {
                    flag=1;
                    break;
                } 
                
             } 
             if(flag==0)
                {
                    return 0;
                }
         } 
           return 1;