package com.studentdata.Service;


import com.studentdata.Repositories.StudentRepo;
import com.studentdata.entities.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;

    public StudentEntity addingStudent(StudentEntity  saveData){
        StudentEntity sd= new StudentEntity();
        sd.setFirstname(saveData.getFirstname());
        sd.setLastname(saveData.getLastname());
        sd.setRollId(saveData.getRollId());
        return this.studentRepo.save(sd);
    }

    public StudentEntity addStudent(StudentEntity savedStudent){
        ;
        return this.studentRepo.save(savedStudent);

    }
    public StudentEntity studentById (int id){
        return this.studentRepo.findById(id).get();
    }
    public List<StudentEntity> allstudentRecord(){
        return this.studentRepo.findAll();
    }

    public StudentEntity updateRecord(int id, StudentEntity recordUpdate){
        StudentEntity reco = this.studentRepo.findById(id).get();
        StudentEntity newReco= new StudentEntity();
        if(reco.getFirstname()!=null){
            newReco.setId(id);
            newReco.setFirstname(recordUpdate.getFirstname());
            newReco.setLastname(recordUpdate.getLastname());
            newReco.setRollId(recordUpdate.getRollId());
            this.studentRepo.save(newReco);
        }
        else {
            System.out.println("Student with Student Id: "+ id + " not found");
        }
        return newReco;
    }

    public int deleteStudent(int id){
        this.studentRepo.deleteById(id);
        return id;
    }


}
