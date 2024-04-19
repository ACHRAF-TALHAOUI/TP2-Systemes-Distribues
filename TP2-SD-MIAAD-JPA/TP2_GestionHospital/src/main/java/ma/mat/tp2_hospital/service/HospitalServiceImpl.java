package ma.mat.tp2_hospital.service;

import jakarta.transaction.Transactional;
import ma.mat.tp2_hospital.entities.Consultation;
import ma.mat.tp2_hospital.entities.Medcin;
import ma.mat.tp2_hospital.entities.Patient;
import ma.mat.tp2_hospital.entities.RendezVous;
import ma.mat.tp2_hospital.repositories.ConsultationRepository;
import ma.mat.tp2_hospital.repositories.MedcinRepository;
import ma.mat.tp2_hospital.repositories.PatientRepository;
import ma.mat.tp2_hospital.repositories.RendezVousRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

//Couceh Metier
@Service
@Transactional
public class HospitalServiceImpl implements IHospitalService {
    // pour faire l'injection des dependances soit avec pour chacun @Autowired
    //ou bien avec les Constructeurs
    private PatientRepository patientRepository;
    private MedcinRepository medcinRepository;
    private RendezVousRepository rendezVousRepository;
    private ConsultationRepository consultationRepository;

    public HospitalServiceImpl(PatientRepository patientRepository, MedcinRepository medcinRepository,RendezVousRepository rendezVousRepository,ConsultationRepository consultationRepository) {
        this.patientRepository = patientRepository;
        this.medcinRepository = medcinRepository;
        this.rendezVousRepository = rendezVousRepository;
        this.consultationRepository = consultationRepository;
    }


    @Override
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Medcin saveMedcin(Medcin medcin) {
        return medcinRepository.save(medcin);
    }

    @Override
    public RendezVous saveRDV(RendezVous rendezVous) {
        //cas de id de type String
        rendezVous.setId(UUID.randomUUID().toString());

        return rendezVousRepository.save(rendezVous);
    }

    @Override
    public Consultation saveConsultation(Consultation consultation) {
        return consultationRepository.save(consultation);
    }
}
