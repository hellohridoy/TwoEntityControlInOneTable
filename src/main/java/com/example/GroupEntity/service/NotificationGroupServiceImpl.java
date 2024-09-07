package com.example.GroupEntity.service;

import com.example.GroupEntity.Dao.NotificationGroupDao;
import com.example.GroupEntity.entity.NotificationGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationGroupServiceImpl implements NotificationGroupService{

    @Autowired
    private NotificationGroupDao notificationGroupDao;

    @Override
    public List<NotificationGroup> getNotificationGroupsByType(NotificationGroup.GroupType type) {
        return notificationGroupDao.getByGroupType(type);
    }

    @Override
    public NotificationGroup createOrUpdateNotificationGroup(NotificationGroup notificationGroup) {
        return notificationGroupDao.saveNotificationGroup(notificationGroup);
    }

    @Override
    public List<NotificationGroup> getAllNotificationGroups() {
        return notificationGroupDao.getAllNotificationGroups();
    }

    @Override
    public List<NotificationGroup> createOrUpdateNotificationGroups(List<NotificationGroup> notificationGroups) {
        return notificationGroupDao.createOrUpdateNotificationGroups(notificationGroups);
    }
}
