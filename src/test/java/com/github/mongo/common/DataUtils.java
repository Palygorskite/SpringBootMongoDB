package com.github.mongo.common;

import java.util.Random;

/**
 * <p>
 * 创建时间为 下午2:21-2019/1/31
 * 项目名称 SpringBootMongoDB
 * </p>
 *
 * @author shao
 * @version 0.0.1
 * @since 0.0.1
 */


public class DataUtils {

    public static String getRandomIp() {
        //ip范围
        int[][] range = {{607649792, 608174079},//36.56.0.0-36.63.255.255
            {1038614528, 1039007743},//61.232.0.0-61.237.255.255
            {1783627776, 1784676351},//106.80.0.0-106.95.255.255
            {2035023872, 2035154943},//121.76.0.0-121.77.255.255
            {2078801920, 2079064063},//123.232.0.0-123.235.255.255
            {-1950089216, -1948778497},//139.196.0.0-139.215.255.255
            {-1425539072, -1425014785},//171.8.0.0-171.15.255.255
            {-1236271104, -1235419137},//182.80.0.0-182.92.255.255
            {-770113536, -768606209},//210.25.0.0-210.47.255.255
            {-569376768, -564133889}, //222.16.0.0-222.95.255.255
        };

        Random rdint = new Random();
        int index = rdint.nextInt(10);
        return num2ip(range[index][0] + new Random().nextInt(range[index][1] - range[index][0]));
    }

    public static String num2ip(int ip) {
        int[] b = new int[4];
        String x;

        b[0] = (ip >> 24) & 0xff;
        b[1] = (ip >> 16) & 0xff;
        b[2] = (ip >> 8) & 0xff;
        b[3] = ip & 0xff;
        x = b[0] + "." + b[1] + "." + b[2] + "." + b[3];
        return x;
    }

    public static String randomMac4Qemu() {
        String SEPARATOR_OF_MAC = ":";
        Random random = new Random();
        String[] mac = {
            String.format("%02x", 0x52),
            String.format("%02x", 0x54),
            String.format("%02x", 0x00),
            String.format("%02x", random.nextInt(0xff)),
            String.format("%02x", random.nextInt(0xff)),
            String.format("%02x", random.nextInt(0xff))
        };
        return String.join(SEPARATOR_OF_MAC, mac);
    }

    public static String getIMEI() {// calculator IMEI
        int r1 = 1000000 + new Random().nextInt(9000000);
        int r2 = 1000000 + new Random().nextInt(9000000);
        String input = r1 + "" + r2;
        char[] ch = input.toCharArray();
        int a = 0, b = 0;
        for (int i = 0; i < ch.length; i++) {
            int tt = Integer.parseInt(ch[i] + "");
            if (i % 2 == 0) {
                a = a + tt;
            } else {
                int temp = tt * 2;
                b = b + temp / 10 + temp % 10;
            }
        }
        int last = (a + b) % 10;
        if (last != 0) {
            last = 10 - last;
        }
        return input + last;
    }

    public static String getImsi() {
        // 460022535025034
        String title = "4600";
        int second;
        do {
            second = new Random().nextInt(8);
        } while (second == 4);
        int r1 = 10000 + new Random().nextInt(90000);
        int r2 = 10000 + new Random().nextInt(90000);
        return title + "" + second + "" + r1 + "" + r2;
    }

    public static String getMac() {
        char[] char1 = "abcdef".toCharArray();
        char[] char2 = "0123456789".toCharArray();
        StringBuilder mBuffer = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            int t = new Random().nextInt(char1.length);
            int y = new Random().nextInt(char2.length);
            int key = new Random().nextInt(2);
            if (key == 0) {
                mBuffer.append(char2[y]).append(char1[t]);
            } else {
                mBuffer.append(char1[t]).append(char2[y]);
            }

            if (i != 5) {
                mBuffer.append(":");
            }
        }
        return mBuffer.toString();
    }

    public static String getRandomString(int length) {
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(62);
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }

    public static String getEmail(int lMin, int lMax) {
        String base = "abcdefghijklmnopqrstuvwxyz0123456789";
        String[] email_suffix = "@gmail.com,@yahoo.com,@msn.com,@hotmail.com,@aol.com,@ask.com,@live.com,@qq.com,@0355.net,@163.com,@163.net,@263.net,@3721.net,@yeah.net,@googlemail.com,@126.com,@sina.com,@sohu.com,@yahoo.com.cn".split(",");
        int length = (int) (Math.random() * (lMax - lMin + 1) + lMin);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int number = (int) (Math.random() * base.length());
            sb.append(base.charAt(number));
        }
        sb.append(email_suffix[(int) (Math.random() * email_suffix.length)]);
        return sb.toString();
    }

    public static String getTelephone() {
        String[] telFirst = "134,135,136,137,138,139,150,151,152,157,158,159,130,131,132,155,156,133,153,188".split(",");
        int index = (int) (Math.random() * (3 + 1) + 0);
//        int index = getNum(0, telFirst.length - 1);
        String first = telFirst[index];
        String second = String.valueOf((int) (Math.random() * (888 - 1 + 1) + 1) + 10000).substring(1);
//        String second = String.valueOf(getNum(1, 888) + 10000).substring(1);
        String thrid = String.valueOf((int) (Math.random() * (9100 - 1 + 1) + 1) + 10000).substring(1);
//        String thrid = String.valueOf(getNum(1, 9100) + 10000).substring(1);
        return first + second + thrid;
    }

}
