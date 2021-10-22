package com.qf.demo.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author lzj
 * @Date 2021/10/22
 */
@Data
public class ResultVO implements Serializable {
    private Long serialVersionUID = 1L;

    private Integer coode;

    private String massage;

    private Object data;
}
