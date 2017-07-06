package com.TaurusSolution.Controllers;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import sun.applet.Main;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Jose R Henriquez on 7/5/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest()
@ContextConfiguration
@SpringBootConfiguration
public class MainControllerTest {



    private TestRestTemplate restTemplate = new TestRestTemplate();

    @Test
    public void holaTest()
    {
        MainController mainController = new MainController();
        String prueba = mainController.Hola();

       assertThat(prueba).isEqualTo("Hola Mundo");
    }
}
