package com.attractor.demo.repositories;

import com.attractor.demo.entity.Comment;
import org.springframework.data.repository.CrudRepository;

public interface CommentRepository extends CrudRepository<Comment, String> {
    //поиск пользователя по комменту

}
