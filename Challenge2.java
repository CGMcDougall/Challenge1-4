
public class Challenge2
{
   public static void String(String args[]){
     int One =1;
     int Two = 0;
     int z = 0;
     double total= 0;
       while(z<1){
         
         int sum = One + Two;
          Two = One;
          One = sum;
          if(sum%2 == 0)total = total + sum;
          if(sum >= 4000000)z++;
          
        }
     
       System.out.println(total);
       
    }
}
