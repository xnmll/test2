package com.mhk;

import org.junit.Test;

public class WorkTest {
	
	@Test
	public void test() {
		//1.��������
//		NpuInfo info = NpuInfo.getInstance();
//		System.out.println(info.toString());
		//2.���󹤳�����
//		SimpleMobileFactory factory = new SimpleMobileFactory();
//		Mobile mobile = factory.create("iphone");
//		mobile.product();
		
		Context context = new Context(new USTaxCalculate());    
		System.out.println(context.executeStrategy(1000));
	 
	    context = new Context(new MexicoTaxCalculate());      
	    System.out.println(context.executeStrategy(1000));
	}

}
