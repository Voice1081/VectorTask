import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VectorTests {

	@Test
	void vectorNDinstantiates() {
		int[] coordinates = new int[] {1, 2, 3, 4};
		VectorND vector = new VectorND(coordinates);
		assertEquals(vector.getDimension(), 4);
		int[] vectorCoordinates = vector.getCoordinates();
		for(int i = 0; i < 4; i++) {
			assertEquals(vectorCoordinates[i], coordinates[i]);
		}
	}
	
	@Test
	void vector3Dinstantiates() {
		int[] coordinates = new int[] {1, 2, 3};
		Vector3D vector = new Vector3D(1, 2, 3);
		assertEquals(vector.getDimension(), 3);
		int[] vectorCoordinates = vector.getCoordinates();
		for(int i = 0; i < 3; i++)
			assertEquals(vectorCoordinates[i], coordinates[i]);
	}
		
	@Test
	void vector5Dinstantiates() {
		int[] coordinates = new int[] {1, 2, 3, 4, 5};
		Vector5D vector = new Vector5D(1, 2, 3, 4, 5);
		assertEquals(vector.getDimension(), 5);
		int[] vectorCoordinates = vector.getCoordinates();
		for(int i = 0; i < 5; i++) {
			assertEquals(vectorCoordinates[i], coordinates[i]);
		}
	}
	
	@Test
	void equals3D() {
		Vector3D one = new Vector3D(1, 2, 3);
		Vector3D another = new Vector3D(1, 2, 3);
		assertEquals(one, another);
	}
	
	@Test
	void equals5D() {
		Vector5D one = new Vector5D(1, 2, 3, 4, 5);
		Vector5D another = new Vector5D(1, 2, 3, 4, 5);
		assertEquals(one, another);
	}
	
	@Test
	void equalsND() {
		VectorND one = new VectorND(1, 2, 3, 4, 5);
		VectorND another = new VectorND(1, 2, 3, 4, 5);
		assertEquals(one, another);
	}
	
	@Test
	void NDNotEquals5D() {
		VectorND one = new VectorND(1, 2, 3, 4, 5);
		Vector5D another = new Vector5D(1, 2, 3, 4, 5);
		assertNotEquals(one, another);
	}
	
	@Test
	void NDNotEquals3D() {
		VectorND one = new VectorND(1, 2, 3);
		Vector3D another = new Vector3D(1, 2, 3);
		assertNotEquals(one, another);
	}
	
	@Test
	void vector3DSum() {
		Vector3D one = new Vector3D(1, 2, 3);
		Vector3D another = new Vector3D(1, 2, 3);
		Vector3D sum = new Vector3D(2, 4, 6);
		assertTrue(one.add(another).equals(sum));
	}
	
	@Test
	void vector5DSum() {
		Vector5D one = new Vector5D(1, 2, 3, 4, 5);
		Vector5D another = new Vector5D(1, 2, 3, 4, 5);
		Vector5D sum = new Vector5D(2, 4, 6, 8, 10);
		assertTrue(one.add(another).equals(sum));
	}
	
	@Test
	void vectorNDSum() {
		VectorND one = new VectorND(1, 2, 3, 4, 5);
		VectorND another = new VectorND(1, 2, 3, 4, 5);
		VectorND sum = new VectorND(2, 4, 6, 8, 10);
		assertTrue(one.add(another).equals(sum));
	}
	
	@Test
	void vector3DSub() {
		Vector3D one = new Vector3D(1, 2, 3);
		Vector3D another = new Vector3D(1, 2, 3);
		Vector3D sub = new Vector3D(0, 0, 0);
		assertTrue(one.sub(another).equals(sub));
	}
	
	@Test
	void vector5DSub() {
		Vector5D one = new Vector5D(1, 2, 3, 4, 5);
		Vector5D another = new Vector5D(1, 2, 3, 4, 5);
		Vector5D sub = new Vector5D(0, 0, 0, 0, 0);
		assertTrue(one.sub(another).equals(sub));
	}
	
	@Test
	void vectorNDSub() {
		VectorND one = new VectorND(1, 2, 3, 4, 5);
		VectorND another = new VectorND(1, 2, 3, 4, 5);
		VectorND sub = new VectorND(0, 0, 0, 0, 0);
		assertTrue(one.sub(another).equals(sub));
	}
	
	@Test
	void vector3DScalarMult() {
		Vector3D one = new Vector3D(1, 2, 3);
		Vector3D another = new Vector3D(1, 2, 3);
		int res = 14;
		assertEquals(one.scalarMult(another), res);
	}
	
	@Test
	void vector5DScalarMult() {
		Vector5D one = new Vector5D(1, 2, 3, 4, 5);
		Vector5D another = new Vector5D(1, 2, 3, 4, 5);
		int res = 55;
		assertEquals(one.scalarMult(another), res);
	}
	
	@Test
	void vectorNDScalarMult() {
		VectorND one = new VectorND(1, 2, 3, 4, 5);
		VectorND another = new VectorND(1, 2, 3, 4, 5);
		int res = 55;
		assertEquals(one.scalarMult(another), res);
	}
		
}
