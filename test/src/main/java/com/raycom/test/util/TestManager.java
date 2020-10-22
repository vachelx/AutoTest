package com.raycom.test.util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.raycom.test.common.ExtendWatcher;

import org.junit.rules.TestWatcher;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;

/**
 * 管理全局唯一的TestWatcher和AndroidDriver
 * 目的是：
 * 1.保证运行Suit套件时，多个测试用例可以将报告输出到同一个文件
 * 2.每个测试用例完成后进行下一个测试用例时App无需重启
 */
public class TestManager {
    private static volatile AndroidDriver sDriver;
    private static TestWatcher sWatcher;

    public static synchronized TestWatcher getTestWatcher() {
        if (sWatcher == null) {
            sWatcher = new ExtendWatcher(getExtentReports());
        }
        return sWatcher;
    }

    public static boolean hasInit() {
        return sDriver != null;
    }

    public static synchronized AndroidDriver getDriver() throws MalformedURLException {
        if (sDriver == null) {
            sDriver = new AndroidDriver(new URL(Config.REMOTE_URL), Util.getDesiredCapabilities());
        }
        return sDriver;
    }

    public static void setAndroidDriver(AndroidDriver driver) {
        sDriver = driver;
    }

    public static void setTestWatcher(TestWatcher watcher) {
        sWatcher = watcher;
    }

    public static void reset() {
        if (sDriver != null) {
            sDriver.quit();
        }
        setAndroidDriver(null);
        setTestWatcher(null);
    }

    private static synchronized ExtentReports getExtentReports() {
        String reportPath = "reports/" + Util.getMarkDate() + "/" + Util.getMarkTime() + ".html";
        ExtentReports extentReports = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter(reportPath);
        spark.config().setOfflineMode(true);
        extentReports.attachReporter(spark);
        return extentReports;
    }
}
