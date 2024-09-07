package com.example.GroupEntity.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Data
@Entity
@Getter
@Setter
@Table(name = "notification_group")
public class NotificationGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private GroupType type;  // Used to distinguish between age and loan group

    // Loan-related fields
    private Double fromAmount;
    private Double toAmount;
    private Double amountRange;

    // Age-related fields
    private Integer fromAge;
    private Integer toAge;
    private Integer ageRange;


    public enum GroupType {
        LOAN, AGE
    }
}

