package demo;

import ie.cit.caf.embeddeddb.EmbeddedDbApplication;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = EmbeddedDbApplication.class)
public class EmbeddedDbApplicationTests {

	@Test
	public void contextLoads() {
	}

}
