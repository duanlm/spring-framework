package com.dlm;

import com.dlm.po.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApplication {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-student.xml");
		Teacher teacher = (Teacher) ac.getBean("teacher");
		System.out.println("_____"+teacher);
	}
}
