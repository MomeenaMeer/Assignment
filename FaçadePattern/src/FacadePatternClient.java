import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;

public class FacadePatternClient {
	private static int  select;  
    public static void main(String args[]) throws NumberFormatException, IOException{  
        do{       
            System.out.print("WELCOME to  MOBILE SHOP...please select Company from menue \n");  
            System.out.print(" 1. IPHONE. \n");  
            System.out.print("2. SAMSUNG.\n");  
            System.out.print("3. BLACKBERRY.\n");  
            System.out.print("4. Not Interested.\n");  
            System.out.print("Enter your choice: ");  
              
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
            select=Integer.parseInt(br.readLine());  
            ShopKeeper shop =new ShopKeeper(); 
            switch (select) {  
            case 1:  
                {   
                  shop.iphonePurchase();  
                }  
            break;  
   case 2:  
            {  
              shop.samsungPurchase();        
                }  
            break;    
   case 3:  
                       {  
                       shop.blackberryPurchase();       
                       }  
               break;     
        default:  
        {    
            System.out.println("No problem Comeback later :) ");  
        }         
            return;  
        }  
          
  }
    while(select!=4);  
}  
}


