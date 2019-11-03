
public abstract class ShapeDecorator implements Shape{
	protected Shape S;

	   public ShapeDecorator(Shape S){
	      this.S = S;
	   }
	   public void draw(){
		      S.draw();
		   }	

}
