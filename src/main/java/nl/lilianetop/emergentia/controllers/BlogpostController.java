package nl.lilianetop.emergentia.controllers;


import nl.lilianetop.emergentia.dao.BlogpostDao;
import nl.lilianetop.emergentia.model.Blogpost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:8081")
@RequestMapping("/api")
public class BlogpostController {
    @Autowired
    BlogpostDao blogpostDao;

    @GetMapping("/blogposts")
    public ResponseEntity<List<Blogpost>> getAllBlogPosts(@RequestParam(required = false) String title){
        try {
            List<Blogpost> blogpostList = new ArrayList<>();
            if(title == null) {
                blogpostDao.findAll().forEach(blogpostList::add);
            } else {
                blogpostDao.findByTitleContaining(title).forEach(blogpostList::add);
            }

            if(blogpostList.isEmpty()){
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(blogpostList, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
