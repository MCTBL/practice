/**
 * 
 */
package homeWork;

import java.util.*;

/**
 * @author Jackie-zhong
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inPut=new Scanner(System.in);
		Cylinder test=new Cylinder(inPut.nextFloat(),inPut.nextFloat());
		System.out.println("底面积为="+test.getArea());
		System.out.println("体积为="+test.getVolume());
		inPut.close();
	}
}
class Cylinder{
	private float r;
	public float getR() {
		return r;
	}
	public void setR(float r) {
		this.r = r;
	}
	public float getH() {
		return h;
	}
	public void setH(float h) {
		this.h = h;
	}
	private float h;
	public Cylinder(){
		this.r=0;
		this.h=0;
	}
	public Cylinder(float r,float h){
		this.r=r;
		this.h=h;
	}
	public float getArea() {
		return (float)3.14*this.r*this.r;
	}
	public float getVolume() {
		return (float)this.getArea()*this.h;
	}
}