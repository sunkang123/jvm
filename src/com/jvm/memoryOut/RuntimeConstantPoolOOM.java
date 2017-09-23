/**
 * 
 */
package com.jvm.memoryOut;

import java.util.ArrayList;
import java.util.List;

/**
 *@author sunkang
 *@date 创建时间：2017年7月8日下午10:56:12
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
/**
 * vm args : -XX:PermSize=4M -XX:MaxPermSize=4M 
 */
public class RuntimeConstantPoolOOM {
	
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		int  i=1;
		while(true){
			list.add(String.valueOf("woshisuankangnizhidaoma"+i+++"nishi sunakgn").intern());
		}
		
	}

}
