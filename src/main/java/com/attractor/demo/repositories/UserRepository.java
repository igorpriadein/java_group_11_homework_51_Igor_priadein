package com.attractor.demo.repositories;

import com.attractor.demo.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,String> {
    // добавить поиск пользователей по имени

    // проверить существование пользователя по имейл

}
