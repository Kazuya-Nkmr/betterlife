package mrs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//mapper
//https://qiita.com/kazuki43zoo/items/ea79e206d7c2e990e478
@MapperScan("mrs.domain.mapper")
public class MrsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MrsApplication.class, args);
    }
}