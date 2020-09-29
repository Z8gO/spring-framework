package my.test.demo.domain;

import my.test.demo.config.TestConfig;
import my.test.demo.repository.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by zhanghuang on 2020/9/29
 *
 * @Description
 */
public class DomainTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(TestConfig.class);

		Test test = acac.getBean(Test.class);

		test.hello();
	}
}
