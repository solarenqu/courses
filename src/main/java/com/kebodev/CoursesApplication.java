package com.kebodev;

import com.kebodev.service.InitDbService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class CoursesApplication  implements CommandLineRunner {

    private final InitDbService initDbService;

    public static void main(String[] args) {
        SpringApplication.run(CoursesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        initDbService.deleteDb();
        initDbService.addInitData();
    }


}
