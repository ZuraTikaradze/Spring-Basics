package ge.cse.jpademo.model;


import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
public class Attachment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String url;
    @OneToOne(mappedBy = "attachment", cascade = CascadeType.ALL)
    @ToString.Exclude
    private Post post;
}
