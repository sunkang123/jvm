/**
 * 
 */
package com.jvm.collectionAndGc;
/**
 *@author sunkang
 *@date 创建时间：2017年7月8日下午11:47:41
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public class ReferenceCountingGC {
	
	public Object instance=null;
	private static final int _1MB=1024*1024;
	private byte[] bigSize=new byte[2*_1MB];
	
	public static void testGC(){
		ReferenceCountingGC countingGCA=new ReferenceCountingGC();
		ReferenceCountingGC countingGCB=new ReferenceCountingGC();
		countingGCA.instance=countingGCB;
		countingGCB.instance=countingGCA;
		
		countingGCA=null;
		countingGCB=null;
		
		System.gc();
	}

	public static void main(String[] args) {
		testGC();
	}
}
