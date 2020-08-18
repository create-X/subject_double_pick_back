package cn.edu.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SelectSubject {
    private Teacher teacher;
    private Student student;
    private Subject subject;
}
