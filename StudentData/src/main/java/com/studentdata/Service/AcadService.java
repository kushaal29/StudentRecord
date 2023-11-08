package com.studentdata.Service;


import com.studentdata.Repositories.AcadRepo;
import com.studentdata.entities.Acads;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcadService {

    @Autowired
    private AcadRepo acadRepo;
    public Acads addAcad(Acads saveData){
        return this.acadRepo.save(saveData);

    }

    public Acads searchbyId(int id){
        return this.acadRepo.findById(id).get();
    }
}
