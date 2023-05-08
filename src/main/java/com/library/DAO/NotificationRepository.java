package com.library.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.library.entities.Notification;

@Repository
public interface NotificationRepository extends CrudRepository<Notification, Long> {

}
