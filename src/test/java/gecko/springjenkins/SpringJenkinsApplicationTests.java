package gecko.springjenkins;

//import org.junit.jupiter.api.Test;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;



@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringJenkinsApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplicationTests.class);


	@Test
	public contextLoads() {
		logger.info("test case executing...");
		logger.info("test case executing second log statement...");
		assertEquals(true, true);

	}

}
