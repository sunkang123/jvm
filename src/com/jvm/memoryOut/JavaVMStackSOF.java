/**
 * 
 */
package com.jvm.memoryOut;
/**
 *@author sunkang
 *@date ����ʱ�䣺2017��7��8������10:06:49
 *@version 1.0
 *@parameter
 *@since
 *@return 
 *  �����Ϊ11405
 *vm    args: -Xss200k
 */
public class JavaVMStackSOF {
	private int statckLength=1;
	public void stackLeak(){
		statckLength++;
		System.out.println(statckLength);
		stackLeak();
	}
	
	public static void main(String[] args) {
		JavaVMStackSOF javaVMStackSOF=new JavaVMStackSOF();
		try {
			javaVMStackSOF.stackLeak();	
		} catch (Exception e) {
			System.out.println("stack length:"+javaVMStackSOF.statckLength);
			throw e;
		}
	}
}
