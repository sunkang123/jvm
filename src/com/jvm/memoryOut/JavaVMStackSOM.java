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
 * 
 *vm    args: -Xss2M
 *方法很危险，会造成cpu飙升
 */
public class JavaVMStackSOM {
	public void stackLeak(){
		while(true){
			
		}
	}
	public void stackLeaKByThread(){
		while(true){
			Thread thread=new Thread(new Runnable() {
				@Override
				public void run() {
					stackLeak();
				}
			});
			thread.start();
		}
	}
	
	public static void main(String[] args) {
		JavaVMStackSOM javaVMStackSOF=new JavaVMStackSOM();
		javaVMStackSOF.stackLeaKByThread();
	}

}
