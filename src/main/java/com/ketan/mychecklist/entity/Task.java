package com.ketan.mychecklist.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(
        name="tasks",
        schema="tasks"
)
public class Task implements Serializable {

    @Id
    @Column(columnDefinition = "CHAR(36)")
    private String taskId;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name="checklist_id")
    @Column(columnDefinition = "CHAR(36)")
    private String checklistId;

    private String taskName;

    @Temporal(TemporalType.DATE)
    private Date dateCreated;

    private String description;

    private Boolean status;


    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getChecklistId() {
        return checklistId;
    }

    public void setChecklistId(String checklistId) {
        this.checklistId = checklistId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskId='" + taskId + '\'' +
                ", checklistId='" + checklistId + '\'' +
                ", taskName='" + taskName + '\'' +
                ", dateCreated=" + dateCreated +
                ", description='" + description + '\'' +
                ", status=" + status +
                '}';
    }
}
