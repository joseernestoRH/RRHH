package com.TaurusSolution.RRHH;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@EnableAutoConfiguration
@ContextConfiguration
@SpringBootTest()
@ComponentScan(basePackages ="com.TaurusSolution")
public class RrhhApplicationTests {

	@Test
	public void contextLoads() {
	}

}
