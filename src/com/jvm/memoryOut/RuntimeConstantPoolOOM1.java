/**
 * 
 */
package com.jvm.memoryOut;
/**
 *@author sunkang
 *@date ����ʱ�䣺2017��7��8������11:04:37
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public class RuntimeConstantPoolOOM1 {
	public static void main(String[] args) {
		String str1=new StringBuilder("java").append("���").toString();
		System.out.println(str1.intern()==str1);
		
		String str2=new StringBuilder("jv").append("va").toString();
		System.out.println(str2.intern()==str2);
	}

}
