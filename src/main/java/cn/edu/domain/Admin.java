package cn.edu.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin {
    private String ad_user_id;
    private String ad_name;
    private String ad_pass;
    private Role role;
}
