package com.codewen;

import java.util.StringTokenizer;

public class HelloChina {

	private String message1;
	private String message2;
	private String message3;

	public void getMessage1() {
		System.out.println("HelloChina:" + message1);
	}

	public void setMessage1(String message1) {
		this.message1 = message1;
	}

	public void getMessage2() {
		System.out.println("HelloChina:" + message2);
	}

	public void setMessage2(String message2) {
		this.message2 = message2;
	}

	public void getMessage3() {
		System.out.println("HelloChina:" + message3);
	}

	public void setMessage3(String message3) {
		this.message3 = message3;
	}

	// 初始化回调
	public void init() {
		System.out.println("HelloChina init");
	}

	// 初始化销毁
	public void destroy() {
		System.out.println("HelloChina destroy");
	}
}
