package com.vis.prime.ivr.db.ws.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "IVR_TTS_SMS")
@Data
public class TTSSMS {

    @Id
    @Column(name = "Flag", length = 10)
    private String flag;

}

