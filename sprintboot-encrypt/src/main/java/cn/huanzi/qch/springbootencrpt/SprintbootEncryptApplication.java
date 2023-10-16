package cn.huanzi.qch.springbootencrpt;

import cn.shuibo.annotation.EnableSecurity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableSecurity
public class SprintbootEncryptApplication {

    public static void main(String[] args) {
        SpringApplication.run(SprintbootEncryptApplication.class, args);
    }

}
