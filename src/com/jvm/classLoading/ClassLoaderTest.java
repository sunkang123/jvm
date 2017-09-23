/**
 * 
 */
package com.jvm.classLoading;

import java.io.IOException;
import java.io.InputStream;

/**
 *@author sunkang
 *@date 创建时间：2017年6月29日下午6:36:17
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public class ClassLoaderTest {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		ClassLoader myloader=new ClassLoader() {
			@Override
			public Class<?> loadClass(String name) throws ClassNotFoundException {
				try {
					String fileName=name.substring(name.lastIndexOf(".")+1)+".class";
					InputStream is=getClass().getResourceAsStream(fileName);
					if(is==null){
						return super.loadClass(name);
					}
					byte[] b=new byte[is.available()];
					is.read(b);
					return defineClass(name, b, 0, b.length);
				} catch (IOException e) {
					e.printStackTrace();
				}
				return null;
			}
		};
		
		Object obj=myloader.loadClass("com.jvm.classLoading.ClassLoaderTest").newInstance();
		System.out.println(obj instanceof com.jvm.classLoading.ClassLoaderTest);
		Object obj1= ClassLoader.getSystemClassLoader().loadClass("com.jvm.classLoading.ClassLoaderTest").newInstance();
		System.out.println(obj1 instanceof com.jvm.classLoading.ClassLoaderTest);
		System.out.println(obj.getClass()+"::"+obj1.getClass());
		System.out.println(obj==obj1);
	}

}
