
public abstract class Organism {
	protected int cooperator;
	protected int nonCooperator;
	protected int energy;
	protected boolean alive;
	
	public Organism(int c, int n, int e, boolean a) {
		this.cooperator = c;
		this.nonCooperator = n;
		this.energy = e;
		this.alive = a;
	}
	
}
