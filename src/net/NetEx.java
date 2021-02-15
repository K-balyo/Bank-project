package net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*  ��Ʈ��ũ(Network)
   1. IP�ּ� : ���ͳ� �󿡼��� �� ��ǻ�͵��� �ν��ϱ� ���� �ο��� ������ ���Դϴ�.
    0 ~ 255 ������ ���� ���� ����(�̰��� Octet�̶�� �մϴ�) 4���� ����
    (���� �̷� ������ IPv4��� �մϴ�)�ؼ� ����ϴ�.
    ���ڸ����� �� �ּҴ� �ܿ�Ⱑ ���� �ϻ������� �� �� �ִ� ���� ������ 
    �ּҸ� ���� ���� ������(domain)�̶� �մϴ�.
    
    ��) IP�ּ� : 220.95.223.8
            ������ : ezenac.co.kr
            ȣ��Ʈ : www.ezenac.co.kr
            
  2. ��Ʈ (port)
  IP�ּҰ� ���ͳ� �󿡼� ��ǻ�͵鿡�� �ο��� �ּҶ��,
  ��Ʈ(port)�� �� ��ǻ�� ������ �� ���α׷�(���μ���)����  
  �Ҵ�� ��ȣ��� �� �� �ְڽ��ϴ�.��ǻ�ʹ� �� ��û�� ��Ʈ 
  ��ȣ�� ���� ����� ���μ����� ������� �ִ� ���Դϴ�.
  �ٸ��� ���ϸ�, �ϳ��� ��Ʈ�� ���� ���α׷�(���μ���)�� 
  ������ ���� �����ϴ�. IP�ּҰ� �����п��̶��,
  ��Ʈ�� ���ǽ� 201ȣ Ȥ�� 202ȣ��� �� �� �ְڳ׿�.
  
  ��Ʈ�� 0������ 65, 535������ 16��Ʈ ������ ���¸� �����ϴ�.
  �밳 0~1024 ������ �ý��׹ֳ� ���� ���񽺿��� ����ϴ� ��Ʈ�̰�
  1024 �̻��� ��Ʈ�� �����е��� ���Ƿ� ���ŵ� �����ϴ�.
  
  3. �������� : ��űԾ��Դ�... ��� ��ſ��� ���������� �ʿ��մϴ�.
  - TCP(Transmission Control Protocol) : �������� ���������̶� �մϴ�.
  ��� ��ȣ���� ���ӿ� ���� ������ �̷������ �����Դϴ�. �ڹٴ� TCP ����� Ŭ���̾�Ʈ
  ���� ����� ���� ServerSocket, Ŭ������ �����ϰ� �ֽ��ϴ�.
  - UDP(User Datagram Protocol) : ��� ��ȣ���� ���ӿ� ���� ���� ����
  �����͸� �����ϴ� ����Դϴ�. �����ڴ� �Ϲ������� �����ڿ��� ������ �����ڴ� �����Ͱ�
  ������������ ��ä ���� ��ٸ��� �ְ� �˴ϴ�. �ڹٿ����� UDP ��� ����� ���� 
  DatagramPacket, DatagramSocket Ŭ������ �����ϰ� �ֽ��ϴ�.
  
  4. ���� (Socket)�̶� ��Ʈ��ũ���� ��ȣ ȣ��Ʈ�� ����� ���� ������ �ǹ��մϴ�.
  - ����
  ȣ��Ʈ�� ����� �ϱ� ���ؼ��� ����� �ּ�(IP)�� ��Ʈ(Port)�� �ʿ��ϸ�,
  �ּҿ� ��Ʈ�� �̿��ؼ� ������ ������ �� �ֽ��ϴ�.
  Ex)
  Socket socket = new Socket(host, port);
  ServerSocket server = new ServerSocket(port);
  
  - ���� 
  ���ؼ�(Connection)�� ����
  
  5.java.net.InetAdress class - IP �ּҸ� ��ü �𵨸��� Ŭ����
 
 */
public class NetEx {
	// Ex) InetAddressTest
	public static void main(String[] args) throws UnknownHostException{
		InetAddress addr1 = InetAddress.getByName("daum.net");
		InetAddress addr3 = InetAddress.getLocalHost();
		System.out.println("===============================================");
		System.out.println(" IP = " + addr1.getHostAddress());
		System.out.println(" Host = " + addr1.getHostName());
		System.out.println(" ���� �ּ� = " + addr3.getHostAddress());
		System.out.println(" ���� �̸� = " + addr3.getHostName());
		
		
	}

}
