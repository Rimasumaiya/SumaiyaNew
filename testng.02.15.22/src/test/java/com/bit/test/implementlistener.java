package com.bit.test;

import org.testng.ITestContext;
import org.testng.ITestResult;

public class implementlistener {
	
	 		
	    public void onFinish(ITestContext arg0) {					
	        // TODO Auto-generated method stub
	    	
	    	System.out.println(arg0.getName()+"is finished");
	        		
	    }		

	  		
	    public void onStart(ITestContext arg0) {					
	        // TODO Auto-generated method stub	
	    	System.out.println(arg0.getName()+"is started");
	        		
	    }		

	   		
	    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
	        // TODO Auto-generated method stub	
	    	
	    	
	    }		

	   		
	    public void onTestFailure(ITestResult arg0) {					
	        // TODO Auto-generated method stub	
	    	System.out.println(arg0.getName()+"is failed");
	    	System.out.println("call screenshot method");
	        		
	    }		

	 		
	    public void onTestSkipped(ITestResult arg0) {					
	        // TODO Auto-generated method stub	
	    	System.out.println(arg0.getName()+"is skipped");
	    	
	        		
	    }		

	   		
	    public void onTestStart(ITestResult arg0) {					
	        // TODO Auto-generated method stub				
	        		
	    }		

	  		
	    public void onTestSuccess(ITestResult arg0) {					
	        // TODO Auto-generated method stub				
	        		
	    }		
	
	

}
