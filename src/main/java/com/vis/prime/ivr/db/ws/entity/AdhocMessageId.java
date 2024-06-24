package com.vis.prime.ivr.db.ws.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Embeddable
@Data
public class AdhocMessageId implements Serializable {

    @Column(name = "functionality", length = 100)
    private String functionality;

    @Column(name = "MSG_Language", length = 10)
    private String msgLanguage;

}

