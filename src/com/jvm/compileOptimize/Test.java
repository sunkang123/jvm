/**
 * 
 */
package com.jvm.compileOptimize;
/**
 *@author sunkang
 *@date ����ʱ�䣺2017��7��4������9:57:00
 *@version 1.0
 *@parameter
 *@since
 *@return 
 */
public class Test {
	public static void main(String[] args) {
		Integer a=1;
		Integer b=2;
		Integer c=3;
		Integer d=3;
		Integer e=321;
		Integer f=321;
		Long g=3L;
		//Long l=Long(a+b);
		long m=a+b;
		System.out.println(g==m);//true 
		//System.out.println(m instanceof Long);
		System.out.println(g.equals(m));//false  ���;Ͳ�������
		System.out.println(c==m);//true
		System.out.println(c==b);//false
		System.out.println(e==f);//false   //����==�������
		System.out.println(c==(a+b));//true  ��ӵ�ʱ����еĲ���
		System.out.println(c.equals(a+b));//true
		System.out.println(g==(a+b));//true   Ҳ�ǲ����intȻ��װ���long
		System.out.println(g.equals(a+b));//false
		
		//���������Ż�
//		while(false){
//			System.out.println("wo");
//		}
	}

}
