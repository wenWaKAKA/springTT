package com.codewen;

public class HelloWorld {

	private String message1;
	private String message2;

	public void getMessage1() {
		System.out.println("HelloWorld:" + message1);
	}

	public void setMessage1(String message1) {
		this.message1 = message1;
	}

	public void getMessage2() {
		System.out.println("HelloWorld:" + message2);
	}

	public void setMessage2(String message2) {
		this.message2 = message2;
	}

	// 初始化回调
	public void init() {
		System.out.println("HelloWorld init");
	}

	// 初始化销毁
	public void destroy() {
		System.out.println("HelloWorld destroy");
	}
}
