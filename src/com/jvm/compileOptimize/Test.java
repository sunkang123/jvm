/**
 * 
 */
package com.jvm.compileOptimize;
/**
 *@author sunkang
 *@date 创建时间：2017年7月4日下午9:57:00
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public class Test {
	public static void main(String[] args) {
		Integer a=1;
		Integer b=2;
		Integer c=3;
		Integer d=3;
		Integer e=321;
		Integer f=321;
		Long g=3L;
		//Long l=Long(a+b);
		long m=a+b;
		System.out.println(g==m);//true 
		//System.out.println(m instanceof Long);
		System.out.println(g.equals(m));//false  类型就不符合了
		System.out.println(c==m);//true
		System.out.println(c==b);//false
		System.out.println(e==f);//false   //进行==不会拆箱
		System.out.println(c==(a+b));//true  相加的时候进行的拆箱
		System.out.println(c.equals(a+b));//true
		System.out.println(g==(a+b));//true   也是拆箱成int然后装箱成long
		System.out.println(g.equals(a+b));//false
		
		//条件编译优化
//		while(false){
//			System.out.println("wo");
//		}
	}

}
