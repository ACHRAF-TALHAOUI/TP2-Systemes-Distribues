package ma.mat.tp2_hospital.service;

import ma.mat.tp2_hospital.entities.Consultation;
import ma.mat.tp2_hospital.entities.Medcin;
import ma.mat.tp2_hospital.entities.Patient;
import ma.mat.tp2_hospital.entities.RendezVous;

public interface IHospitalService {
    //ajouter patient
    Patient savePatient(Patient patient);
    Medcin saveMedcin(Medcin medcin);
    RendezVous saveRDV(RendezVous rendezVous);
    Consultation saveConsultation(Consultation consultation);

}
