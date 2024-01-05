package springmvc.model;

import org.hibernate.annotations.GeneratorType;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name="LoginUser")
public class User {

    @Column(name = "Email")
    private String email;
    @Column(name = "First_Name")
    private String userFirstName;
    @Column(name = "Last_Name")
    private String userLastName;
    @Column(name = "Password")
    private String userPassword;

    @Transient
    private String bd;
    @Column(name = "Status")
    private boolean status;

    @Column(name = "DOB")
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private LocalDate birthDate;

    @Column(name = "PrnNo")
    @Id
    private String prnNo;

    public void updatePrnNo(String fb,String dob,String ln){
         this.prnNo = fb+dob+ln;
    }

    public boolean isStatus() {
        return status;
    }

    public void updateStatus(boolean val){
        this.status=val;
    }

    public void setStatus(boolean status) {
        this.status = status;
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
        return birthDate;
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
                ", bd='" + bd + '\'' +
                ", status=" + status +
                ", birthDate=" + birthDate +
                ", prnNo='" + prnNo + '\'' +
                '}';
    }
}
