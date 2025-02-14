package springPackage;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class mapmain {
	public static void main(String arg[])
	{
		Resource r=new ClassPathResource("my.xml");
		BeanFactory b=new XmlBeanFactory(r);
		mappojo mj=(mappojo)b.getBean("m");
		mj.show();
	}

}
