package com.raycom.test;

import com.raycom.test.base.BaseSuitTest;
import com.raycom.test.test.AboutWX;
import com.raycom.test.test.JumpWXFriends;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AboutWX.class,
        JumpWXFriends.class,
})
public class AutoTestSuit extends BaseSuitTest {

}
