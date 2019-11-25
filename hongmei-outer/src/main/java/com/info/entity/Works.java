package com.info.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Works {
    private Integer id;
    private String createDate;
    private String workContent;
    private Integer empId;
}
