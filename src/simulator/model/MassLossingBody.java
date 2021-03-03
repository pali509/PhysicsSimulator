package simulator.model;

import simulator.misc.Vector2D;

public class MassLossingBody extends Body {
		
	private double lFactor;
	private double lFrequency;
	private double c = 0.0;

	public MassLossingBody(String id, Vector2D v,Vector2D p, double m, double lFactor, double lFrequency) {
		super(id, v, p, m);
		this.lFactor = lFactor;
		this.lFrequency = lFrequency;
	}
	
	@Override
	void move(double t) {
		c += t;
		if(m==0) {
			a.setX(0);
			a.setY(0);
		} else {
			a.setX(f.getX()/m);
			a.setY(f.getY()/m);
		}
		p.setX(p.getX() + (v.getX() * t) + (0.5 * a.getX() * t * t));
		p.setY(p.getY() + (v.getY() * t) + (0.5 * a.getY() * t * t));
		
		//???
		if(c >= lFrequency) {
			m = m * (1 - lFactor);
			c = 0.0;
		}
		
		v.setX(v.getX() + (a.getX() * t));
		v.setY(v.getY() + (a.getY() * t));
	}
	
}
