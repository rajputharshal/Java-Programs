package wirelessApp;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ByNameMain {
	public static void main(String arg[])
	{
		Resource r=new ClassPathResource("AutoWiring.xml");
		BeanFactory b=new XmlBeanFactory(r);
		ByNameOb obj=(ByNameOb)b.getBean("wll");
		obj.getData();
	}

}
