package ie.cit.caf.embeddeddb;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class EmbeddedDbApplication implements CommandLineRunner {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
    public static void main(String[] args) {
        SpringApplication.run(EmbeddedDbApplication.class, args);
    }

	@Override
	public void run(String... arg0) throws Exception {
		
		String sql = "SELECT fullName, gender FROM artists WHERE id = 1";
		Map<String, Object> map = jdbcTemplate.queryForMap(sql);
		
		System.out.println("Name: " + map.get("fullName"));
		System.out.println("Gender: " + map.get("gender"));
		
	}
}
