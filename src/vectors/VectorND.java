package vectors;

public class VectorND extends Vector{
	public VectorND(int...coordinates) {
		super(coordinates);
	}
	
	public VectorND add(VectorND vector) {
		if(vector.getDimension() != this.getDimension()) throw new IllegalArgumentException();
		return (VectorND) super.add(vector);
	}
	public VectorND sub(VectorND vector) {
		if(vector.getDimension() != this.getDimension()) throw new IllegalArgumentException();
		return (VectorND) super.sub(vector);
	}
	
	public int scalarMult(VectorND vector) {
		if(vector.getDimension() != this.getDimension()) throw new IllegalArgumentException();
		return super.scalarMult(vector);
	}
	
	@Override
	public boolean equals(Object other) {
		if (!(other instanceof VectorND)) throw new IllegalArgumentException();
		VectorND vector = (VectorND) other;
		if(vector.getDimension() != this.getDimension()) throw new IllegalArgumentException();
		return super.equals(other);
	}
	
	@Override
	protected Vector getVector(int[] coordinates) {
		return new VectorND(coordinates);
	}
}