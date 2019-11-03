
public class TimedSliceSchedular extends ThreadSchedular {
	public TimedSliceSchedular(Thread t)
	{
	super(t);
		
	}

	@Override
	void preemtiveschedular() {
	
	}

	@Override
	void timesliceschedular() {
		System.out.println("TimeSlice running");
		
	}

}
