package com.dzero.databasefacing.repository;

import com.dzero.databasefacing.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author DZero
 */
@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
