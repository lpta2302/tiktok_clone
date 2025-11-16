package edu.ueh.final_android_app.util;

import edu.ueh.final_android_app.models.Account;

public class CommonUtil {
    public static Account currentUser = new Account("", "Hoang", "Huy", "hoanghuy", "111111");
    public static boolean isRequired(String value){
        if (value == null || value.isEmpty()){
            return false;
        }
        return true;
    }
}
