package com.lrj.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TUser implements Serializable {

    private int id;

    private String name;

    private String sex;

    private String hobby;

    private String motto;

    private Date createDate;

    private Date updateDate;


}
