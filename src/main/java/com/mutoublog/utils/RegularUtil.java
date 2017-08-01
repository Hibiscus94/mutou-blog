package com.mutoublog.utils;

import java.math.BigDecimal;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by intellij idea on 2015/1/8.
 * author:liujingkun
 * 正则验证工具
 */
public class RegularUtil {

    private static final String DA_LU_PHONE_PREFIX = "^(13|14|15|17|18)[0-9]\\d{8}$";
    private static final String HONG_KONG_PHONE_PREFIX = "^(852)\\d{8}$";
    private static final String AO_MEN_PHONE_PREFIX = "^(8536)\\d{7}$";

    /**
     * 字符串是否是纯数字
     *
     * @param str
     * @return
     */
    public static boolean isAllNum(String str) {
        Pattern pattern = Pattern.compile("[0-9]*");
        return pattern.matcher(str).matches();
    }

    public static boolean isInt(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isLong(String str) {
        try {
            Long.parseLong(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isBigDecimal(String str) {
        try {
            new BigDecimal(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isInPrecision(String str, int integerBit, int decimalBit) {
        if (!isBigDecimal(str))
            return false;
        String reg = "^-?([0-9]{1,"+integerBit+"}|[0-9]{1,"+integerBit+"}\\.[0-9]{1,"+decimalBit+"})$";
        return Pattern.compile(reg).matcher(str).matches();
    }

    /**
     * 字符串是否是邮箱
     *
     * @param email
     * @return
     */
    public static boolean isEmail(String email) {
        String str = "^[\\w-]+(\\.[\\w-]+)*@[\\w-]+(\\.[\\w-]+)+$";
        Pattern p = Pattern.compile(str);
        Matcher m = p.matcher(email);
        return m.matches();
    }

    /**
     * 字符串是否是手机号码
     *
     * @param mobile
     * @return
     */
    public static boolean isMobile(String mobile) {
        Matcher daLu = Pattern.compile(DA_LU_PHONE_PREFIX).matcher(mobile);
        Matcher hk = Pattern.compile(HONG_KONG_PHONE_PREFIX).matcher(mobile);
        Matcher am = Pattern.compile(AO_MEN_PHONE_PREFIX).matcher(mobile);
        return daLu.matches() || hk.matches() || am.matches();
    }

    /**
     * 判断字符串的长度是否在某个区间
     *
     * @param str
     * @param start
     * @param end
     * @return
     */
    public static boolean isStringInLength(String str, int start, int end) {
        if (str.length() >= start && str.length() <= end) {
            return true;
        }
        return false;
    }

    /**
     * 判断字符串是否是ip地址
     *
     * @param ip
     * @return
     */
    public static boolean isIpAddress(String ip) {
        String str = "([1-9]|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])(\\.(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])){3}";
        Pattern pattern = Pattern.compile(str);
        Matcher matcher = pattern.matcher(ip);
        return matcher.matches();
    }

    /**
     * 判断字符串是否和正则表达式匹配
     *
     * @param regx 正则表达式
     * @param str  待验证的字符串
     * @return boolean
     */
    public static boolean isMatch(String regx, String str) {
        Pattern pattern = Pattern.compile(regx);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

	/**
	 * 计算字符串的长度，如果字符串包含中文，则一个中文算2个字符长度
	 * @param str
	 * @return
	 */
	public static int strLen(String str) {
		String reg = "[\\u4E00-\\u9FA5]";
		Matcher m = Pattern.compile(reg).matcher(str);
		int chineseLen = 0;
		while (m.find()) {
			chineseLen++;
		}
		int otherLen = m.replaceAll("").length();
		return chineseLen*2 + otherLen;
	}

	/**
	 * 判断一个字符串是否是QQ
	 * @param str
	 * @return
	 */
	public static boolean isQQ(String str) {
		String reg = "[1-9][0-9]{4,11}";
		Pattern pattern = Pattern.compile(reg);
		return pattern.matcher(str).matches();
	}

	/**
	 * 判断一个字符串是否是电话
	 * @param str
	 * @return
	 */
	public static boolean isTel(String str) {
		String reg = "[\\d\\D]*(0\\d{2}[\\s\\-\\－]?[1-9]\\d{7}|0\\d{3}[\\s\\-\\－]?[1-9]\\d{6}|[1-9]\\d{6,7})[\\d\\D]*";
		Pattern pattern = Pattern.compile(reg);
		return pattern.matcher(str).matches();
	}

    /**
     * 判断一个字符串是否是url(暂时只能做简单无http/https url判断)
     * @param str
     * @return
     */
	public static boolean isUrlNoHttpOrHttps(String str){
	    String reg = "[a-z]+:\\/\\/[a-z0-9_\\-\\/.%]+";
        Pattern pattern = Pattern.compile(reg);
        return pattern.matcher(str).matches();
    }

    /**
     * 根据ip地址计算出long型的数据
     * @param strIP
     * @return
     */
    public static long ip2Long(String strIP){
        long[] ip=new long[4];
        //先找到IP地址字符串中.的位置
        int position1=strIP.indexOf(".");
        int position2=strIP.indexOf(".",position1+1);
        int position3=strIP.indexOf(".",position2+1);
        //将每个.之间的字符串转换成整型
        ip[0]=Long.parseLong(strIP.substring(0,position1));
        ip[1]=Long.parseLong(strIP.substring(position1+1,position2));
        ip[2]=Long.parseLong(strIP.substring(position2+1,position3));
        ip[3]=Long.parseLong(strIP.substring(position3+1));
        return (ip[0]<<24)+(ip[1]<<16)+(ip[2]<<8)+ip[3];
    }

    //将10进制整数形式转换成127.0.0.1形式的IP地址
    public static String long2IP(long longIP){
        StringBuffer sb=new StringBuffer("");
        //直接右移24位
        sb.append(String.valueOf(longIP>>>24));
        sb.append(".");
        //将高8位置0，然后右移16位
        sb.append(String.valueOf((longIP&0x00FFFFFF)>>>16));
        sb.append(".");
        sb.append(String.valueOf((longIP&0x0000FFFF)>>>8));
        sb.append(".");
        sb.append(String.valueOf(longIP&0x000000FF));
        return sb.toString();
    }

    // 根据Unicode编码完美的判断中文汉字和符号
    private static boolean isChinese(char c) {
        Character.UnicodeBlock ub = Character.UnicodeBlock.of(c);
        if (ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS || ub == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS
                || ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A || ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B
                || ub == Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION || ub == Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS
                || ub == Character.UnicodeBlock.GENERAL_PUNCTUATION) {
            return true;
        }
        return false;
    }

    // 完整的判断中文汉字和符号
    public static boolean isChinese(String strName) {
        char[] ch = strName.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            char c = ch[i];
            if (isChinese(c)) {
                return true;
            }
        }
        return false;
    }
     /**
     * 对url中文用URLEncoder.encode编码
     *
     * @param url 预处理的url
     * @param enc 编码方式
     * @return 处理后的url
     */
	public static String urlChinaeseParmsEncode(String url, String enc){
        if (!isChinese(url)){//无中文，不处理
            return url;
        }

        String [] url_array = url.split("[?]");
        String enUrl;
        try{
            if (url_array.length>1){
                String return_pram = "";
                String [] sub_url_array = url_array[1].split("[&]");
                if (sub_url_array.length>0){
                    //参数中有多个key=val
                    for (String sub_pair_parm : sub_url_array){
                        String[] key_val = sub_pair_parm.split("[=]");
                        if (key_val.length>1){
                            return_pram = (return_pram.equals("")  ? (return_pram) : (return_pram + "&"))+encodeChinaese(key_val[0],enc) + "=" + encodeChinaese(key_val[1], enc);
                        }else{
                            return_pram = (return_pram.equals("") ? (return_pram) : (return_pram + "&")) + encodeChinaese(sub_pair_parm,enc);
                        }
                    }
                    enUrl = encodeChinaese(url_array[0], enc) + "?" + return_pram;
                }else{
                    //参数仅有一个key=val，或者没有key=val
                    String[] key_val = url_array[1].split("[=]");
                    if (key_val.length>1){
                        //有一个key=val
                        enUrl = encodeChinaese(url_array[0], enc) + "?" + encodeChinaese(key_val[0], enc)+ "=" + encodeChinaese(key_val[1], enc);
                    }else{
                        enUrl = encodeChinaese(url_array[0], enc) + "?" + encodeChinaese(url_array[1], enc);
                    }
                }
            }else{
                //url中文不在参数里，直接在url中
                enUrl = encodeChinaese(url_array[0], enc);
            }
        }catch (Exception e){
            e.printStackTrace();
            enUrl = "";
        }

        return enUrl;
    }

    //中文字符串 URLEncoder.encode
    public static String encodeChinaese(String str, String enc){
        if (isChinese(str)){
            try{
                str = URLEncoder.encode(str, enc);
            }catch (Exception e){
                str = "";
            }
        }
        return str;
    }

//	public static void main(String[] args) {
//        System.out.println(isUrl("https://www.baidu.com/baidu?wd=%E5%A4%A7%E5%B0%8F%E5%86%99%E8%BD%AC%E6%8D%A2&tn=monline_4_dg&ie=utf-8"));
//        System.out.println(isUrl("https://www.baidu.com/s?ie=utf8&wd=url%E4%B8%AD%E6%96%87%E6%AD%A3%E5%88%99+java&tn=87048150_dg"));
//        System.out.println(isUrl("http://search.zbj.com/s/?kw=%E7%BD%91%E7%AB%99%E5%BB%BA%E8%AE%BE&type=&fr=search-history"));
//        System.out.println(isUrl("https://www.baidu.com/baidu"));
//        System.out.println(isUrl("http://blog.csdn.net/?aspxerrorpath=/liu76xt/article/details/44622505"));
//	}
    /**
     * 正则表达式：验证URL
     */
    private static final String REGEX_URL = "(http|https):\\/\\/[\\w\\-_]+(\\.[\\w\\-_]+)+([\\w\\-\\.,@?^=%&amp;:/~\\+#]*[\\w\\-\\@?^=%&amp;/~\\+#])?";
    /**
     * 校验URL
     *
     * @param url
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isUrl(String url) {
        return Pattern.matches(REGEX_URL, url);
    }

    //交集(注意结果集中若使用LinkedList添加，则需要判断是否包含该元素，否则其中会包含重复的元素)
    public static String[] intersect(String[] arr1, String[] arr2) {
        List<String> l = new LinkedList<>();
        Set<String> common = new HashSet<>();
        for (String str : arr1) {
            if (!l.contains(str)) {
                l.add(str);
            }
        }
        for (String str : arr2) {
            if (l.contains(str)) {
                common.add(str);
            }
        }
        String[] result = {};
        return common.toArray(result);
    }

    //求两个数组的差集
    public static String[] substract(String[] arr1, String[] arr2) {
        LinkedList<String> list = new LinkedList<>();
        for (String str : arr1) {
            if (!list.contains(str)) {
                list.add(str);
            }
        }
        for (String str : arr2) {
            if (list.contains(str)) {
                list.remove(str);
            }
        }
        String[] result = {};
        return list.toArray(result);
    }
}
