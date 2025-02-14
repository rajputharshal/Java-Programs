package springPackage;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ObjectMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource r=new ClassPathResource("test.xml");
		BeanFactory bf=new XmlBeanFactory(r);
		Objectpojo2 obj=(Objectpojo2)bf.getBean("xx");
		obj.show();

	}

}
