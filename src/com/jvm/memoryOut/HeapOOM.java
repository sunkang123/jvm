/**
 * 
 */
package com.jvm.memoryOut;

import java.util.ArrayList;
import java.util.List;

/**
 *@author sunkang
 *@date ����ʱ�䣺2017��7��8������9:08:45
 *@version 1.0
 *@parameter
 *@since
 *@return 
 *���������������������������ڴ����ʱdump����ǰ���ڴ��ת�洢�����Ա��º���з���
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
