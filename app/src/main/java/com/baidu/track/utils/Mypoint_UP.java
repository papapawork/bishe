package com.baidu.track.utils;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.util.ArrayList;
import java.util.List;

public class Mypoint_UP {
    private static String myserverip="http://39.108.158.171/server.php";
    private static String myloginip="http://39.108.158.171/login.php";

    public static String Up_Request(String longitude, String latitude,String imei,String time)
            throws Exception{
        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("longitude", longitude));
        params.add(new BasicNameValuePair("latitude", latitude));
        params.add(new BasicNameValuePair("imei", imei));
        params.add(new BasicNameValuePair("time", time));
        String json = Http_up.request( Http_up.REQUEST_TYPE_GET,
                myserverip, params);
        return json;
    }

    public static String login(String name, String secrte,String age,String imei)
            throws Exception{
        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("name", name));
        params.add(new BasicNameValuePair("secret", secrte));
        params.add(new BasicNameValuePair("age", age));
        params.add(new BasicNameValuePair("imei", imei));
        String json = Http_up.request( Http_up.REQUEST_TYPE_GET,
                myloginip, params);
        return json;
    }
}
