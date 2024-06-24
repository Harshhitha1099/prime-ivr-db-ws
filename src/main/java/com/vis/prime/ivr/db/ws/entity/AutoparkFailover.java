package com.vis.prime.ivr.db.ws.entity;

import javax.persistence.*;

import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "AUTOPARKFAILOVER")
@Data
public class AutoparkFailover {

    @Id
    @Column(name = "UCID2", length = 50)
    private String ucid2;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "AP_DATE_TIME")
    private Date apDateTime;

    @Column(name = "UCID1", length = 50, nullable = false)
    private String ucid1;

    @Column(name = "CLID", length = 20, nullable = false)
    private String clid;

    @Column(name = "BOOKING_ID", length = 20, nullable = false)
    private String bookingId;

    @Column(name = "JOB_ID", length = 20, nullable = false)
    private String jobId;

    @Column(name = "NUM_OF_TAXIS", length = 20)
    private String numOfTaxis;

    @Column(name = "LANG_PREF", length = 20)
    private String langPref;

    @Column(name = "PARKTYPE", length = 50)
    private String parkType;

    @Column(name = "NOTIFY_BY_SMS", length = 20)
    private String notifyBySms;

    @Column(name = "QUEUE_PRIORITY", length = 10)
    private String queuePriority;

    @Column(name = "TRANSFER_REASON", length = 10)
    private String transferReason;

    @Column(name = "BLACKLISTED", length = 10)
    private String blacklisted;

    @Column(name = "HOTLINE_NUMBER", length = 10)
    private String hotLineNumber;

}
