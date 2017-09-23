/**
 * 
 */
package com.jvm.classLoading;
/**
 *@author sunkang
 *@date 创建时间：2017年6月29日下午9:06:32
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public class String1 {
	private int x;
	private int y;
	
	
	
	public String1(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}



	public int getX() {
		return x;
	}



	public void setX(int x) {
		this.x = x;
	}



	public int getY() {
		return y;
	}



	public void setY(int y) {
		this.y = y;
	}



	public static void main(
			String1[] args) {
		String1 str=new String1(1,2);
		str.getY();
	}

}
