package lk.ijse.roomReservationSystem.domain;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="PAYMENT")
class Payment{

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="PAYMENT_ID",length=10)
    private Integer paymentId;

    @Column(name="RESERVATION_ID", length = 10)
    private Integer reservationId;

    @Column(name="PAYMENT_DATE")
    private Date payDate;

    @Column(name="AMOUNT", length = 10)
    private Double amount;

    @OneToOne(mappedBy="payment",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    private Recervation reser;

    public Payment(){}

    public Payment(Integer reservationId,Date paydDate,Double amount){
        this.reservationId=reservationId;
        this.payDate=paydDate;
        this.amount=amount;
    }

    public Payment(Integer paymentId,Integer reservationId, Date paydDate, Double amount) {
        this.paymentId=paymentId;
        this.reservationId = reservationId;
        this.payDate = paydDate;
        this.amount = amount;
    }
	
    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }
    public Integer getPaymentId() {
        return this.paymentId;
    }
    public void setReservationId(Integer reservationId) {
        this.reservationId = reservationId;
    }
    public Integer getReservationId() {
        return this.reservationId;
    }
    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }
    public Date getPayDate() {
        return this.payDate;
    }
    public void setAmount(Double amount) {
        this.amount = amount;
    }
    public Double getAmount() {
        return this.amount;
    }

    public String toString() {
        return "{" + "paymentId=" + getPaymentId() + ",reservationId=" + getReservationId() + ",payDate=" + getPayDate()
                + ",amount=" + getAmount() + "}";
    }

}