package com.garryiv.java_stdin_agent;

import java.net.URL;
import java.nio.file.Paths;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

public class AgentMainTest extends Assert {
    @Test
    public void test() throws Exception {
        URL testResource = Thread.currentThread().getContextClassLoader().getResource("LICENSE");
        assertNotNull(testResource);
        String testFile = Paths.get(testResource.toURI()).toAbsolutePath().toString();
        AgentMain.premain(testFile, null);

        assertThat(System.in.available(), Matchers.greaterThan(0));
    }
}