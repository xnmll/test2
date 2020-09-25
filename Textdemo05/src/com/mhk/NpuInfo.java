package com.mhk;

/**       懒汉式，线程安全
 * 	优点：第一次调用才初始化，避免内存浪费。
 *	缺点：必须加锁 synchronized 才能保证单例，但加锁会影响效率。
 *	getInstance() 的性能对应用程序不是很关键（该方法使用不太频繁）。
 * @author asus
 *
 */
public class NpuInfo {  
	private String name = "西北工业大学";
	private String address = "西安市友谊西路127号";
	private String telephone = "029-88494433";
    private static NpuInfo instance;  
    private NpuInfo (){}  
    
	public String toString() {
		return "NpuInfo [name=" + name + ", address=" + address + ", telephone=" + telephone + "]";
	}

	public static synchronized NpuInfo getInstance() {  
	    if (instance == null) {  
	        instance = new NpuInfo();  
	    }  
	    return instance;  
    }  
}