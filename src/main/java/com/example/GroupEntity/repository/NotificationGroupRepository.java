package com.example.GroupEntity.repository;
import com.example.GroupEntity.entity.NotificationGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface NotificationGroupRepository extends JpaRepository<NotificationGroup, Long> {

    // Custom query to find all by type (either LOAN or AGE)
    List<NotificationGroup> findByType(NotificationGroup.GroupType  type);
}
