package com.lgdx.RobotEducation.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "counsel_info")
public class CounselInfo {
    @Id
    private String counselId;
    private List<String> contents;
    private List<String> keyword;
}