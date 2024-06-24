package com.vis.prime.ivr.db.ws.entity;

import java.util.Date;

import javax.persistence.*;

import lombok.Data;

@Entity
@Table(name = "IVR_USAGE")
@Data
public class Usage {

    @Id
    @Column(name = "UCID")
    private String ucid;

    @Id
    @Column(name = "IU_ORDER")
    private Integer iuOrder;

    @Column(name = "MENU_ID")
    private String menuId;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "IU_DATE_TIME")
    private Date iuDateTime;

    @Column(name = "IU_REMARKS")
    private String iuRemarks;

}

