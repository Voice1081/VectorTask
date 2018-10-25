package ivector;

public interface IVector {
	int getDimension();
	int[] getCoordinates();
	IVector add(IVector vector);
	IVector sub(IVector vector);
	int scalarMult(IVector vector);
	boolean equals(Object other);
	String toString();

}
