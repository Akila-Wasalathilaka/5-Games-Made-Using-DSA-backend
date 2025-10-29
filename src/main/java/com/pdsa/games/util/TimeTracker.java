package com.pdsa.games.util;

import org.springframework.stereotype.Component;

@Component
public class TimeTracker {

    public long start() {
        return System.currentTimeMillis();
    }

    public long end(long startTime) {
        return System.currentTimeMillis() - startTime;
    }
}