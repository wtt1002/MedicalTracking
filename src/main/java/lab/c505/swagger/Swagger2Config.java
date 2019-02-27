package lab.c505.swagger;

import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.async.DeferredResult;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
/**
 * Package: lab.c505.swagger
 * Description： swagger配置
 * Author: TingTing W
 * Date: Created in 2019/2/27 19:21
 */
@Configuration  //让Spring来加载该类配置
@EnableWebMvc   //非SpringBoot需启用
@EnableSwagger2 //启用Swagger2
public class Swagger2Config extends WebMvcConfigurerAdapter {
    //该包下全部接口
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("全部接口api")
                .genericModelSubstitutes(DeferredResult.class)
                .forCodeGeneration(false)
                .select()// 选择哪些路径和API会生成document
                .apis(RequestHandlerSelectors.any())// 对所有api进行监控
                .paths(PathSelectors.any())// 对所有路径进行监控
                .build()
                .apiInfo(apiInfo("XX网全部接口API", "齐大圣", "分享版！"));
    }
    //可以再细分接口便于查看与使用
    @Bean
    public Docket em_api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.ant("/你的包名/**"))
                .build()
                .groupName("**端接口文档")
                .pathMapping("/")
                .apiInfo(apiInfo("XX网全部接口API", "齐大圣", "分享版！"));
    }

    private ApiInfo apiInfo(String name,String description,String version) {
        ApiInfo apiInfo = new ApiInfoBuilder().title(name).description(description).version(version).build();
        return apiInfo;
    }

    //静态资源文件映射，为避开springMvc的DispatcherServlet处理 （也可以写到spring-mvc配置文件里）
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
    }

}
