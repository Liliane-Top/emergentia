package nl.lilianetop.emergentia.dao;

import nl.lilianetop.emergentia.model.Blogpost;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogpostDao  extends CrudRepository<Blogpost, Long> {
    Iterable<Blogpost> findByTitleContaining(String title);
}
