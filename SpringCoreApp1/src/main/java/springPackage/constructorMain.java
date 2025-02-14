package springPackage;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class constructorMain {

	public static void main(String[] args) {
		Resource r=new ClassPathResource("my.xml");
		BeanFactory b=new XmlBeanFactory(r);
		constructorPojo cc=(constructorPojo)b.getBean("c");
		
	}

}
