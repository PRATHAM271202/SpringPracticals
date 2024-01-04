package springmvc.model;

import org.hibernate.annotations.GeneratorType;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name="details")
public class User {

    private String email;
    private String userFirstName;

    private String userLastName;
    private String userPassword;

    private String bd;

    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private LocalDate birthDate;
    @Id
    private String prnNo;

    public void updatePrnNo(String fb,String dob,String ln){
         this.prnNo = fb+dob+ln;
    }

    public String getBd() {
        return bd;
    }

    public void setBd(String bd) {
        this.bd = bd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }


    public LocalDate getBirthDate() {
        return LocalDate.parse(bd);
    }

    public void updateLocalDate(String bd){
        birthDate = LocalDate.parse(bd);
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getPrnNo() {
        return prnNo;
    }

    public void setPrnNo(String prnNo) {
        this.prnNo = prnNo;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", userFirstName='" + userFirstName + '\'' +
                ", userLastName='" + userLastName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", birthDate=" +birthDate +
                ", prnNo='" + prnNo + '\'' +
                '}';
    }
}
