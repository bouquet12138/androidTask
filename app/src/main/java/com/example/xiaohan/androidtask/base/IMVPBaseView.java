package com.example.xiaohan.androidtask.base;

import android.content.Context;

/**
 * Created by xiaohan on 2018/9/25.
 */

public interface IMVPBaseView {

    /**
     * 显示加载进度条
     * @param msg
     */
    void showLoading(String msg);
    /**
     * 关闭正在加载view
     */
    void hideLoading();
    /**
     * 显示提示
     * @param msg
     */
    void showToast(String msg);
    /**
     * 获取上下文
     * @return 上下文
     */
    Context getContext();

}
