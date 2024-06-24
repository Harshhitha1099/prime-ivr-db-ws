package com.vis.prime.ivr.db.ws.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.*;

import lombok.Data;


@Entity
@Table(name = "IVR_CALL_HISTORY")
@Data
public class CallHistoryEntity {

    @Id
    @Column(name = "ucid")
    private String ucid;


    @Column(name = "QUEUETIME")
    private String queueTime;

    @Column(name = "PRIORITY")
    private String priority;

    @Column(name = "LAST_MENU_ID")
    private String lastMenuID;

    @Column(name = "LASTMENU_1")
    private String lastMenu1;

    @Column(name = "LASTMENU_2")
    private String lastMenu2;

    @Column(name = "LASTMENU_3")
    private String lastMenu3;

    @Column(name = "LASTMENU_4")
    private String lastMenu4;

    @Column(name = "JOB_ID")
    private String jobId;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "END_DATE_TIME")
    private Date endDateTime;

    @Column(name = "DUPLICATE_CALL_FLAG")
    private String duplicateCallFlag;

    @Column(name = "DNIS")
    private String dnis;

    @Column(name = "CUST_LANGUAGE")
    private String custLanguage;

    @Column(name = "CUSTOMER_NAME")
    private String customerName;

    @Column(name = "CLI_ENTERED")
    private String cliEntered;

    @Column(name = "CLID")
    private String clid;

    @Column(name = "CALL_DUR")
    private Integer callDuration;

    @Column(name = "BOOKING_STATUS")
    private String bookingStatus;

    @Column(name = "BOOKING_ID")
    private String bookingId;

    @Column(name = "ANSWERING_AGENT_ID")
    private String answeringAgentId;

    @Column(name = "ANSWERING_AGENT_SKILL")
    private String answeringAgentSkill;

    @Column(name = "TRANSFERRED_CALL_FLAG")
    private String transferedCallFlag;

    @Column(name = "TRANSFER_COUNT")
    private String transferCount;

    @Column(name = "TRANSFER_REASON")
    private String transferReason;

    @Column(name = "TAXI_NUMBER")
    private String taxiNumber;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "START_DATE_TIME")
    private Date startDateTime;

}
