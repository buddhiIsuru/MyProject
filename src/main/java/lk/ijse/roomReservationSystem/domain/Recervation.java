package lk.ijse.roomReservationSystem.domain;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="RESERVATION")
class Recervation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "RESERVATION_ID", length = 10)
    private Integer reservationId;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "CLIENT_ID",referencedColumnName="CLIENT_ID")
    private Client client;

    @ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    @JoinColumn(name = "ROOM_ID", referencedColumnName="ROOM_ID")
    private Room room;

    @OneToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    @JoinColumn(name="PAYMENT_ID",referencedColumnName="PAYMENT_ID")
    private Payment payment;

    @Column(name="NO_OF_ADULT", length = 5)
    private Integer noAdult;

    @Column(name="NO_OF_CHILDREN", length = 5)
    private Integer noChildren;

    @Column(name="NO_OF_ROOM", length = 5)
    private Integer noRoom;

    @Column(name="IN_DATE")
    private Date inDate;

    @Column(name="OUT_DATE")
    private Date outDate;

    public Recervation(){}

        public Recervation(Client client, Room room, Payment payment, Integer noAdult, Integer noChildren,Integer noRoom,
            Date inDate,Date outDate){
        this.client=client;
        this.room=room;
        this.payment=payment;
        this.noAdult=noAdult;
        this.noChildren=noChildren;
        this.noRoom=noRoom;
        this.inDate=inDate;
        this.outDate=outDate;
    }

    public Recervation(Integer reservationId,Client client, Room room, Payment payment, Integer noAdult, Integer noChildren,
            Integer noRoom, Date inDate, Date outDate) {
        this.reservationId=reservationId;
        this.client = client;
        this.room = room;
        this.payment = payment;
        this.noAdult = noAdult;
        this.noChildren = noChildren;
        this.noRoom = noRoom;
        this.inDate = inDate;
        this.outDate = outDate;
    }

    public void setReservationId(Integer reservationId) {
        this.reservationId = reservationId;
    }
    public Integer getReservationId() {
        return this.reservationId;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    public Client getClient() {
        return this.client;
    }
    public void setRoom(Room room) {
        this.room = room;
    }
    public Room getRoom() {
        return this.room;
    }
    public void setPayment(Payment payment) {
        this.payment = payment;
    }
    public Payment getPayment() {
        return this.payment;
    }
    public void setNoAdult(Integer noAdult) {
        this.noAdult = noAdult;
    }
    public Integer getNoAdult() {
        return this.noAdult;
    }
    public void setNoChildren(Integer noChildren) {
        this.noChildren = noChildren;
    }
    public Integer getNoChildren() {
        return this.noChildren;
    }
    public void setNoRoom(Integer noRoom) {
        this.noRoom = noRoom;
    }
    public Integer getNoRoom() {
        return this.noRoom;
    }
    public void setInDate(Date inDate) {
        this.inDate = inDate;
    }
    public Date getInDate() {
        return this.inDate;
    }
    public void setOutDate(Date outDate) {
        this.outDate = outDate;
    }
    public Date getOutDate() {
        return this.outDate;
    }
	
    public String toString() {
        return "{" +
            "reservationId=" + getReservationId() +
            ",client=" + getClient() +
            ",room=" + getRoom() +
            ",payment=" + getPayment() +
            ",noAdult=" + getNoAdult() +
            ",noChildren=" + getNoChildren() +
            ",noRoom=" + getNoRoom() +
            ",inDate=" + getInDate() +
            ",outDate=" + getOutDate() +
            "}";
    }

}
