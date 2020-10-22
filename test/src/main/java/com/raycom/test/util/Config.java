package com.raycom.test.util;

/**
 * 配置参数
 */
public class Config {
    // 测试时链接的手机相关参数
    public static final String PLATFORM_NAME = "Android";
    public static final String PLATFORM_VERSION = "10";
    public static final String DEVICE_NAME = "OXF_AN00";
    // 测试的app
    public static final String APP_PACKAGE = "com.tencent.mm";
    public static final String APP_ACTIVITY = "com.tencent.mm.ui.LauncherUI";

    // Appium client运行时指定的服务端url
    public static final String REMOTE_URL = "http://localhost:4723/wd/hub";
}
