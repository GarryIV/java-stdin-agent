package com.garryiv.java_stdin_agent;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.instrument.Instrumentation;

public class AgentMain {
    /**
     *
     * @param args
     * @param inst
     * @throws FileNotFoundException
     */
    public static void premain(String args, Instrumentation inst) throws FileNotFoundException {
        System.setIn(new FileInputStream(args));
    }
}
