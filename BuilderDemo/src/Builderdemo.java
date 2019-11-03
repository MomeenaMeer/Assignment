
public class Builderdemo {
	public static void main(String args[]){  
		   CDbuilder cdBuilder=new CDbuilder();  
		   CDType cdType1=cdBuilder.buildSonyCD();  
		   cdType1.showItems();  
		  
		   CDType cdType2=cdBuilder.buildSamsungCD();  
		   cdType2.showItems();  
		 }  

}
