package com.dtvn.springbootproject.dto.responseDtos.Campaign;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class CampaginAndImgDTO {
    private Integer campaignId;
    private String name;
    private Timestamp startDate;
    private Timestamp endDate;
    private Long budget;
    private Integer usedAmount;
    private Float usageRate;
    private Boolean status;
    private Long bidAmount;
    private String imgUrl;
    private String title;
    private String description;
    private String finalUrl;
}
