/**
 * 
 */
package com.jvm.classLoading;
/**
 *@author sunkang
 *@date ����ʱ�䣺2017��6��29������1:31:07
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
/**
 * ִ��<clinit>�����������߳��Ƴ���һ������ֻ�����һ��
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

