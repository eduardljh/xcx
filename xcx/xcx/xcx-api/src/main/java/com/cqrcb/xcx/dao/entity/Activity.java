package com.cqrcb.xcx.dao.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@Accessors(chain=true)
public class Activity implements Serializable {
    public Activity(String actName)
    {
        super();
        this.actName = actName;
    }
    private String actId;

    private String actName;

    private Date actBeginTime;

    private Date actEndTime;

    private String actStatus;

    private String rpAmount;

    private String rpIntegral;

    private String actType;

    private String actPeriod;

    private String limitNum;

    private String limitType;

    private String createBy;

    private Date createTime;

    private String modifyBy;

    private Date modifyTime;

    private Date releaseTime;

    private String remark;

    private String isDelete;

    private String sourceDb;
}