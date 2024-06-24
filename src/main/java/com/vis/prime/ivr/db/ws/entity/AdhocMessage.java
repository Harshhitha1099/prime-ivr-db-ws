package com.vis.prime.ivr.db.ws.entity;


import java.util.Date;

import javax.persistence.*;

import lombok.Data;

@Entity
@Table(name = "IVR_ADHOC_MESSAGE")
@Data
public class AdhocMessage {

    @EmbeddedId
    private AdhocMessageId id;

    @Column(name = "status", nullable = false, length = 10)
    private String status;

    @Column(name = "WAVEFILE", length = 100)
    private String wavFile;

    @Column(name = "interrupt", length = 10)
    private String interrupt;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "Start_Date_Time")
    private Date startDateTime;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "End_Date_Time")
    private Date endDateTime;

    @Column(name = "Last_Changed_By", length = 100)
    private String lastChangedBy;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "Last_Changed_On")
    private Date lastChangedOn;

    @Column(name = "modify_Reason", length = 100)
    private String modifyReason;

    @Column(name = "IVR_LANGUAGE", length = 10)
    private String ivrLanguage;

    @Column(name = "WAVEFILELIST", length = 105)
    private String waveFileList;
}

