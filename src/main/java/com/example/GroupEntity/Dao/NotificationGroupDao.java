package com.example.GroupEntity.Dao;

import com.example.GroupEntity.entity.NotificationGroup;

import java.util.List;

public interface NotificationGroupDao {
    List<NotificationGroup> getByGroupType(NotificationGroup.GroupType type);
    NotificationGroup saveNotificationGroup(NotificationGroup notificationGroup);
    List<NotificationGroup> getAllNotificationGroups();
    List<NotificationGroup> createOrUpdateNotificationGroups(List<NotificationGroup> notificationGroups);


}
