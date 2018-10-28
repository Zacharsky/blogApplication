package pl.kodu.akademia.blogApplication.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.kodu.akademia.blogApplication.model.Post;

@Repository
public interface IPostRepository extends CrudRepository<Post, Long> {

}
