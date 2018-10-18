
public class VectorND extends Vector{
	public VectorND(int...coordinates) {
		super(coordinates);
	}
	
	public VectorND add(VectorND vector) {
		return (VectorND) super.add(vector);
	}
	public VectorND sub(VectorND vector) {
		return (VectorND) super.sub(vector);
	}
	
	public int scalarMult(VectorND vector) {
		return super.scalarMult(vector);
	}
	
	@Override
	public boolean equals(Object other) {
		if (!(other instanceof VectorND))return false;
		return super.equals(other);
	}
	
	@Override
	protected Vector getVector(int[] coordinates) {
		return new VectorND(coordinates);
	}
}