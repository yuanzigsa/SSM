package com.yuanzi;
import com.yuanzi.Bean.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("test.xml");
        Student student  = context.getBean(Student.class);
        System.out.println(student);
    }
}
