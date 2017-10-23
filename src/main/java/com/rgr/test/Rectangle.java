/**
 * COPY RIGHT AA
   Administrator
 */
package com.rgr.test;

/**
 * @author Administrator
 *
 */
public class Rectangle{
	
	private int length;
	private int breath;
	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}
	/**
	 * @param length the length to set
	 */
	public void setLength(int length) {
		this.length = length;
	}
	/**
	 * @return the breath
	 */
	public int getBreath() {
		return breath;
	}
	/**
	 * @param breath the breath to set
	 */
	public void setBreath(int breath) {
		this.breath = breath;
	}
	/**
	 * @param length
	 * @param breath
	 */
	public Rectangle(int length, int breath) {
		super();
		this.length = length;
		this.breath = breath;
	}
	
	public int area(){
		return length*breath;
	}

}
