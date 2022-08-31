package com.yuanzi;
import com.yuanzi.Bean.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("test.xml");
        Student student  = (Student) context.getBean("student");
        System.out.println(student);
        context.close();

    }
}
