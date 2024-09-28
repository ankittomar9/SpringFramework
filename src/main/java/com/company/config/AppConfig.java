package com.company.config;

import com.company.Alien;
import com.company.Computer;
import com.company.Desktop;
import com.company.Laptop;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.company")
public class AppConfig {
/*
    @Bean
    public Alien alien( Computer com){    ///@Qualifier("laptop")
        Alien obj = new Alien();
        obj.setAge(30);
        obj.setCom(com);
        return obj;
    }

  //  @Bean(name={"com2","desktop1","Beast"})
    @Bean
  //  @Scope("prototype")
    public Desktop desktop(){
        return new Desktop();
    }

        @Bean
        @Primary
            public Laptop laptop(){
                return new Laptop();
        }*/

}
