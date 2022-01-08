package org.rerun;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class FailedAll implements IAnnotationTransformer {


	public void transform(ITestAnnotation x, Class arg1, Constructor arg2, Method arg3) {
		IRetryAnalyzer retryAnalyzer = x.getRetryAnalyzer();
		if (retryAnalyzer==null) {
			x.setRetryAnalyzer(Failed.class);		
	}

}}
//IAnnotationTranformer: Interface
