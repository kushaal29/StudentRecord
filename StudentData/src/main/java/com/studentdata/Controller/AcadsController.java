package com.studentdata.Controller;


import com.studentdata.Service.AcadService;
import com.studentdata.entities.Acads;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/acads")
@CrossOrigin("*")
public class AcadsController {

    @Autowired
    private AcadService acadService;

    @PostMapping("/add")
    public Acads addSub(@RequestBody Acads acads)
    {
        return this.acadService.addAcad(acads);
    }

    @GetMapping("/getbyId/{id}")
    public Acads getbyId(@PathVariable Integer id)
    {
        return this.acadService.searchbyId(id);
    }
}
