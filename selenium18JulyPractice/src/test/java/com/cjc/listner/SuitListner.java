package com.cjc.listner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class SuitListner implements ITestListener{

	public void onStart(ITestContext context) {
		System.out.println("Onstart ITEST listner");
		}

	public void onFinish(ITestContext context) {
		System.out.println("OnFINISH Method--");
	}
		
	public void onTestStart(ITestResult result) {
		System.out.println("OnTestStart Method---");		
	}

	public void onTestSuccess(ITestResult result) {
			System.out.println("In onTestSuccess Method--");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("In onTestFailure Method--");
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("In onTestSkipped method--");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("In onTestFailedButWithinSuccessPercentage method--");
	}

	
	

}
