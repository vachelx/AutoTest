package com.raycom.test.base;

import com.raycom.test.util.TestManager;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestWatcher;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;

/**
 * 单个测试类都需要继承于BaseTest 参考Login.class
 * 已适配单独运行或者在套件中运行均能输出测试报告
 *
 */
public abstract class BaseTest {
    protected AndroidDriver mDriver; // 测试手机的控制者
    private boolean hasInitBefore;
    @Rule
    public TestWatcher eu = TestManager.getTestWatcher(); // 监听每个@Test方法执行前后的额外操作->记录报告

    @Before
    public void setUp() throws MalformedURLException {
        hasInitBefore = TestManager.hasInit();
        mDriver = TestManager.getDriver();
    }

    @After
    public void tearDown() {
        // 不使用suit而是单独运行单个Test时，该标志位为false,需要将TestManager相关参数重置
        if (!hasInitBefore) {
            TestManager.reset();
        }
    }
}
