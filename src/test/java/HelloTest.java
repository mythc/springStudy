import com.flh.sphello.HelloApi;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloTest {
    @Test
    public void testHelloWorld(){
//        XmlBeanFactory
//        BeanFactory beanFactory = new ClassPathXmlApplicationContext("helloworld.xml");
//        BeanFactory beanFactory = new FileSystemXmlApplicationContext("aaa.xml");
        ApplicationContext context = new ClassPathXmlApplicationContext("helloworld.xml");
        HelloApi helloApi = context.getBean( HelloApi.class);
        helloApi.sayHello();
    }

    @Test
    public void testInstantiatingBeanByConstructor(){
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("helloworld.xml");
        HelloApi bean1 = beanFactory.getBean("bean1", HelloApi.class);
        bean1.sayHello();
        HelloApi bean2 = beanFactory.getBean("bean2", HelloApi.class);
        bean2.sayHello();
    }

    @Test
    public void testInstantiatingBeanByStaticFactory(){
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("helloworld.xml");
        HelloApi bean2 = beanFactory.getBean("bean2", HelloApi.class);
        bean2.sayHello();
        HelloApi bean3 = beanFactory.getBean("bean3", HelloApi.class);
        bean3.sayHello();
    }

    @Test
    public void testInstantiatingBeanByInstanceFactory(){
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("helloworld.xml");
        HelloApi bean4 = beanFactory.getBean("bean4", HelloApi.class);
        bean4.sayHello();
    }

    @Test
    public void testConstructorDependencyInjectTest(){
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("hello.xml");
        HelloApi byIndex = beanFactory.getBean("byIndex", HelloApi.class);
        byIndex.sayHello();

        HelloApi byType = beanFactory.getBean("byType", HelloApi.class);
        byType.sayHello();

        HelloApi byName = beanFactory.getBean("byName", HelloApi.class);
        byName.sayHello();
    }
}
