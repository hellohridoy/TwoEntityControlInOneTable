package com.example.GroupEntity.Dao;

import com.example.GroupEntity.entity.NotificationGroup;
import com.example.GroupEntity.repository.NotificationGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class NotificationGroupDaoImpl implements NotificationGroupDao{

    @Autowired
    private NotificationGroupRepository notificationGroupRepository;

    @Override
    public List<NotificationGroup> getByGroupType(NotificationGroup.GroupType type) {
        return notificationGroupRepository.findByType(type);
    }

    @Override
    public NotificationGroup saveNotificationGroup(NotificationGroup notificationGroup) {
        return notificationGroupRepository.save(notificationGroup);
    }

    @Override
    public List<NotificationGroup> getAllNotificationGroups() {
        return notificationGroupRepository.findAll();
    }

    @Override
    public List<NotificationGroup> createOrUpdateNotificationGroups(List<NotificationGroup> notificationGroups) {
        return notificationGroupRepository.saveAll(notificationGroups);
    }
}
