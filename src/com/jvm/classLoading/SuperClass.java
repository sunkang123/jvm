/**
 * 
 */
package com.jvm.classLoading;
/**
 *@author sunkang
 *@date 创建时间：2017年6月29日下午12:30:25
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public class SuperClass {
	static {
		System.out.println("superclass class");
	}
    public  static int value=123;
	public static final String  HELLOWORD="hello word";
	
}

class Subclass extends SuperClass{
	static {
		System.out.println("subclass class");
	}
}
class notInitialization{
	public static void main(String[] args) {
		//子类引用父类的静态字段，不会导致子类初始化
		System.out.println(Subclass.value);
		//数组定义来引用类，不会触发类的初始化
		SuperClass[] sca=new Subclass[10];
		//长量在编译期间会存入调用类的常量词中，
		//调用类并不会存在superclass类的符号引用，两类之间没有关系
		System.out.println(SuperClass.HELLOWORD);
	}
}
