package springPackage;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ClientApplication {

	public static void main(String[] args) {
		Resource res=new ClassPathResource("my.xml");
		BeanFactory bf=new XmlBeanFactory(res);
		Object ob=bf.getBean("po");
		pojoclass pj=(pojoclass)ob;
		pj.show();

	}

}
