package my.test.demo.test;

import my.test.demo.config.TestConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by zhanghuang on 2020/9/29
 *
 * @Description
 */

public class TestForDemo {


	@Test
	public  void  demo(){
		AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(TestConfig.class);

		my.test.demo.repository.Test test = acac.getBean(my.test.demo.repository.Test.class);

		test.hello();
	}
}
