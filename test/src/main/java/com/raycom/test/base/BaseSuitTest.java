package com.raycom.test.base;

import com.raycom.test.util.TestManager;

import junit.framework.TestCase;

import org.junit.AfterClass;
import org.junit.BeforeClass;

import java.net.MalformedURLException;

/**
 * 多个测试类一起执行时需要使用Suit套件，这里要求Suit都需要继承于BaseSuitTest
 * 参考AutoTestSuit.class
 */
public abstract class BaseSuitTest extends TestCase {
    @BeforeClass
    public static void beforeClass() throws MalformedURLException {
        TestManager.getTestWatcher();
        TestManager.getDriver();
    }

    @AfterClass
    public static void afterClass() {
        TestManager.reset();
    }

}
