package hrms.HumanResourceManagementSystemProject.business.abstracts;


import hrms.HumanResourceManagementSystemProject.entities.concretes.JobSeekers;

public interface JobSeekersCheckService {
    boolean checkFirstName(JobSeekers jobSeekers);
    boolean checkLastName(JobSeekers jobSeeker);

    boolean checkNationalityId(JobSeekers jobSeeker);

    boolean checkBirthYear(JobSeekers jobSeeker);

    boolean checkEmail(JobSeekers jobSeeker);

    boolean checkPassword(JobSeekers jobSeeker);

    boolean checkRepeatPassword(JobSeekers jobSeeker);

    boolean uniqueEmail(JobSeekers jobSeeker);

    boolean uniqueNationalityId(JobSeekers jobseeker);
}
