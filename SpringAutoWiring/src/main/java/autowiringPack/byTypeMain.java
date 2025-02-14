package autowiringPack;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class byTypeMain {
	public static void main(String[] args) {
		Resource r=new ClassPathResource("ByType.xml");
		BeanFactory bf=new XmlBeanFactory(r);
		ByTypeObject ob=(ByTypeObject)bf.getBean("p");
		ob.showData();
	}

}
