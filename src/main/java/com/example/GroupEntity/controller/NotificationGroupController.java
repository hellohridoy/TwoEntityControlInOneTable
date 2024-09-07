package com.example.GroupEntity.controller;

import com.example.GroupEntity.entity.NotificationGroup;
import com.example.GroupEntity.service.NotificationGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notification-groups")
public class NotificationGroupController {
    @Autowired
    private NotificationGroupService notificationGroupService;

    // Get all groups by type (LOAN or AGE)
    @GetMapping("/{type}")
    public ResponseEntity<List<NotificationGroup>> getNotificationGroupsByType(@PathVariable String type) {
        NotificationGroup.GroupType groupType = NotificationGroup.GroupType.valueOf(type.toUpperCase());
        List<NotificationGroup> groups = notificationGroupService.getNotificationGroupsByType(groupType);
        return ResponseEntity.ok(groups);
    }

    // Create or update a notification group
    @PostMapping
    public ResponseEntity<NotificationGroup> createOrUpdateNotificationGroup(@RequestBody NotificationGroup notificationGroup) {
        NotificationGroup savedGroup = notificationGroupService.createOrUpdateNotificationGroup(notificationGroup);
        return ResponseEntity.ok(savedGroup);
    }

    // Get all notification groups (both LOAN and AGE)
    @GetMapping
    public ResponseEntity<List<NotificationGroup>> getAllNotificationGroups() {
        List<NotificationGroup> groups = notificationGroupService.getAllNotificationGroups();
        return ResponseEntity.ok(groups);
    }

    // Create or update multiple notification groups
    @PostMapping("/batch")
    public ResponseEntity<List<NotificationGroup>> createOrUpdateNotificationGroups(@RequestBody List<NotificationGroup> notificationGroups) {
        List<NotificationGroup> savedGroups = notificationGroupService.createOrUpdateNotificationGroups(notificationGroups);
        return ResponseEntity.ok(savedGroups);
    }


}

