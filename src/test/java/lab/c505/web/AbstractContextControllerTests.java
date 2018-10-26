package lab.c505.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.context.WebApplicationContext;

/**
 * Package: lab.c505.web
 * Description： TODO
 * Author: TingTing W
 * Date: Created in 2018/10/25 10:19
 */
@WebAppConfiguration
@ContextConfiguration({ "classpath:spring/spring-web.xml", "classpath:spring/spring-service.xml",
        "classpath:spring/spring-dao.xml" })
public class AbstractContextControllerTests {
    @Autowired
    protected WebApplicationContext wac;
}
