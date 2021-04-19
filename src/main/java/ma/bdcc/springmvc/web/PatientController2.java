package ma.bdcc.springmvc.web;

import ma.bdcc.springmvc.dao.PatientRepository;
import ma.bdcc.springmvc.entities.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class PatientController2 {
    @Autowired
    PatientRepository patientRepository;

    @GetMapping(path = "/getPatients")
    public List<Patient> GetPatientList() {
        return patientRepository.findAll();
    }

    @GetMapping(path = "/getPatients/{id}")
    public Patient GetPatientListById(@PathVariable("id") Long id) {
        return patientRepository.findById(id).get();
    }
}
