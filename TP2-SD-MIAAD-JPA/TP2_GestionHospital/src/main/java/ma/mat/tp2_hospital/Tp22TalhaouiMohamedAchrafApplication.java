package ma.mat.tp2_hospital;

import ma.mat.tp2_hospital.entities.*;
import ma.mat.tp2_hospital.repositories.ConsultationRepository;
import ma.mat.tp2_hospital.repositories.MedcinRepository;
import ma.mat.tp2_hospital.repositories.PatientRepository;
import ma.mat.tp2_hospital.repositories.RendezVousRepository;
import ma.mat.tp2_hospital.service.IHospitalService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
public class Tp22TalhaouiMohamedAchrafApplication {

    public static void main(String[] args) {
        SpringApplication.run(Tp22TalhaouiMohamedAchrafApplication.class, args);
    }
    @Bean //method execute en demarage
    CommandLineRunner start(IHospitalService hospitalService,
        /* plus  besooin d'injecter tout c'est intrfaces Repository
        ,je vais utiliser directement la couche Service

            PatientRepository patientRepository,
            MedcinRepository medcinRepository,
            RendezVousRepository rendezVousRepository,
            ConsultationRepository consultationRepository
            */              PatientRepository patientRepository,
                            RendezVousRepository rendezVousRepository,
                            MedcinRepository medcinRepository,
                            ConsultationRepository consultationRepository
    //j'ai l'utiliser pour la methode FindBy , car j'ai pas une methode qui fait ca,sur ma couche 'metier'(HospitalServiceImpl)
    ){
        return args -> {
            //patientRepository.save(new Patient(null,"Ali",new Date(),false,null));
            Stream.of("Adnan","Anwar","Amine")
                    .forEach(name->{
                        Patient patient = new Patient();
                        patient.setNom(name);
                        patient.setDateNaissance(new Date());
                        patient.setMalade(false);
                        //patientRepository.save(patient);
                        hospitalService.savePatient(patient);
                    });

            Stream.of("Rayane","Saad","Yassir")
                    .forEach(name->{
                        Medcin medcin = new Medcin();
                        medcin.setNom(name);
                        medcin.setEmail(name+"@gmail.com");
                        medcin.setSpecialite(Math.random()>0.5?"Cardio":"Dentiste");
                        //medcinRepository.save(medcin);
                        hospitalService.saveMedcin(medcin);
                    });
            Patient patient = patientRepository.findById(1L).orElse(null);
            Patient patient2 = patientRepository.findByNom("Amine");

            Medcin medcin = medcinRepository.findByNom("Rayane");

            RendezVous rendezVous = new RendezVous();
            rendezVous.setDate(new Date());
            rendezVous.setStatus(StatusRDV.PENDING);
            rendezVous.setMedcin(medcin);
            rendezVous.setPatient(patient);
            //rendezVousRepository.save(rendezVous);
            //hospitalService.saveRDV(rendezVous)

            //recuperer le ID Saved
            RendezVous saveRDV = hospitalService.saveRDV(rendezVous);
            System.out.println("l'id de RDV :"+saveRDV.getId());


            /* si le type de Id est Long :
            Patient patient = patientRepository.findById(1L).orElse(null);
            */
            RendezVous rendezVous1 = rendezVousRepository.findAll().get(0);
            Consultation consultation = new Consultation();
            consultation.setDateConsultation(new Date());
            consultation.setRendezVous(rendezVous1);
            consultation.setRapport("Rapport de consultation ....");
            //consultationRepository.save(consultation);
            hospitalService.saveConsultation(consultation);

        };

    }
}
