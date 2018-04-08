package InetAddress;

import java.net.URLEncoder;


public class URLDecoder_URLEncoder {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String urlString=URLEncoder.encode("将中文转换为MIME", "GBK");
		
		System.out.println(urlString);
		
		String keyWord=java.net.URLDecoder.decode("%BD%ABMIME%D7%AA%BB%BB%B3%C9%D6%D0%CE%C4","GBK");
		
		System.out.println(keyWord);
		
		
		
		
	}

}
