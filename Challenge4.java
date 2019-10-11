

public class Challenge4
{
   public static void main(String[] args){
      double b = 0; 
      double c = 0;
      double total = 0;
       
      for(int a = 0; b<1000; a++){
          c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
         
          if(a > b){}
          else if(b > c){}       
          else if(Py(a,b) == true && a+b+c == 1000){
              total =  total +(a*b*c);
               System.out.println(a);
                System.out.println(b);
               System.out.println(c);
            b = 1000;
            }
          
         if(a >= 1000){
             b++; 
            a =0;
            }
        }
      
        System.out.println(total);
        
       
}   
public static boolean Py(double A, double B){
    
    double C = Math.sqrt(Math.pow(A,2) + Math.pow(B,2));
    
    if(C%2 == 0 || C%3 == 0 || C%5 == 0 || C%13 == 0){
     return true;    
    }
 
   else return false; 
}
}
