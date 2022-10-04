package case_study.model.human;

import java.time.LocalDate;

public abstract class CaseStudyPerson {
    private String fullName;
    private LocalDate dateOfBirth;
    private String gender;
    private String IDNumber;
    private String phoneNumber;
    private String email;

    public CaseStudyPerson(String fullName, LocalDate dateOfBirth, String gender, String IDNumber, String phoneNumber, String email) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.IDNumber = IDNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public CaseStudyPerson() {

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIDNumber() {
        return IDNumber;
    }

    public void setIDNumber(String IDNumber) {
        this.IDNumber = IDNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "CaseStudyPerson{" +
                "fullName='" + fullName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender='" + gender + '\'' +
                ", IDNumber=" + IDNumber +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }
}
