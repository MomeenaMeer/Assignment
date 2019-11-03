
public abstract class ThreadSchedular {
	protected Thread t;
	ThreadSchedular(Thread t){	
		this.t=t;
	}
	
	abstract void preemtiveschedular();
	abstract void timesliceschedular();

}
