package com.vis.prime.ivr.db.ws.entity;

import javax.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "IVR_MENU_DESC")
@Data
public class MenuDescription {

    @Id
    @Column(name = "IMD_MENU_ID", length = 10)
    private String imdMenuId;

    @Column(name = "vdn", nullable = true, length = 10)
    private String vdn;

    @Column(name = "imd_Menu_Name", nullable = true, length = 100)
    private String imdMenuName;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "last_Changed_ON")
    private Date lastChangedON;

    @Column(name = "last_Changed_BY", length = 100)
    private String lastChangedBY;

}

