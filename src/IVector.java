
public interface IVector {
	public int getDimension();
	public int[] getCoordinates();
	Vector add(Vector vector);
	Vector sub(Vector vector);
	int scalarMult(Vector vector);
	boolean equals(Object other);
	String toString();

}
