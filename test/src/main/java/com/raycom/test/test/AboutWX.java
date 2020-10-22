package com.raycom.test.test;

import com.raycom.test.base.BaseTest;
import com.raycom.test.util.Util;

import org.junit.Test;

import io.appium.java_client.MobileElement;

import static com.raycom.test.util.Constant.MAIN_ACTIVITY;

// 这里基于wx7.0.16版本测试的

public class AboutWX extends BaseTest {

    // 我 - 设置 - 关于微信 - 功能介绍 - 返回- 返回 - 返回
    // test中代码均为appium-desktop录制功能生成后做了一点调整
    @Test
    public void testJumpWXFriends(){
        Util.waitActivity(MAIN_ACTIVITY, 30, mDriver);
        Util.sleep(2);

        MobileElement el1 = (MobileElement) mDriver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"当前所在页面,与的聊天\"]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[4]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ImageView[1]");
        el1.click();

        MobileElement el3 = (MobileElement) mDriver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"当前所在页面,与的聊天\"]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/com.tencent.mm.ui.mogic.WxViewPager/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[5]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout");
        el3.click();
        Util.sleep(1);
        MobileElement el4 = (MobileElement) mDriver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"当前所在页面,设置\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[7]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[1]");
        el4.click();
        Util.sleep(1);
        MobileElement el5 = (MobileElement) mDriver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout");
        el5.click();
        Util.sleep(2);
        MobileElement el6 = (MobileElement) mDriver.findElementByAccessibilityId("返回");
        el6.click();
        Util.sleep(1);
        MobileElement el7 = (MobileElement) mDriver.findElementByAccessibilityId("返回");
        el7.click();
        Util.sleep(1);
        MobileElement el8 = (MobileElement) mDriver.findElementByAccessibilityId("返回");
        el8.click();
        Util.sleep(1);
    }
}
