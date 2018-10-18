
public class Vector3D extends Vector{
	public Vector3D(int x, int y, int z) {
		super(x, y, z);
}	
	
	public Vector3D add(Vector3D vector) {
		return (Vector3D) super.add(vector);
	}
	
	public Vector3D sub(Vector3D vector) {
		return (Vector3D) super.sub(vector);
	}
	
	public int scalarMult(Vector3D vector) {
		return super.scalarMult(vector);
	}
	
	@Override
	public boolean equals(Object other) {
		if (!(other instanceof Vector3D))return false;
		return super.equals(other);
	}
	
	@Override
	protected Vector3D getVector(int[] coordinates) {
		return new Vector3D(coordinates[0], coordinates[1], coordinates[2]);
	}
}
