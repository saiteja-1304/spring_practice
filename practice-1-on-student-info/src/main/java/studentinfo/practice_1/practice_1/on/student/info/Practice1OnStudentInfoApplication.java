package studentinfo.practice_1.practice_1.on.student.info;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
//@EnableMongoRepositories
public class Practice1OnStudentInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(Practice1OnStudentInfoApplication.class, args);
	}

}
