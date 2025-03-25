package com.tutorac;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test Startd : Log from Listener..");
        System.out.println(result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Succeeded : Log from Listener..");
        System.out.println(result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test Failed: Log from Listener..");
        System.out.println(result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("Test Started: Log from Listener..");
        System.out.println(context.getSuite().getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Test Suite Execution Complete: Log from Listener..");
    }
}
