package com.vis.prime.ivr.db.ws.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "IVR_DNIS_MAPPING")
@Data
public class IvrDnisMapping {

    @Id
    @Column(name = "VDN", length = 10)
    private String vdn;

    @Column(name = "HOTLINE_NUMBER", length = 20, nullable = true)
    private String hotlineNumber;

    @Column(name = "HOTLINE_DESCRIPTION", length = 30, nullable = true)
    private String hotlineDescription;

}

