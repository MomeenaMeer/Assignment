
public class MainClass {
	public static void main(String[] args) {
		
		ThreadSchedular obj=new PreemtiveThreadSchedular(new WindowsPts());
		obj.preemtiveschedular();
			
			
			ThreadSchedular obj1=new TimedSliceSchedular(new WindowsTsts());
	        obj1.timesliceschedular();

	ThreadSchedular obj2=new PreemtiveThreadSchedular(new UnixPts());
		obj2.preemtiveschedular();
			
			
			ThreadSchedular obj3=new TimedSliceSchedular(new UnixTsts());
	        obj3.timesliceschedular();

			
		}

}
