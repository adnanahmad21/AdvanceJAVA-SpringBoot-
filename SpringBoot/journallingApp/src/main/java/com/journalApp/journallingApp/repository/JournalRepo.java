package com.journalApp.journallingApp.repository;

import com.journalApp.journallingApp.entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalRepo extends MongoRepository<JournalEntry, ObjectId> {
}
