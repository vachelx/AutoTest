package com.raycom.test.test;

import com.raycom.test.base.BaseTest;
import com.raycom.test.util.Util;

import org.junit.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

import static com.raycom.test.util.Constant.MAIN_ACTIVITY;

public class JumpWXFriends extends BaseTest {

    // 发现 - 朋友圈 - 下滑一段
    // test中代码均为appium-desktop录制功能生成后做了一点调整
    @Test
    public void testJumpWXFriends(){
        Util.waitActivity(MAIN_ACTIVITY, 30, mDriver);
        Util.sleep(1);
        MobileElement el1 = (MobileElement) mDriver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"当前所在页面,与的聊天\"]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[3]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ImageView[1]");
        el1.click();
        MobileElement el2 = (MobileElement) mDriver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"当前所在页面,与的聊天\"]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/com.tencent.mm.ui.mogic.WxViewPager/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout");
        el2.click();
        new TouchAction(mDriver).press(PointOption.point(1200, 787)).moveTo(PointOption.point(734, 271)).release().perform();
    }
}
