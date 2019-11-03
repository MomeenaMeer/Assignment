
public class DecoratorPatternDemo {
	 public static void main(String[] args) {

	      Shape circle = new Circle();

	      Shape redC = new RedShapeDecorator(new Circle());

	      Shape redR = new RedShapeDecorator(new Rectangle());
	      System.out.println("Circle with normal border \n ");
	      circle.draw();

	      System.out.println("Circle of red border \n ");
	      redC.draw();

	      System.out.println("Rectangle of red border \n ");
	      redR.draw();
	   }


}

