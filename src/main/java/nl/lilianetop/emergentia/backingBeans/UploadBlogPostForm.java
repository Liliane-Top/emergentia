package nl.lilianetop.emergentia.backingBeans;

import lombok.Data;
import lombok.NoArgsConstructor;
import nl.lilianetop.emergentia.model.Author;

import java.awt.*;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
public class UploadBlogPostForm {
    private String title;
    private Date date;
    private String description;
    private String story;
    private Image image1;
    private Image image2;
    private List<Author> authorList;
}
