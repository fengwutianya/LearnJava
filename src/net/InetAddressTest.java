package net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by xuan on 2017/8/31 0031.
 */
public class InetAddressTest {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getLocalHost();
            String hostName = address.getHostName();
            String ip = address.getHostAddress();
            byte[] ips = address.getAddress();
            System.out.println(hostName);
            System.out.println(ip);
            for (int i = 0; i < ips.length; i++) {
                System.out.print((ips[i] + 256) % 256);
                if (i < 3) System.out.print(".");
            }
            System.out.println();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        try {
            InetAddress address = InetAddress.getByName("www.baidu.com");
            System.out.println(address.getHostName());
            System.out.println(address.getHostAddress());
            address = InetAddress.getByName("220.181.112.244");
            System.out.println(address.getHostName());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
