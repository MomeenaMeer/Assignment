import java.util.ArrayList;  
import java.util.List;  
public class CDType {
	  private List<packing> items=new ArrayList<packing>();  
      public void addItem(packing p) {    
             items.add(p);  
      }  
public void getprice(){  
       for (packing p : items) {  
                 p.price();  
       }   
      }  
public void showItems(){  
    for (packing packing : items){  
    	System.out.print("CD name : "+packing.pack());  
        System.out.println(", Price : "+packing.price());  
     }       
        }
  
}




