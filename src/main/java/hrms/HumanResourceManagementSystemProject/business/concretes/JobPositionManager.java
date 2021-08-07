package hrms.HumanResourceManagementSystemProject.business.concretes;

import hrms.HumanResourceManagementSystemProject.business.abstracts.JobPositionService;
import hrms.HumanResourceManagementSystemProject.dataAccess.abstracts.JobPositionDao;
import hrms.HumanResourceManagementSystemProject.dataAccess.concretes.JobPosition;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class JobPositionManager implements JobPositionService {
    JobPositionDao jobPositionDao;

    @Autowired
    public JobPositionDao getJobPositionDao(JobPositionDao jobPositionDao) {
        return this.jobPositionDao=jobPositionDao;
    }

    @Override
    public List<JobPosition> getAll() {
        return this.jobPositionDao.findAll();
    }
}
