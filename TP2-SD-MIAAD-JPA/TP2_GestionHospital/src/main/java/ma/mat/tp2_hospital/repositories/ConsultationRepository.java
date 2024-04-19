package ma.mat.tp2_hospital.repositories;

import ma.mat.tp2_hospital.entities.Consultation;
import ma.mat.tp2_hospital.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository extends JpaRepository<Consultation,Long> {
}
