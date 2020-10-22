package com.raycom.test.util;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.text.SimpleDateFormat;
import java.util.Date;

import io.appium.java_client.android.AndroidDriver;

public class Util {
    /**
     * 获取Appium配置
     */
    public static DesiredCapabilities getDesiredCapabilities() {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", Config.PLATFORM_NAME);
        desiredCapabilities.setCapability("appPackage", Config.APP_PACKAGE);
        desiredCapabilities.setCapability("deviceName", Config.DEVICE_NAME);
        desiredCapabilities.setCapability("platformVersion", Config.PLATFORM_VERSION);
        desiredCapabilities.setCapability("appActivity", Config.APP_ACTIVITY);
        desiredCapabilities.setCapability("resetKeyboard", true);
        desiredCapabilities.setCapability("noReset", true);
        desiredCapabilities.setCapability("automationName", "UiAutomator2");
        desiredCapabilities.setCapability("ensureWebviewsHavePages", true);
        return desiredCapabilities;
    }

    static String getMarkTime() {
        System.currentTimeMillis();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        Date date = new Date();
        String dateStr = sdf.format(date);
        return dateStr.replace(" ", "_");
    }

    static String getMarkDate() {
        System.currentTimeMillis();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        return sdf.format(date);
    }

    /**
     * 线程等待timeSecond 秒
     */
    public static void sleep(float timeSecond) {
        try {
            Thread.sleep((long) (timeSecond * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 等待activity， 超时时间timeout 秒
     */
    public static boolean waitActivity(String activity, long timeout, AndroidDriver driver) {
        boolean isActivity = false;
        long lastTime = System.currentTimeMillis();
        do {
            sleep(3);
        } while (System.currentTimeMillis() - lastTime < timeout * 1000 && !(isActivity = checkActivity(activity, driver)));
        return isActivity;
    }

    public static boolean checkActivity(String activity, AndroidDriver driver) {
        return driver.currentActivity() != null && driver.currentActivity().contains(activity);
    }
}
