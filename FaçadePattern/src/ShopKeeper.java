
public class ShopKeeper {
	private MobileShop iphone;  
    private MobileShop samsung;  
    private MobileShop blackberry;  
      
    public ShopKeeper(){  
        iphone = new Iphone();  
        samsung =new Samsung();  
        blackberry=new BlackBerry();  
    }  
    public void iphonePurchase(){  
        iphone.modelno();  
        iphone.price();  
    }  
        public void samsungPurchase(){  
        samsung.modelno();  
        samsung.price();  
    }  
   public void blackberryPurchase(){  
    blackberry.modelno();  
    blackberry.price();  
        }  

}
