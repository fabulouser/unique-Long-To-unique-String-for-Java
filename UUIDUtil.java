package com.example.demo.controller;


public class UUIDUtil {
    //唯一字符串转换唯一Long,因为门禁系统的userid只能是数字类型，但是教师复合编号是一个字符串，教师复合编号是唯一的，所以所生成的数字也是唯一的，因为字符串相同，所以生成的数字是相同的

    public static String longToString(String string) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < string.length(); i = i + 3) {
            String substring = string.substring(i, i + 3);
            char ch = (char) Integer.parseInt(substring);
            sb.append(ch);
        }
        return sb.toString();
    }

    public static String uniqueStringTranslateUniqueLong(String string) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < string.length(); ++i) {
            int ch = (int) string.charAt(i);
            if (ch < 100) {
                if(ch<10)
                {
                    sb.append('0');
                }
                sb.append('0').append(ch);
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public  static void main(String[] args){
        System.out.println(UUIDUtil.uniqueStringTranslateUniqueLong("1"));
        System.out.println(UUIDUtil.longToString("051049048048049056048048048049050048048048052056056"));
    }
}

