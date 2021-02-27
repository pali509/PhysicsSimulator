package simulator.model;

import simulator.misc.Vector2D;

public class Body {

String id;
Vector2D v;
Vector2D p;
Vector2D f;
double m;

public Body(String id, Vector2D v,Vector2D p, double m){
this.id = id;
this.v = v;
this.p = p;
this.m = m;
}

public String getId(){
	return id;
}

public Vector2D getVelocity(){
	return v;
}

public Vector2D getPosition(){
	return p;
}

public Vector2D getForce(){
	return f;
}

public double getMass(){
	return m;
}

void addForce(Vector2D f) {
	this.f.plus(f);
}
void resetForce() {
	this.f.minus(this.f);
}
void move(double t) {
	
}
}