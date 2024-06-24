package com.vis.prime.ivr.db.ws.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
public class HostTransactions implements Serializable {

    @Id
    @Column(name = "ucid", length = 50)
    private String ucid;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "Request_Date_Time", nullable = false)
    private Date requestDateTime;

    @ManyToOne
    @JoinColumn(name = "ucid", referencedColumnName = "ucid", insertable = false, updatable = false)
    private CallHistory callHistory;

    @Column(name = "ICD_MSG_ID", length = 20, nullable = false)
    private String icdMessageId;

    @Column(name = "transaction_Name", length = 50, nullable = false)
    private String transactionName;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "Response_Date_Time", nullable = false)
    private Date responseDateTime;

    @Column(name = "req_message", length = 2500)
    private String requestMessage;

    @Column(name = "res_Message", length = 3500)
    private String responseMessage;

}
