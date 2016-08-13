package com.datasource.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.apache.commons.lang.StringUtils;


public class StringTools {

    public static int getMainVersion(String ver) {

        int index = ver.indexOf(".");
        if (index == -1) {
            return Integer.parseInt(ver);
        }
        String mVer = ver.substring(0, index);

        return Integer.parseInt(mVer);
    }

    public static String removeNull(String src) {
        if (src == null) {
            return "";
        }
        String res = src.replaceAll("null", "\"\"");
        System.out.println("返回结果："+res);
        return res;
    }

    public static void main(String[] args) {
        // System.out.println(getMainVersion("12"));
        // System.out.println(getMainVersion("12.99"));
        //
        // String str =
        // "{\"sign\":\"84ae9871ab2be7da1cb4768097116e54\",\"userName\":null,\"entranceID\":\"1\",\"token\":\"6d0803e4129e4b9c95eb777ad9b525b6\",\"chanType\":\"app\",\"reqTime\":\"2014-11-13 11:42:35\"}";
        //
        // removeNull(str);

        // System.out.println(numUpperCaser("12000000.123123"));
        // System.out.println(DateUtil.getDateString(getAddDate(new Date(), 44)));

        System.out.println(changString("12546025682", 3));
    }

    @SuppressWarnings("static-access")
	public static Date getAddDate(Date date, int num) {
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.add(calendar.DATE, num);// 把日期往后增加一天.整数往后推,负数往前移动
        date = calendar.getTime(); // 这个时间就是日期往后推一天的结果
        return date;
    }

//    public static String numUpperCaser(String original) {
//        // 整数部分
//        String integerPart = "";
//        // 小数部分
//        String floatPart = "";
//
//        // 将数字转化为汉字的数组,因为各个实例都要使用所以设为静态
//        final char[] cnNumbers = { '零', '壹', '贰', '叁', '肆', '伍', '陆', '柒', '捌', '玖' };
//
//        // 供分级转化的数组,因为各个实例都要使用所以设为静态
//        final char[] series = { '元', '拾', '百', '仟', '万', '拾', '百', '仟', '亿' };
//
//        if (original.contains(".")) {
//            // 如果包含小数点
//            int dotIndex = original.indexOf(".");
//            integerPart = original.substring(0, dotIndex);
//            floatPart = original.substring(dotIndex + 1);
//        } else {
//            // 不包含小数点
//            integerPart = original;
//        }
//        // 因为是累加所以用StringBuffer
//        StringBuffer sb = new StringBuffer();
//
//        // 整数部分处理
//        for (int i = 0; i < integerPart.length(); i++) {
//            int number = getNumber(integerPart.charAt(i));
//
//            sb.append(cnNumbers[number]);
//            sb.append(series[integerPart.length() - 1 - i]);
//        }
//
//        // 小数部分处理
//        if (floatPart.length() > 0) {
//            sb.append("点");
//            for (int i = 0; i < floatPart.length(); i++) {
//                int number = getNumber(floatPart.charAt(i));
//
//                sb.append(cnNumbers[number]);
//            }
//        }
//
//        // 返回拼接好的字符串
//        return sb.toString();
//    }

    /**
     * 将字符形式的数字转化为整形数字 因为所有实例都要用到所以用静态修饰
     * 
     * @param c
     * @return
     */
//    private static int getNumber(char c) {
//        String str = String.valueOf(c);
//        return Integer.parseInt(str);
//    }

    public static String formatDate(Date d) {
        DateFormat df = new SimpleDateFormat("yyyy年MM月dd日");
        String str = df.format(d);
        return str;
    }

    /**
     * ：前num位、后num位显示，其它以*显示；
     * 
     * @param mobile
     * @return
     */
    public static String changString(String str, int num) {
        if(StringUtils.isBlank(str)){
            return "";
        }
        int length = str.length();
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<length-num*2;i++){
            sb.append("*");
        }
        
        String ss = str.substring(0, num) + sb.toString() + str.substring(length - num, length);
        return ss;
    }

}
