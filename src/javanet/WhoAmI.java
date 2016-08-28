package javanet;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by xuan on 2016/7/15 0015.
 */
public class WhoAmI {
    public static void main(String[] args) throws UnknownHostException{
        if (args.length != 1) {
            System.err.println(
                    "Usage: WhoAmI MachineName"
            );
            System.exit(1);
        }
        InetAddress inetAddress = InetAddress.getByName(args[0]);
        System.out.println(inetAddress);
    }
}
