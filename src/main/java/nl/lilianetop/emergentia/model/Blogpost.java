package nl.lilianetop.emergentia.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import nl.lilianetop.emergentia.backingBeans.Author;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table
public class Blogpost {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idBlogpost;
    @Column
    private String title;
    @Column
    private Date date;
    @Column
    private String description;
    @Column
    private String article;
    @Column(columnDefinition = "LONGTEXT")
    private String image1;
    @Column(columnDefinition = "LONGTEXT")
    private String image2;
//    @ElementCollection
//    private List<Author> authorsList;

}
