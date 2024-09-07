package com.example.GroupEntity.service;

import com.example.GroupEntity.entity.NotificationGroup;

import java.util.List;

public interface NotificationGroupService {
    List<NotificationGroup> getNotificationGroupsByType(NotificationGroup.GroupType type);
    NotificationGroup createOrUpdateNotificationGroup(NotificationGroup notificationGroup);
    List<NotificationGroup> getAllNotificationGroups();
    List<NotificationGroup> createOrUpdateNotificationGroups(List<NotificationGroup> notificationGroups);

}
