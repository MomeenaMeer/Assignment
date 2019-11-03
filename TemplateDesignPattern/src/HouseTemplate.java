
public abstract class HouseTemplate {

	//template method, final so subclasses can't override
	public final void buildHouse(){
		buildFoundation();
		buildPillars();
		buildWalls();
		buildWindows();
		System.out.println("Building Complete House");
	}

	//default implementation
	private void buildWindows() {
		System.out.println("Glass Windows UnderConstruction");
	}

	//methods to be implemented by subclasses
	public abstract void buildWalls();
	public abstract void buildPillars();

	private void buildFoundation() {
		System.out.println("Foundation UnderConstruction");
	}
}
