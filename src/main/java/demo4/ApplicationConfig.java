package demo4;

import demo4.Impl.HelloworldImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by win8 on 2017/2/27.
 */
@Configuration
public class ApplicationConfig {
    @Bean(name = "helloBean")
    public Helloworld helloworld(){
        return new HelloworldImpl();
    }
}
