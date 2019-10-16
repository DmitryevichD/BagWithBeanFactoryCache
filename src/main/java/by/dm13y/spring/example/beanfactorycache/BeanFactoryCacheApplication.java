package by.dm13y.spring.example.beanfactorycache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class BeanFactoryCacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeanFactoryCacheApplication.class, args);
    }

}
