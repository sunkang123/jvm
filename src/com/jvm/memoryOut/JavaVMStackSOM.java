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
 * 
 *vm    args: -Xss2M
 *������Σ�գ������cpu���
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
