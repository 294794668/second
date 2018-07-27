package com.example.second;

import com.example.second.service.SelfAutowiredService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SecondApplicationTests {

	@Autowired
	private SelfAutowiredService selfAutowiredService;

	@Test
	public void contextLoads() {
	}

}
