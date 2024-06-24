package com.vis.prime.ivr.db.ws.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import lombok.Data;

@Entity
@Table(name = "IVR_HOST_TRANSACTIONS")
@Data
public class HostTranscationEntity {

    @Id
    @Column(name = "UCID")
    private String ucid;

    @Column(name = "TRANSACTION_NAME")
    private String transactionName;

    @Column(name = "RES_MESSAGE")
    private String responseMessage;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "RESPONSE_DATE_TIME")
    private Date responseDateTime;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "REQUEST_DATE_TIME")
    private Date requestDateTime;

    @Column(name = "REQ_MESSAGE")
    private String requestMessage;

    @Column(name = "ICD_MSG_ID")
    private String icdMessageId;






}
