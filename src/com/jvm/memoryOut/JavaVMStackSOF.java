/**
 * 
 */
package com.jvm.memoryOut;
/**
 *@author sunkang
 *@date 创建时间：2017年7月8日下午10:06:49
 *@version 1.0
 *@parameter
 *@since
 *@return 
 *  最大大概为11405
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
