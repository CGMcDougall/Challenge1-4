
public class Challenge1
{
    public static void String(String[] args){
        
     // sum of the factors of 3 and 5
     double total = 0;    
     
        for(int i = 0; i < 1000; i++){
            if(i%5 == 0)total = total + i;
            else if(i%3 == 0)total = total +i;
            
        }
        
        System.out.println(total);
        
        
    }
}
