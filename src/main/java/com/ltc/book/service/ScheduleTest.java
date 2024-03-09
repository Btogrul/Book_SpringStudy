package com.ltc.book.service;

import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;
@Service
@RequiredArgsConstructor
public class ScheduleTest {
    @Scheduled(fixedRate = 3000)
    public void printMessage() {
        System.out.println("Scheduled task executed at: " + new Date());
    }

}
