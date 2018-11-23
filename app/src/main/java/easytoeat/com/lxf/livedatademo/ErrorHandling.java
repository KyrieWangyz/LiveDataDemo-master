package easytoeat.com.lxf.livedatademo;

import com.lxf.common.base.BaseErrorHandling;

/**
 * LifeDemo
 * com.lxf.common.base
 * Created by Kyrie
 * Created on 2018/7/5.
 */

public class ErrorHandling extends BaseErrorHandling {


    public static int SUCCES = 200; //正确
    public static int ERROR = 201; //服务器通用错误
    public static int PARAMETERERROR = 202;
    public static int TOKENERROR = 203; //token校验错误,需要重新登录


    public boolean handing(int errorCode, String msg) {
        return true;
    }
}
