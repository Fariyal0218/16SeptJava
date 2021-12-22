package com.example.SeptJavaSpring;
import com.example.SeptJavaSpring.di.Department;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SeptJavaSpringApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context= SpringApplication.run(SeptJavaSpringApplication.class, args);
        Department department= context.getBean(Department.class);

//        ApplicationContext context1 = new AnnotationConfigApplicationContext(SimConfig.class);
//        Sim sim = context.getBean(Airtel.class);
//        sim.calling();
////		sim.data();



//        Department department = context.getBean(Department.class);
//        department.showEmp();
//



        //   Vodafone vodafone = new Vodafone();
//		vodafone.calling();
//		vodafone.data();
//
//		Airtel airtel = new Airtel();
//		airtel.calling();
//		airtel.data();

//		ApplicationContext context = new AnnotationConfigApplicationContext(SimConfig.class);
//		Sim sim = context.getBean(Jio.class);
//		sim.calling();
//		sim.data();


    }

}

