package springPackage;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

class collectionapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource r=new ClassPathResource("my.xml");
		BeanFactory b=new XmlBeanFactory(r);
		collectionPojo c=(collectionPojo)b.getBean("cl");
		c.show();
	}

}
