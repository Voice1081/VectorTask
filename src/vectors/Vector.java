package vectors;

public abstract class Vector{

	private final int dimension;
	private final int[] coordinates;
	
	protected Vector(int...coordinates) {
		this.coordinates = coordinates;
		this.dimension = coordinates.length;
	}
	
	protected abstract Vector getVector(int[] coordinates);
	
	public int getDimension() {
		return dimension;
	}
	
	public int[] getCoordinates() {
		return this.coordinates;
	}
	
	@Override
	public boolean equals(Object other) {
		if (other == null) return false;
	    if (other == this) return true;
	    if (!(other instanceof Vector))return false;
	    Vector otherVector = (Vector)other;
		if(this.dimension != otherVector.getDimension()) return false;
		int[] otherCoordinates = otherVector.getCoordinates();
		for(int i = 0; i < this.dimension; i++)
			if(this.coordinates[i] != otherCoordinates[i]) return false;
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append('(');
		for(int i = 0; i < this.dimension; i++) {
			str.append(this.coordinates[i]);
			if(i != this.dimension - 1) str.append(", ");
		}
		str.append(')');
		return str.toString();
	}
	
	public int hashCode() {
		int hash = 0;
		for(int i = 0; i < this.dimension; i++)
			hash += this.coordinates[i];
		return hash;
	}
	
	protected Vector add(Vector vector) {
		int[] otherCoordinates = vector.getCoordinates();
		int[] newCoordinates = new int[this.dimension];
		for(int i = 0; i < this.dimension; i++)
			newCoordinates[i] = this.coordinates[i] + otherCoordinates[i];
		return getVector(newCoordinates);
	}

	protected Vector sub(Vector vector) {
		int[] otherCoordinates = vector.getCoordinates();
		int[] newCoordinates = new int[this.dimension];
		for(int i = 0; i < this.dimension; i++)
			newCoordinates[i] = this.coordinates[i] - otherCoordinates[i];
		return getVector(newCoordinates);
	}
	
	protected int scalarMult(Vector vector) {
		int[] otherCoordinates = vector.getCoordinates();
		int result = 0;
		for(int i = 0; i < this.dimension; i++)
			result += this.coordinates[i]*otherCoordinates[i];
		return result;
	}
}
