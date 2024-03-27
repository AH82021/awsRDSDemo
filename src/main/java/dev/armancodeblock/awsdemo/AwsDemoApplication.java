package dev.armancodeblock.awsdemo;

import dev.armancodeblock.awsdemo.entity.Student;
import dev.armancodeblock.awsdemo.repository.StudentRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log4j2
public class AwsDemoApplication implements CommandLineRunner {
    @Autowired
    private StudentRepository repository;



    public static void main(String[] args) {
        SpringApplication.run(AwsDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Student student = new Student("Jack","Adam","jackadm@aws.demo");
        Student student2 = new Student("John ","Doe","johndoe@aws.demo");

        repository.save(student);
        repository.save(student2);

        repository.findAll().forEach(s-> log.info(student.getName() + " " + s.getLastName()));



    }
}
