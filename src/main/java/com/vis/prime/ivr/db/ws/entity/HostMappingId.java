package com.vis.prime.ivr.db.ws.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

@Embeddable
@Data
public class HostMappingId implements Serializable {

    @Column(name = "functionality", length = 50)
    private String functionality;

    @Column(name = "HOST_VALUE", length = 10)
    private String hostValue;

}
