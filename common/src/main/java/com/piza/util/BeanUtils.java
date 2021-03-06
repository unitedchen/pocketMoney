package com.piza.util;

import org.apache.commons.beanutils.PropertyUtils;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by Peter on 15/3/16.
 */
public class BeanUtils {

    public static void copyProperties(Object dest,Object orig){
        try {
            PropertyUtils.copyProperties(dest, orig);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
