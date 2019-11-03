
public class RedShapeDecorator extends ShapeDecorator {

	public RedShapeDecorator(Shape S) {
	      super(S);		
	   }

	   @Override
	   public void draw() {
	      S.draw();	       
	      setRedBorder(S);
	   }

	   private void setRedBorder(Shape S){
	      System.out.println("Drwaing Red shapes");
	   }

}
