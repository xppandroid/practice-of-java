package java_net_expl;

import java.net.InetAddress;

public class InetAddressTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		InetAddress ip=InetAddress.getByName("www.youtube.com");
		System.out.println("YouTube�Ƿ�ɴ"+ip.isReachable(2000));
		System.out.println(ip.getHostAddress());
		
		InetAddress local=InetAddress.getByAddress(new byte[] {127,0,0,1});
		System.out.println("�����Ƿ�ɴ"+local.isReachable(2000));
		System.out.println(local.getCanonicalHostName());
		
		//**//���÷���
		//InetAddress��û�й��������ṩ������̬��������ȡInetAddressʵ��
		
		InetAddress ip_obj1=InetAddress.getByName("www.google.com");
		InetAddress ip_obj2=InetAddress.getByAddress(new byte[] {127,0,0,1});
		
		//InetAddress���ṩ��������������ȡInetAddressʵ����Ӧ��IP��ַ��������
		
		String all_name=ip_obj1.getCanonicalHostName();
		String ip_address=ip_obj1.getHostAddress();
		String pc_name=ip_obj2.getHostName();
		
		//InetAddress���ṩ��ȡ����IP��ַ��Ӧ��InetAddressʵ���ķ���
		InetAddress local_inetaddress=InetAddress.getLocalHost();
		
		//InetAddress���ṩ����IP��ַ�Ƿ�ɴ�ķ���
		
		boolean is_reach=ip_obj1.isReachable(2000);
		
		//**//���÷������
		
		System.out.println("ip_obj1��ȫ�޶�����"+all_name);
		System.out.println("ip_obj1��IP��ַ"+ip_address);
		System.out.println("ip_obj2�ı�����"+pc_name);
		System.out.println("����IP��InetAddressʵ��"+local_inetaddress.toString());
		System.out.println("ip_obj1�Ƿ�ɴ�"+is_reach);

	}

}
