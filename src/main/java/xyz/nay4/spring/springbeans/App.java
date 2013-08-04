package xyz.nay4.spring.springbeans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

/**
 * Hello world!
 * Hello Git!
 * Hello New Save State!
 * Hello Another New Save State!
 * Hello Yet Another one
 */
public class App 
{
    public static void main( String[] args )
    {
    	//Triangle tri = new Triangle();
    	
    	//BeanFactory bf = new XmlBeanFactory(new FileSystemResource("spring.xml"));
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	Triangle tri = (Triangle) context.getBean("triangle");
    	
    	tri.drawTriangle();
    }
}
