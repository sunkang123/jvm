/**
 * 
 */
package com.jvm.classLoading;
/**
 *@author sunkang
 *@date ����ʱ�䣺2017��6��29������12:30:25
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
		//�������ø���ľ�̬�ֶΣ����ᵼ�������ʼ��
		System.out.println(Subclass.value);
		//���鶨���������࣬���ᴥ����ĳ�ʼ��
		SuperClass[] sca=new Subclass[10];
		//�����ڱ����ڼ����������ĳ������У�
		//�����ಢ�������superclass��ķ������ã�����֮��û�й�ϵ
		System.out.println(SuperClass.HELLOWORD);
	}
}
