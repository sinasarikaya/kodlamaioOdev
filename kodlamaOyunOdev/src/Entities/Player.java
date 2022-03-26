package Entities;

import java.time.LocalDate;

public class Player {
    private String Email;
    private String Name;
    private String LastName;
    private LocalDate DateOfBirth;
    private String NationalityId;

    public Player(String email, String name, String lastName, LocalDate dateOfBirth, String nationalityId) {
        Email = email;
        Name = name;
        LastName = lastName;
        DateOfBirth = dateOfBirth;
        NationalityId = nationalityId;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public String getNationalityId() {
        return NationalityId;
    }

    public void setNationalityId(String nationalityId) {
        NationalityId = nationalityId;
    }
}
