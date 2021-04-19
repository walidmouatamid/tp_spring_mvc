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

@Controller
public class PatientController {
    @Autowired
    PatientRepository patientRepository;

    @GetMapping(path = "/")
    public String index(Model model) {
        return "redirect:/patients";
    }

    @GetMapping(path = "/patients")
    public String getPatients(Model model, @RequestParam(name = "page", defaultValue = "0") int page,
                              @RequestParam(name = "size", defaultValue = "5") int size,
                              @RequestParam(name = "keyword", defaultValue = "") String keyword
    ) {

        Page<Patient> patientsPage = patientRepository.findByNameContains(keyword, PageRequest.of(page, size));
        model.addAttribute("patientsBypage", patientsPage.getContent());
        model.addAttribute("pages", new int[patientsPage.getTotalPages()]);
        model.addAttribute("currentPage", page);
        model.addAttribute("size", size);
        model.addAttribute("keyword", keyword);
        return "patients";
    }

    @GetMapping(path = "/delete")
    public String delete(Long id, int page, int size, String keyword) {
        patientRepository.deleteById(id);
        return "redirect:/patients?page=" + page + "&size=" + size + "&keyword=" + keyword;
    }

    @GetMapping(path = "/formPatient")
    public String formPatient(Model model) {
        Patient patient = new Patient();
        model.addAttribute("patient", patient);
        model.addAttribute("mode", "create");
        return "formPatient";
    }

    @PostMapping(path = "/addPatient")
    public String addPatient(@Valid Patient patient, BindingResult bindingResult, Model model,String
                             mode) {

        if (bindingResult.hasErrors()) {
            model.addAttribute("mode",mode);
            return "formPatient";
        }

        patientRepository.save(patient);
        return "redirect:/patients";
    }

    @GetMapping(path = "/editPatient")
    public String editPatient(@RequestParam(name = "id") Long id, Model model) {
        Patient patient = patientRepository.findById(id).get();
        model.addAttribute("patient", patient);
        model.addAttribute("mode", "edit");
        return "formPatient";
    }

}
