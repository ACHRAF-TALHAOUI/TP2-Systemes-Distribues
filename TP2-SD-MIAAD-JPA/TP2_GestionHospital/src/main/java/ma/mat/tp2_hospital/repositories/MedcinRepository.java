package ma.mat.tp2_hospital.repositories;

import ma.mat.tp2_hospital.entities.Medcin;
import ma.mat.tp2_hospital.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedcinRepository extends JpaRepository<Medcin,Long> {
    Medcin findByNom(String nom);
}
