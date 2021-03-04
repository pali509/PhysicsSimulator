package simulator.model;

import java.util.List;

import simulator.misc.Vector2D;

public class MovingTowardsFixedPoint implements ForceLaws {
	
	Vector2D c;
	double g;

	@Override
	public void apply(List<Body> bs) {
		

	}
	
	public MovingTowardsFixedPoint(Vector2D c, double g) {
		this.c = c;
		this.g = g;
		
		
	}

}
