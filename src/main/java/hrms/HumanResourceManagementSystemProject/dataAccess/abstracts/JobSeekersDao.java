package hrms.HumanResourceManagementSystemProject.dataAccess.abstracts;

import hrms.HumanResourceManagementSystemProject.entities.concretes.JobSeekers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobSeekersDao extends JpaRepository<JobSeekers,Integer> {
    JobSeekers findByEmail(String email);
    JobSeekers findByNationalityId (String nationalityId);
}
