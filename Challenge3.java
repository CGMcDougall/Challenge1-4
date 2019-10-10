
public class Challenge3
{
  public static void String(String[] args){
int highest = 100;
     double diffrence;
     double x = 0;
     double y = 0;
         for(double i=highest;i>=1;i--){    
      x=x+Math.pow(i,2); 
      y=(y+i);
      
      if(i == 1){
      y = Math.pow(y,2);
        }
  }    
     System.out.println(x);
   System.out.println(y);

         
    int z = (int)Math.abs(x - y);
        System.out.println(z);
    }  
    }
