package com.company;

import com.company.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);

        Alien obj1=context.getBean(Alien.class);
                System.out.println(obj1.getAge());
        obj1.code();

        Desktop dt=context.getBean(Desktop.class);
        dt.compile();

        Desktop dt1=context.getBean(Desktop.class);
        dt.compile();

       /* ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Alien obj1=context.getBean("alien1" ,Alien.class);
          obj1.setAge(21);
        System.out.println(obj1.getAge());
        obj1.code();
*/

   /*     Alien obj2=(Alien)context.getBean("alien1");
        System.out.println(obj2.age);
        obj2.code();
*/

       //     Desktop obj2=(Desktop)context.getBean("com2");
       // Desktop desktop=context.getBean(Desktop.class);
    }
}
