
public class FibonacciImpl {
    public static void main(String[] args) {
     int n1=0,n2=1, i , n3, count=10;
    System.out.print(n2);
    for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
 {    
  n3=n1+n2;    
  n1=n2;    
  n2=n3;  
System.out.print(" "+n3);  
 }    
 }
}