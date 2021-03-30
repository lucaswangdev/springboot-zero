package com.lucaswangdev.entiry;

import lombok.Data;

/**
 * user实体类
 */
@Data
public class User {
    private Integer id;
    private String username;
    private String password;
    private String name;
}
