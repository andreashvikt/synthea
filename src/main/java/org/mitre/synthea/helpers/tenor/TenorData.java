package org.mitre.synthea.helpers.tenor;

public class TenorData {
    public String birthDate;
    public String idnummer;
    public String firstName;
    public String lastName;
    public String gender;

    @Override
    public String toString() {
        return "TenorData{" +
                "idnummer='" + idnummer + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", birthdate='" + birthDate + '\'' +
                '}';
    }
}
