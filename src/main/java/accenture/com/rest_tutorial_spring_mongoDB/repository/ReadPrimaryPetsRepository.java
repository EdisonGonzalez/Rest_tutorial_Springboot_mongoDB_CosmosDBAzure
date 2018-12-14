package accenture.com.rest_tutorial_spring_mongoDB.repository;

//import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import accenture.com.rest_tutorial_spring_mongoDB.model.Pets;

@Repository
public interface ReadPrimaryPetsRepository extends MongoRepository<Pets, String> {
	Pets findBy_id(ObjectId _id);
}
