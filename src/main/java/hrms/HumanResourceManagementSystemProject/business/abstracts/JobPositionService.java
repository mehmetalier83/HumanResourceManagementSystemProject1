package hrms.HumanResourceManagementSystemProject.business.abstracts;

import hrms.HumanResourceManagementSystemProject.dataAccess.concretes.JobPosition;

import java.util.List;

public interface JobPositionService {
    List<JobPosition> getAll();
}
