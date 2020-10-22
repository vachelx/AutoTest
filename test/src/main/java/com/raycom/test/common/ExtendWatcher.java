package com.raycom.test.common;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

/**
 * 监听每个test完成后将测试结果输出到报告中
 */
public class ExtendWatcher extends TestWatcher {
    private ExtentReports extent;

    public ExtendWatcher(ExtentReports extent) {
        this.extent = extent;
    }

    @Override
    protected void succeeded(Description description) {
        ExtentTest test = extent.createTest(description.getDisplayName(), "-");
        test.pass(description.getDisplayName());
        extent.flush();
    }

    @Override
    protected void failed(Throwable e, Description description) {
        ExtentTest test = extent.createTest(description.getDisplayName(), "Test failed");
        test.fail(e);
        extent.flush();
    }

}
