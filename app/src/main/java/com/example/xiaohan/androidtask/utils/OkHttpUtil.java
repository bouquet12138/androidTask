package com.example.xiaohan.androidtask.utils;

import java.util.concurrent.TimeUnit;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

/**
 * Created by xiaohan on 2017/11/18.
 */

public class OkHttpUtil {

    public static final MediaType JSON=MediaType.parse("application/json; charset=utf-8");

    /**
     * 发送普通的okHttp请求
     * @param address
     * @param callback
     */
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback){
        sendOkHttpRequest(address, callback, 5);
    }

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback, int outTime){
        OkHttpClient.Builder httpBuilder = new OkHttpClient.Builder();
        OkHttpClient client =
                httpBuilder.connectTimeout(outTime, TimeUnit.SECONDS)
                        .writeTimeout(outTime, TimeUnit.SECONDS)
                        .build();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }


    /**
     * 提交json
     * @param address
     * @param json
     * @param callback
     */
    public static void postJson(String address, String json, okhttp3.Callback callback){
       postJson(address, json, callback, 5);
    }

    public static void postJson(String address, String json, okhttp3.Callback callback, int outTime){
        OkHttpClient.Builder httpBuilder = new OkHttpClient.Builder();
        OkHttpClient okHttpClient =
                httpBuilder.connectTimeout(outTime, TimeUnit.SECONDS)
                        .writeTimeout(outTime, TimeUnit.SECONDS)
                        .build();
        //创建一个RequestBody(参数1：数据类型 参数2传递的json串)
        //json为String类型的json数据
        RequestBody requestBody = RequestBody.create(JSON, json);
        //创建一个请求对象
        Request request = new Request.Builder()
                .url(address)
                .post(requestBody)
                .build();
        okHttpClient.newCall(request).enqueue(callback);
    }

}
