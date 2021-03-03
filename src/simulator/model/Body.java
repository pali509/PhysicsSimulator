package simulator.model;

import org.json.JSONObject;

import simulator.misc.Vector2D;

public class Body {

// shouldn't it be like new Vector() etc??
String id;
Vector2D v;
Vector2D p;
Vector2D f;
double m;
Vector2D a;

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
	if(m==0) {
		a.setX(0);
		a.setY(0);
	} else {
		a.setX(f.getX()/m);
		a.setY(f.getY()/m);
	}
	p.setX(p.getX() + (v.getX() * t) + (0.5 * a.getX() * t * t));
	p.setY(p.getY() + (v.getY() * t) + (0.5 * a.getY() * t * t));
	
	v.setX(v.getX() + (a.getX() * t));
	v.setY(v.getY() + (a.getY() * t));
}

//Vectors set functions??
//TODO
public JSONObject getState() {
	System.out.println("nothing here");
}

public String toString() {
	return getState().toString();
}

}