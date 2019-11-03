
public class PreemtiveThreadSchedular extends ThreadSchedular  {
	PreemtiveThreadSchedular(Thread t) {
		super(t);
			}

	@Override
	void preemtiveschedular() {
		
		System.out.println("Preemtive Schedular");
	}

	@Override
	void timesliceschedular() {
		
	}	

}
