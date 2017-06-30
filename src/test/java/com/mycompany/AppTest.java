
package com.mycompany;

import org.junit.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class AppTest {

    @Test
    public void testAsTrue() {
        is(true);
    }

    @Ignore
    @Test
    public void testWithAssertThat() {
        assertThat(1 + 1, equalTo(2));
    }

}
