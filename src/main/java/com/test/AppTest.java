package com.test;

import java.util.ArrayList;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.beans.Address;
import com.beans.Student;
import com.beans.StudentConfig;

public class AppTest {

	public static void main(String[] args) {
	    
		//Below line is for xml configuration
	    //ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
		// Below line is for java bases configuration
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(StudentConfig.class);
	    Student student = (Student) ctx.getBean("student"); // that student bean we created in StudentConfig class
	    student.setName("Swapnil");
	    student.setAge(27);
	    ArrayList<String> mn = new ArrayList<String>();
	    mn.add("1111");
	    mn.add("2222");
	    student.setMobileno(mn);
	    Address a = new Address();
	    a.setLandmark("FC Road,Pune");
	    student.setAddress(a);
	    
	    System.out.println(student.getName());
	    System.out.println(student.getAge());
	    System.out.println(student.getMobileno());
	    System.out.println(student.getAddress().getLandmark());
	   // System.out.println(student.hashCode());
	    
	}
}
