package simulator.model;

import java.util.List;

import simulator.misc.Vector2D;

public class MovingTowardsFixedPoint implements ForceLaws {
	
	Vector2D c;
	double g;
	
	public MovingTowardsFixedPoint(Vector2D c, double g) {
		this.c = c;
		this.g = g;
	}
	
	@Override
	public void apply(List<Body> bs) {
		for(int i = 0; i < bs.size(); i++) {
			bs.get(i).addForce(getForce(bs.get(i)));
		}

	}
	
	private Vector2D getForce(Body i) {
		Vector2D force;
		Vector2D d;
		
		d = new Vector2D();
		force = new Vector2D();
		
		d = c.minus(i.getPosition());
		force = d.scale(i.getMass()/g);
		
		return force;
	}

