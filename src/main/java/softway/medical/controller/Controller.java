package softway.medical.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import softway.medical.model.ResultPatient;
import softway.medical.service.CalculService;

@RestController
public class Controller {

    @Autowired
    CalculService service;

    @GetMapping("/display/{indexSante}")
    public ResultPatient displayServicePathologie(@PathVariable int indexSante){

        return service.calculateHealthIndex(indexSante);
    }
}
