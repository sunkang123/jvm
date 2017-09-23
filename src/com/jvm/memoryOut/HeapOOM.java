/**
 * 
 */
package com.jvm.memoryOut;

import java.util.ArrayList;
import java.util.List;

/**
 *@author sunkang
 *@date 创建时间：2017年7月8日下午9:08:45
 *@version 1.0
 *@parameter
 *@since
 *@return 
 *设置这个参数可以让虚拟机出现内存溢出时dump出当前的内存堆转存储快照以便事后进行分析
 *-XX:+heapDumpOnOutOfMemoryError
 *
 *vm args: -Xms20m  -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 */
public class HeapOOM {
	static class OOMobject{}
	public static void main(String[] args) {
		List<OOMobject> list=new ArrayList<>();
		int i=0;
		while (true){
			i++;
			list.add(new OOMobject());
//		System.out.println("size : " + i);  
//			Runtime runtime = Runtime.getRuntime();  
//			System.out.printf("maxMemory : %.2fM\n", runtime.maxMemory()*1.0/1024/1024);  
//			System.out.printf("totalMemory : %.2fM\n", runtime.totalMemory()*1.0/1024/1024);  
//			System.out.printf("freeMemory : %.2fM\n", runtime.freeMemory()*1.0/1024/1024);  
		}
	}
}
