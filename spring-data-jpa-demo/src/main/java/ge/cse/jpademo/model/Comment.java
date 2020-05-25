package ge.cse.jpademo.model;


import lombok.Data;
import lombok.ToString;

import javax.persistence.*;



@Data
@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String text;

    @ToString.Exclude
    @ManyToOne()
    private Post post;

}
