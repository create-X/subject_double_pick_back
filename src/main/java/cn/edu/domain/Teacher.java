package cn.edu.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Teacher {
    private String te_user_id;
    private String te_name;
    private String te_tele;
    private String te_qq;
    private String te_title;
    private String te_email;
    private String te_password;
    private Role role;
    private Subject subject;

}
