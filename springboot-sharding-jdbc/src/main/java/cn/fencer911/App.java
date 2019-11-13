package cn.fencer911;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @EnableTransactionManagement
// @EnableConfigurationProperties
// @MapperScan("com.dao") //(scanBasePackages = {"app"})
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
}
