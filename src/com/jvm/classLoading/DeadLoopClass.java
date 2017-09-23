/**
 * 
 */
package com.jvm.classLoading;
/**
 *@author sunkang
 *@date 创建时间：2017年6月29日下午1:31:07
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
/**
 * 执行<clinit>方法的那条线程推出后，一个类型只会加载一次
 */
public class DeadLoopClass {
	
	static {
		if(true){
			System.out.println(Thread.currentThread()+"init DeadLoopClass");
			while(true){
				
			}
		}
	}
	public static void main(String1[] args) {
		Runnable sc=new Runnable() {
			public void run() {
				System.out.println(Thread.currentThread()+"start");
				DeadLoopClass dlc=new DeadLoopClass();
				System.out.println(Thread.currentThread()+"run over");
			}
		};
		Thread thread1=new Thread(sc);
		Thread thread2=new Thread(sc);
		thread1.start();
		thread2.start();
	}
}

