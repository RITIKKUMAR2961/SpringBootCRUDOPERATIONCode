package com.RITIKKUMAR.Server_Side.CRUD.Operations.with.Spring.Boot.Controller;

import com.RITIKKUMAR.Server_Side.CRUD.Operations.with.Spring.Boot.Entity.StudentEntry;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final Map<Long, StudentEntry> studentEntryMap = new HashMap<>();

    // Welcome message
    @GetMapping
    public String welcomeMessage() {
        return "Welcome to my project: Server-Side CRUD Operations with Spring Boot!";
    }

    // ----------------------------- Create -----------------------------

    @PostMapping("/add")
    public boolean addStudent(@RequestBody StudentEntry student) {
        studentEntryMap.put(student.getId(), student);
        return true;
    }

    // ----------------------------- Read -----------------------------

    @GetMapping("/all")
    public List<StudentEntry> getAllStudents() {
        return new ArrayList<>(studentEntryMap.values());
    }

    @GetMapping("/{id}")
    public StudentEntry getStudentById(@PathVariable Long id) {
        return studentEntryMap.get(id);
    }

    // ----------------------------- Update -----------------------------

    @PutMapping("/update/{id}")
    public boolean updateStudent(@PathVariable Long id, @RequestBody StudentEntry student) {
        studentEntryMap.put(id, student);
        return true;
    }

    // ----------------------------- Delete -----------------------------

    @DeleteMapping("/delete/{id}")
    public boolean deleteStudent(@PathVariable Long id) {
        studentEntryMap.remove(id);
        return true;
    }
}
