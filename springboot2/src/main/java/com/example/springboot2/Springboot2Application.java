package com.example.springboot2;

//UC3
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Springboot2Application {
	public static final Logger logger = LoggerFactory.getLogger(Springboot2Application.class);

	public static void main(String[] args) {
		logger.info("Welcome to Spring Concept Demo");
		ApplicationContext context = SpringApplication.run(Springboot2Application.class, args);

		logger.info("\n*** Example Using @Autowired annotation ***");

		EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
		employeeBean.setEid(104);
		employeeBean.setEname("Spring Framework Guru");
		employeeBean.getDeptBean().setDeptName("IT Department");
		employeeBean.showEmployeeDetails();
	}
}









//import com.example.springLog.DemoBean;
//UC2
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import org.springframework.context.ApplicationContext;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication
//@ComponentScan("com.springlog.springlogmessage.components")  // Ensures DemoBean is found
//public class SpringLogProjectApplication {
//	public static final Logger logger = LoggerFactory.getLogger(SpringLogProjectApplication.class);
//
//	public static void main(String[] args) {
//		logger.debug("Welcome to Spring Concept Demo");
//
//		ApplicationContext context = SpringApplication.run(SpringLogProjectApplication.class, args);
//
//		logger.debug("Checking Context: {}", context.getBean(DemoBean.class));
//		logger.debug("\n*** Example Using @Autowire annotation on property ***");
//	}
//}








//UC1
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ApplicationContext;
//
//@SpringBootApplication
//public class SpringLogProjectApplication {
//	public static void main(String[] args) {
//		ApplicationContext context = SpringApplication.run(SpringLogProjectApplication.class, args);
//
//		// Get DemoBean and use it
//		DemoBean demoBean = context.getBean(DemoBean.class);
//		System.out.println(demoBean.getMessage());  // Output: Hello from DemoBean!
//	}
//}