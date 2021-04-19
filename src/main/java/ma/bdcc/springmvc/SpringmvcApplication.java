package ma.bdcc.springmvc;

import ma.bdcc.springmvc.dao.PatientRepository;
import ma.bdcc.springmvc.entities.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class SpringmvcApplication implements CommandLineRunner {
    @Autowired
    private PatientRepository patientRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringmvcApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        patientRepository.save(new Patient(null, "oumaima", new Date(), false, 3));
        patientRepository.save(new Patient(null, "hassan", new Date(), true, 6));
        patientRepository.save(new Patient(null, "zakia", new Date(), false, 5));
        patientRepository.save(new Patient(null, "mohammed", new Date(), true, 12));
        patientRepository.save(new Patient(null, "oumaima", new Date(), false, 3));
        patientRepository.save(new Patient(null, "hassan", new Date(), true, 6));
        patientRepository.save(new Patient(null, "zakia", new Date(), false, 5));
        patientRepository.save(new Patient(null, "mohammed", new Date(), true, 12));
        patientRepository.save(new Patient(null, "oumaima", new Date(), false, 3));
        patientRepository.save(new Patient(null, "hassan", new Date(), true, 6));
        patientRepository.save(new Patient(null, "zakia", new Date(), false, 5));
        patientRepository.save(new Patient(null, "mohammed", new Date(), true, 12));
        patientRepository.save(new Patient(null, "oumaima", new Date(), false, 3));
        patientRepository.save(new Patient(null, "hassan", new Date(), true, 6));
        patientRepository.save(new Patient(null, "zakia", new Date(), false, 5));
        patientRepository.save(new Patient(null, "mohammed", new Date(), true, 12));
        patientRepository.save(new Patient(null, "oumaima", new Date(), false, 3));
        patientRepository.save(new Patient(null, "hassan", new Date(), true, 6));
        patientRepository.save(new Patient(null, "zakia", new Date(), false, 5));
        patientRepository.save(new Patient(null, "mohammed", new Date(), true, 12));
        patientRepository.save(new Patient(null, "oumaima", new Date(), false, 3));
        patientRepository.save(new Patient(null, "hassan", new Date(), true, 6));
        patientRepository.save(new Patient(null, "zakia", new Date(), false, 5));
        patientRepository.save(new Patient(null, "mohammed", new Date(), true, 12));
        patientRepository.save(new Patient(null, "oumaima", new Date(), false, 3));
        patientRepository.save(new Patient(null, "hassan", new Date(), true, 6));
        patientRepository.save(new Patient(null, "zakia", new Date(), false, 5));
        patientRepository.save(new Patient(null, "mohammed", new Date(), true, 12));
        patientRepository.save(new Patient(null, "oumaima", new Date(), false, 3));
        patientRepository.save(new Patient(null, "hassan", new Date(), true, 6));
        patientRepository.save(new Patient(null, "zakia", new Date(), false, 5));
        patientRepository.save(new Patient(null, "mohammed", new Date(), true, 12));
        patientRepository.save(new Patient(null, "oumaima", new Date(), false, 3));
        patientRepository.save(new Patient(null, "hassan", new Date(), true, 6));
        patientRepository.save(new Patient(null, "zakia", new Date(), false, 5));
        patientRepository.save(new Patient(null, "mohammed", new Date(), true, 12));


    }
}
