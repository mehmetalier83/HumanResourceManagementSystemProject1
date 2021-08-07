package hrms.HumanResourceManagementSystemProject.dataAccess.abstracts;

import hrms.HumanResourceManagementSystemProject.dataAccess.concretes.JobPosition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobPositionDao extends JpaRepository<JobPosition, Integer> {
}
