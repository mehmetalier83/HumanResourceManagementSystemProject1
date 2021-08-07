package hrms.HumanResourceManagementSystemProject.business.concretes;

import hrms.HumanResourceManagementSystemProject.business.abstracts.JobSeekersCheckService;

import hrms.HumanResourceManagementSystemProject.dataAccess.abstracts.JobSeekersDao;
import hrms.HumanResourceManagementSystemProject.entities.concretes.JobSeekers;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.regex.Pattern;

public class JobSeekersCheckManager implements JobSeekersCheckService {
     private JobSeekersDao jobSeekersDao;

    @Autowired
    public JobSeekersCheckManager(JobSeekersDao jobSeekersDao) {
        this.jobSeekersDao = jobSeekersDao;
    }


    @Override
    public boolean checkFirstName(JobSeekers jobSeekers) {
        if (jobSeekers.getFirstName().isEmpty()){
            System.out.println("İsim alanı boş bırakılamaz.");
            return false;
        }else {if (jobSeekers.getFirstName().length() < 4) {
            System.out.println("İsim alanı 4 karakterden büyük olmalıdır.");
            return false;
        }
        }
        return true;
    }

    @Override
    public boolean checkLastName(JobSeekers jobSeeker) {
        if (jobSeeker.getLastName().isEmpty()){
            System.out.println("Soyisim alanı dolmak zorunda");
            return false;
        }else if (jobSeeker.getLastName().length()<=4){
            System.out.println("Uzunluğu en az 4 olmalı");
        }
        return true;
    }

    @Override
    public boolean checkNationalityId(JobSeekers jobSeeker) {
        if (jobSeeker.getTcNo().isEmpty()) {
            System.out.println("Vatandaşlık kimlik numarası alanı boş bırakılamaz.");
            return false;
        } else {
            if (jobSeeker.getTcNo().length() < 11 || jobSeeker.getTcNo().length() > 11) {
                System.out.println("Vatandaşlık kimlik numarası 11 karakter olmalıdır.");
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean checkBirthYear(JobSeekers jobSeeker) {
        if (jobSeeker.getBirthYear() > 1930 && jobSeeker.getBirthYear() < 2021) {
            return true;
        } else {
            System.out.println("1930 - 2021 aralığında tarih giriniz.");
            return false;
        }
    }

    @Override
    public boolean checkEmail(JobSeekers jobSeeker) {
        String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        if (jobSeeker.getEmail().isEmpty()) {
            System.out.println("Email alanı boş bırakılamaz.");
            return false;
        } else {
            if (pattern.matcher(jobSeeker.getEmail()).find() == false) {
                System.out.println("Girilen email adresi formata uygun değil. Örnek: ornek@ornek.com");
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean checkPassword(JobSeekers jobSeeker) {
        if (jobSeeker.getPasswordCheck().isEmpty()) {
            System.out.println("Soyisim alanı boş bırakılamaz.");
            return false;
        } else {
            if (jobSeeker.getPasswordCheck().length() < 6) {
                System.out.println("Parola 6 karakterden daha küçük olamaz.");
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean checkRepeatPassword(JobSeekers jobSeeker) {
        if (jobSeeker.getPasswordCheck().isEmpty()) {
            return false;
        } else {
            if (jobSeeker.getPasswordCheck() == jobSeeker.getPasswordCheck()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean uniqueEmail(JobSeekers jobSeeker) {
        if (jobSeekersDao.findByEmail(jobSeeker.getEmail()) != null) {
            return false;
        }
        return true;
    }

    @Override
    public boolean uniqueNationalityId(JobSeekers jobseeker) {
        if (jobSeekersDao.findByEmail(jobseeker.getTcNo()) != null) {
            return false;
        }
        return true;
    }
}
