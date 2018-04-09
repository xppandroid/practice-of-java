import java.net.InetAddress;

public class InetAddressTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		InetAddress ip=InetAddress.getByName("www.youtube.com");
		System.out.println("YouTube是否可达："+ip.isReachable(2000));
		System.out.println(ip.getHostAddress());
		
		InetAddress local=InetAddress.getByAddress(new byte[] {127,0,0,1});
		System.out.println("本机是否可达："+local.isReachable(2000));
		System.out.println(local.getCanonicalHostName());
		
		//**//常用方法
		//InetAddress类没有构造器，提供两个静态方法来获取InetAddress实例
		
		InetAddress ip_obj1=InetAddress.getByName("www.google.com");
		InetAddress ip_obj2=InetAddress.getByAddress(new byte[] {127,0,0,1});
		
		//InetAddress类提供了三个方法来获取InetAddress实例对应的IP地址和主机名
		
		String all_name=ip_obj1.getCanonicalHostName();
		String ip_address=ip_obj1.getHostAddress();
		String pc_name=ip_obj2.getHostName();
		
		//InetAddress类提供获取本机IP地址对应的InetAddress实例的方法
		InetAddress local_inetaddress=InetAddress.getLocalHost();
		
		//InetAddress类提供测试IP地址是否可达的方法
		
		boolean is_reach=ip_obj1.isReachable(2000);
		
		//**//常用方法输出
		
		System.out.println("ip_obj1的全限定域名"+all_name);
		System.out.println("ip_obj1的IP地址"+ip_address);
		System.out.println("ip_obj2的本机名"+pc_name);
		System.out.println("本机IP的InetAddress实例"+local_inetaddress.toString());
		System.out.println("ip_obj1是否可达"+is_reach);

	}

}
