package ma.mat.tp2_hospital.repositories;

import ma.mat.tp2_hospital.entities.Patient;
import ma.mat.tp2_hospital.entities.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RendezVousRepository extends JpaRepository<RendezVous,String> {
}
