package com.mhk;

/**       ����ʽ���̰߳�ȫ
 * 	�ŵ㣺��һ�ε��òų�ʼ���������ڴ��˷ѡ�
 *	ȱ�㣺������� synchronized ���ܱ�֤��������������Ӱ��Ч�ʡ�
 *	getInstance() �����ܶ�Ӧ�ó����Ǻܹؼ����÷���ʹ�ò�̫Ƶ������
 * @author asus
 *
 */
public class NpuInfo {  
	private String name = "������ҵ��ѧ";
	private String address = "������������·127��";
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