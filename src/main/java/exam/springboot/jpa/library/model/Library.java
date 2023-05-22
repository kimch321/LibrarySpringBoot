package exam.springboot.jpa.library.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
@Table(name = "LIBRARY")
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Library {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lbno;
    private String lbname;
    private String sido;
    private String gugun;
    private String lbtype;
    private String clsday;
    private String addr;
    private String phone;
    private String homepage;
    private String lat;
    private String lon;
    private String regdate;
}
