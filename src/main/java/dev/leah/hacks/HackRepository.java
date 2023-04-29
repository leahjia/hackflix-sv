package dev.leah.hacks;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HackRepository extends MongoRepository<Hack, ObjectId> {
  Optional<Hack> findHackByHackId(String hackId);
}
