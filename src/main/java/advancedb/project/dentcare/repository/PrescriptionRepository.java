package advancedb.project.dentcare.repository;

import advancedb.project.dentcare.domain.Prescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrescriptionRepository extends JpaRepository<Prescription, Integer> {

    List<Prescription> findByPatient_Id(Integer patientId);
}
