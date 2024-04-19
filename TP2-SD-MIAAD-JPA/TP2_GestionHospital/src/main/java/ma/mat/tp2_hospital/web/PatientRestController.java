package ma.mat.tp2_hospital.web;

import ma.mat.tp2_hospital.entities.Patient;
import ma.mat.tp2_hospital.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PatientRestController {
    @Autowired //injection
    private PatientRepository patientRepository;

    @GetMapping("/patients")
    public List<Patient> PatientsList() {
        return patientRepository.findAll();
    }

}
