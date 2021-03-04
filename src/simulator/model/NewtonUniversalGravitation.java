package simulator.model;

import java.util.List;

import simulator.misc.Vector2D;

public class NewtonUniversalGravitation implements ForceLaws {
	
	double g;

	@Override
	public void apply(List<Body> bs) {
		for(int i = 0; i < bs.size(); i++) {
			for(int j = 0; j < bs.size(); j++) {
				if(i != j) {
					
					bs.get(i).addForce();
					
				}
				
			}
		}
		
	}
	
	public NewtonUniversalGravitation(double g) {
		this.g = g;
	}
	
	//TODO
	
	public Vector2D getForce(Body i, Body j) {
		
		
		
		
		return null;
	}

}
