package com.sp.db2.db2test;

import com.sp.db2.db2test.model.Person;
import com.sp.db2.db2test.service.PersonService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static java.lang.String.format;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Db2TestApplicationTests {

	@Autowired
	private PersonService personService;

	@Test
	public void contextLoads() {

		Person person = null;
		for(int i=0;i<10;i++) {

			person = new Person();
			person.setName(format("jongwon %d", i));
			person.setEmail("jongwons.choi@gmail.com");
			person.setPhone("010-1111-2222");

			personService.savePerson(person);
			System.out.println("saved "+person);
		}

	}


}
