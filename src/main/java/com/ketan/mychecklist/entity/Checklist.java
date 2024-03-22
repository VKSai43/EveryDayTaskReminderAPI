package com.ketan.mychecklist.entity;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;


@Component
@Entity
@Table(
        name="checklist",
        schema="checklist"
)
public class Checklist implements Serializable {

    @Id
    @Column(columnDefinition = "CHAR(36)")
    private String checklistId;

    @Temporal(TemporalType.DATE)
    private Date dateCreated;
    @Column(columnDefinition = "CHAR(36)")
    private String userId;
    private String checklistName;

    public String getChecklistId() {
        return checklistId;
    }

    public void setChecklistId(String checklistId) {
        this.checklistId = checklistId;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getChecklistName() {
        return checklistName;
    }

    public void setChecklistName(String checklistName) {
        this.checklistName = checklistName;
    }

    @Override
    public String toString() {
        return "Checklist{" +
                "checklistId='" + checklistId + '\'' +
                ", dateCreated=" + dateCreated +
                ", userId='" + userId + '\'' +
                ", checklistName='" + checklistName + '\'' +
                '}';
    }
}
