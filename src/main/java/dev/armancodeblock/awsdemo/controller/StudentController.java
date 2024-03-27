package dev.armancodeblock.awsdemo.controller;

import dev.armancodeblock.awsdemo.entity.Student;
import dev.armancodeblock.awsdemo.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/aws/students")
public class StudentController {
    private final StudentService service;
    @GetMapping
    public ResponseEntity<List<Student>> getStudents(){
        return new ResponseEntity<>(service.getStudents(), HttpStatus.OK);
    }

}
