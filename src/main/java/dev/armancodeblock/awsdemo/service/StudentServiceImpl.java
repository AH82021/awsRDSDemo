package dev.armancodeblock.awsdemo.service;

import dev.armancodeblock.awsdemo.entity.Student;
import dev.armancodeblock.awsdemo.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService{

    private final StudentRepository repository;
    @Override
    public List<Student> getStudents() {
        return repository.findAll();
    }
}
