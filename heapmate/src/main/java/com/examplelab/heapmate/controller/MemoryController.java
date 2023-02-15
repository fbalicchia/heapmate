package com.examplelab.heapmate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemoryController {
  
  @GetMapping("/memory")
  public long getMemoryUsage() {
    Runtime runtime = Runtime.getRuntime();
    long currentMemoryUsage = (runtime.totalMemory() - runtime.freeMemory()) / 1024 / 1024;
    return currentMemoryUsage;
  }

  @PostMapping("/memory/allocate")
  public void allocateMemory(@RequestParam("value") long value) {
    byte[] bytes = new byte[(int) value * 1024 * 1024];
  }

  @PostMapping("/memory/dialup")
  public void dialUp(@RequestParam("value") long value) {
    Runtime runtime = Runtime.getRuntime();
    long currentMemoryUsage = (runtime.totalMemory() - runtime.freeMemory()) / 1024 / 1024;
    byte[] bytes = new byte[(int) (currentMemoryUsage + value) * 1024 * 1024];
    }

  @PostMapping("/memory/dialdown")
  public void dialDown(@RequestParam("value") long value) {
    Runtime runtime = Runtime.getRuntime();
    long currentMemoryUsage = (runtime.totalMemory() - runtime.freeMemory()) / 1024 / 1024;
    byte[] bytes = new byte[(int) (currentMemoryUsage - value) * 1024 * 1024];
    }
  
}