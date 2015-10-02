package com.garryiv.java_stdin_agent;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.instrument.Instrumentation;

public class AgentMain {
    public static void premain(String args, Instrumentation inst) {
        System.out.println("AgentMain: " + args);
        try {
            System.setIn(new FileInputStream(args));
        } catch (FileNotFoundException e) {
            System.out.println("AgentMain: " + e.getMessage());
        }
    }
}
