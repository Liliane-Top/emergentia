package nl.lilianetop.emergentia.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long idBlogpost;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @ElementCollection
    private List<Blogpost> blogpostList;
}
