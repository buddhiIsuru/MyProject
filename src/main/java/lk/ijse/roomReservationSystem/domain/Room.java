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
@Table(name="ROOM")
class Room{

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="ROOM_ID" , length=5)
    private Integer roomId;

    @Column(name="ROMM_DESCRIPTION" , length=100)
    private String description;

    @Column(name="ROOM_PRICE" , length=10)
    private Double roomPrice;

    @Column(name="ROOM_STATUS" , length=1)
    private Integer status;

    @OneToMany(mappedBy="room",cascade={CascadeType.ALL},fetch=FetchType.LAZY)
    private List<Recervation> roomList=new ArrayList<>();

    public Room(){}

    public Room(String descrption,Double roomPrice,Integer status) {
        this.description=descrption;
        this.roomPrice = roomPrice;
        this.status = status;
    }

    public Room(Integer roomId, String descrption, Double roomPrice, Integer status) {
        this.roomId=roomId;
        this.description = descrption;
        this.roomPrice = roomPrice;
        this.status = status;
    }
	
    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }
    public Integer getRoomId() {
        return this.roomId;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return this.description;
    }
    public void setRoomPrice(Double roomPrice) {
        this.roomPrice = roomPrice;
    }
    public Double getRoomPrice() {
        return this.roomPrice;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
    public Integer getStatus() {
        return this.status;
    }

    public String toString() {
        return "{" + "roomId=" + getRoomId() + ",description='" + getDescription() + "'" + ",roomPrice="
                + getRoomPrice() + ",status=" + getStatus() + "}";
    }

}