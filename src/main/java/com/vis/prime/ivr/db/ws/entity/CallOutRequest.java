package com.vis.prime.ivr.db.ws.entity;


import javax.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "IVR_CALLOUT_REQUEST")
@Data
public class CallOutRequest {

    @Id
    @Column(name = "REQ_ID")
    private Integer requestId;

    @Column(name = "JOB_ID")
    private String jobId;

    @Column(name = "TAXI_ID")
    private String taxiId;

    @Column(name = "ADDRESS_ID")
    private String addressId;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "REQUEST_DATE_TIME")
    private Date requestDateTime;

    @Column(name = "CALLBACK_NUMBER")
    private String callBackNumber;

    @Column(name = "CALLOUT_RESULT")
    private String callOutResult;

    @Column(name = "UCID")
    private String ucid;

    @Column(name = "INITIATOR_ID")
    private String initiatorId;

}

