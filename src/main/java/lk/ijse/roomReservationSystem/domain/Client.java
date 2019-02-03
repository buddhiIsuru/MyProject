package lk.ijse.roomReservationSystem.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CLIENT")
class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CLIENT_ID", length = 10)
    private Integer id;

    @Column(name = "FIRST_NAME", length = 10)
    private String firstName;

    @Column(name = "LAST_NAME", length = 10)
    private String lastName;

    @Column(name = "E_MAIL", length = 20)
    private String email;

    @Column(name = "ADDRESS", length = 100)
    private String address;

    @Column(name = "MOBILE_NUMBER", length = 12)
    private Integer telNo;

    @OneToMany(mappedBy = "client",cascade={CascadeType.ALL},fetch=FetchType.LAZY)
    private List<Recervation> clientList = new ArrayList<>();
		
    public Client(){}

    public Client(String fristName,String lastName,String email,String address,Integer telNo) {
        this.firstName=fristName;
        this.lastName=lastName;
        this.email=email;
        this.address=address;
        this.telNo = telNo;
    }

    public Client(Integer id,String fristName,String lastName,String email,String address,Integer telNo) {
        this.id=id;
        this.firstName=fristName;
        this.lastName=lastName;
        this.email=email;
        this.address=address;
        this.telNo=telNo;
    }

	public void setId(Integer id) {
        this.id = id;
    }
    public Integer getId() {
        return this.id;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return this.email;
    }
    public void setTelNo(Integer telNo) {
        this.telNo = telNo;
    }
    public Integer getTelNo() {
        return this.telNo;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return this.address;
    }

    public String toString() {
        return "{" + "id=" + getId() + ",firstName='" + getFirstName() + "'" + ",lastName='" + getLastName() + "'"
                + ",email='" + getEmail() + "'" + ",address='" + getAddress() + "'" + ",telNo=" + getTelNo() + "}";
    }

}