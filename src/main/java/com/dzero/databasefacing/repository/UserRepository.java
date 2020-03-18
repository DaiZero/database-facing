package com.dzero.databasefacing.repository;

import com.dzero.databasefacing.entity.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * dddd
 * @author DZero
 */
@Repository
public interface UserRepository extends MongoRepository<UserEntity, String> {
}
