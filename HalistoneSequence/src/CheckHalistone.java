
public class CheckHalistone {
	static int c;
	 static int HailstoneNumbers(int N){
	   System.out.print(N +" ");
	   if ( N==1 && c==0  )
	  return c;
	   else if(N==1 && c!=0){
	    c++;   
	   return c;
	   }
	    else if(N%2==0){
	    c++;   
	    // when even
	    HailstoneNumbers(N/2);
	    }
	    else if(N%2!=0){
	    c++;   
	    // when odd
	   HailstoneNumbers(3*N+1);
	    }
	   return c;
	 }

	    public static void main(String[] args) {
	    int N =7;
	    int x;
	     x= HailstoneNumbers(N);
	     
	     System.out.println();
	     System.out.println("number of steps= " +x);


	       }
	    }

