package com.example.boot;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.example.daoimpl.EmployeeDaoImpl;
import com.example.entity.Login;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootApplicationTests 
{
	Login log = Config.getLogin();
	@Before
	public void check()
	{
		log.setUsername("dinesh");
		log.setPassword("dinesh123");
	}

	@Test
	public void contextLoads() 
	{
		EmployeeDaoImpl edl = Config.getEmployeeDao();
		System.out.println(edl.displayById("M1049212").getUsername()+" "+log.getUsername());
		assertEquals(log.getUsername(),edl.displayById("M1049212").getUsername());
	
	}
}