package com.vis.prime.ivr.db.ws.entity;


import java.util.Date;
import java.util.Set;

import javax.persistence.*;

import lombok.Data;


@Entity
@Data
public class CallHistory {

    @Id
    @Column(name = "ucid", length = 50)
    private String ucid;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "Start_Date_Time", nullable = false)
    private Date startDateTime;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "End_Date_Time", nullable = false)
    private Date endDateTime;

    @Column(name = "CALL_DUR", nullable = false)
    private Integer callDuration;

    @Column(name = "CLI_ENTERED", length = 3, nullable = false)
    private String cliEntered;

    @Column(name = "clid", length = 30)
    private String clid;

    @Column(name = "dnis", length = 30)
    private String dnis;

    @Column(name = "LAST_MENU_ID", length = 10)
    private String lastMenuID;

    @Column(name = "CUST_LANGUAGE", length = 10)
    private String custLanguage;

    @Column(name = "CUSTOMER_NAME", length = 50)
    private String customerName;

    @Column(name = "priority", length = 10)
    private String priority;

    @Column(name = "DUPLICATE_CALL_FLAG", length = 10)
    private String duplicateCallFlag;

    @Column(name = "BOOKING_STATUS", length = 10)
    private String bookingStatus;

    @Column(name = "BOOKING_ID", length = 20)
    private String bookingId;

    @Column(name = "JOB_ID", length = 20)
    private String jobId;

    @Column(name = "taxi_Number", length = 20)
    private String taxiNumber;

    @Column(name = "TRANSFERRED_CALL_FLAG", length = 2)
    private String transferedCallFlag;

    @Column(name = "TRANSFER_COUNT", length = 2)
    private String transferCount;

    @Column(name = "TRANSFER_REASON", length = 10)
    private String transferReason;

    @Column(name = "ANSWERING_AGENT_ID", length = 10)
    private String answeringAgentId;

    @Column(name = "ANSWERING_AGENT_SKILL", length = 20)
    private String answeringAgentSkill;

    @Column(name = "QUEUETIME", length = 10)
    private String queueTime;

    @Column(name = "LASTMENU_1", length = 50)
    private String lastMenu1;

    @Column(name = "LASTMENU_2", length = 50)
    private String lastMenu2;

    @Column(name = "LASTMENU_3", length = 50)
    private String lastMenu3;

    @Column(name = "LASTMENU_4", length = 50)
    private String lastMenu4;

    @OneToMany(mappedBy = "callHistory", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<HostTransactions> hostTransaction;

}
