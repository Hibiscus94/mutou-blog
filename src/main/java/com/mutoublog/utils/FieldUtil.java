package com.mutoublog.utils;

import java.lang.reflect.Method;

/**
 * Created by liushunlin on 2017/6/30.
 */
public class FieldUtil {
    /**
     * 根据属性名获取属性值
     */
    public static Object getFieldValueByName(String fieldName, Object o) {
        try {
            String firstLetter = fieldName.substring(0, 1).toUpperCase();
            String getter = "get" + firstLetter + fieldName.substring(1);
            Method method = o.getClass().getMethod(getter);
            return method.invoke(o);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 获取属性名数组
     */
//    public static String[] getFiledName(Object o) {
//        Field[] fields = o.getClass().getDeclaredFields();
//        String[] fieldNames = new String[fields.length];
//        for (int i = 0; i < fields.length; i++) {
//            fieldNames[i] = fields[i].getName();
//        }
//        return fieldNames;
//    }

    /**
     * 获取属性类型(type)，属性名(name)，属性值(value)的map组成的list
     */
//    public static List<Map<String, Object>> getFiledsInfo(Object o) {
//        Field[] fields = o.getClass().getDeclaredFields();
//        List<Map<String, Object>> list = new ArrayList<>();
//        Map<String, Object> infoMap;
//        for (Field field : fields) {
//            // 排除因实现Serializable 接口而产生的属性serialVersionUID
//            if (!field.getName().equals("serialVersionUID")) {
//                infoMap = new HashMap<>();
//                infoMap.put("type", field.getType().toString());
//                infoMap.put("name", field.getName());
//                infoMap.put("value", getFieldValueByName(field.getName(), o));
//                list.add(infoMap);
//            }
//        }
//        return list;
//    }

    /**
     * 获取对象的所有属性值，返回一个对象数组
     */
//    public static Object[] getFiledValues(Object o) {
//        String[] fieldNames = getFiledName(o);
//        Object[] value = new Object[fieldNames.length];
//        for (int i = 0; i < fieldNames.length; i++) {
//            value[i] = getFieldValueByName(fieldNames[i], o);
//        }
//        return value;
//    }
}