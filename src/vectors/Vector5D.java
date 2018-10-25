package vectors;

public class Vector5D extends Vector{
	public Vector5D(int x1, int x2, int x3, int x4, int x5) {
		super(x1, x2, x3, x4, x5);
}
	
	public Vector5D add(Vector5D vector) {
		return (Vector5D) super.add(vector);
	}
	
	public Vector5D sub(Vector5D vector) {
		return (Vector5D) super.sub(vector);
	}
	
	public int scalarMult(Vector5D vector) {
		return super.scalarMult(vector);
	}
	
	@Override
	public boolean equals(Object other) {
		if (!(other instanceof Vector5D)) throw new IllegalArgumentException();
		return super.equals(other);
	}
	
	@Override
	protected Vector getVector(int[] coordinates) {
		return new Vector5D(coordinates[0], coordinates[1], coordinates[2], coordinates[3], coordinates[4]);
	}
}