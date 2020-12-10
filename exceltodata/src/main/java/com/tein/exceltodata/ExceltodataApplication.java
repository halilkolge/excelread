package com.tein.exceltodata;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExceltodataApplication implements ApplicationRunner {

    private final ExcelConverter excelConverter;

    public ExceltodataApplication(ExcelConverter excelConverter) {
        this.excelConverter = excelConverter;
    }


    public static void main(String[] args) {
        SpringApplication.run(ExceltodataApplication.class, args);
    }


    @Override
    public void run(ApplicationArguments args) throws Exception {
        excelConverter.ExcelConvert();
    }
}
