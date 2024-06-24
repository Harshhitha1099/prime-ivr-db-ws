package com.vis.prime.ivr.db.ws.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "IVR_HOST_MAPPING")
@Data
public class HostMapping {

    @EmbeddedId
    private HostMappingId id;

    @Column(name = "MSG_Language", length = 10, nullable = true)
    private String msgLanguage;

    @Column(name = "wavfile", length = 100, nullable = false)
    private String wavfile;

    @Column(name = "status", length = 10, nullable = true)
    private String status;

    @Column(name = "MSG_Description", length = 100, nullable = false)
    private String msgDescription;

    @Column(name = "Last_Changed_By", length = 100, nullable = false)
    private String lastChangedBy;

    @Column(name = "Last_Changed_On", nullable = false)
    private String lastChangedOn;

}

