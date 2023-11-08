package com.studentdata.Controller;


import com.studentdata.Service.StudentService;
import com.studentdata.entities.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin("*")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public StudentEntity addStudent(@RequestBody StudentEntity saveDetails)
    {
        return this.studentService.addStudent(saveDetails);
    }

    @GetMapping("/getbyId/{id}")
    public StudentEntity getbyId(@PathVariable Integer id)
    {
        return this.studentService.studentById(id);
    }

    @GetMapping("/showAllData")
    public List<StudentEntity> studentEntityList(){
        return this.studentService.allstudentRecord();
    }


    @PutMapping("/update/{id}")
    public StudentEntity updateSchoolRecord(@PathVariable Integer id,@RequestBody StudentEntity schoolRecord){
        return this.studentService.updateRecord(id, schoolRecord);
    }

    @DeleteMapping("/delete/{id}")
    public int deleteStudent(@PathVariable int id)
    {
       return this.studentService.deleteStudent(id);

    }
}
