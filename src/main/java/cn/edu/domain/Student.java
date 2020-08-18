package cn.edu.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String stu_user_id;
    private String stu_name;
    private String clazz;
    private String pid;
    private String stu_tele;
    private String stu_qq;
    private Role role;
}
