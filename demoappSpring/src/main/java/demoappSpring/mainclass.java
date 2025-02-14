package demoappSpring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class mainclass {

	public static void main(String[] args) {
		Resource r=new ClassPathResource("test.xml");
		BeanFactory bf=new XmlBeanFactory(r);
		Object o=bf.getBean("p");
		pojo p=(pojo)o;
		System.out.println(p.getId() + p.getName() +p.getSal());
	}

}
