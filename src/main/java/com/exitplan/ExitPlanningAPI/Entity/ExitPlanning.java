package com.exitplan.ExitPlanningAPI.Entity;

import jakarta.persistence.*;

@Entity
@Table(
        name = "exit_plans"
)
public class ExitPlanning {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(
            name = "plan_ID",
            length = 3
    )
    private int plan_ID;
    @Column(
            name = "patient_id",
            length = 255
    )
    private int patient_id;
    @Column(
            name = "manager_id",
            length = 255
    )
    private int manager_id;
    @Column(
            name = "title",
            length = 255
    )
    private String title;
    @Column(
            name = "start_date",
            length = 10
    )
    private String start_date;
    @Column(
            name = "end_date",
            length = 10
    )
    private String end_date;
    @Column(
            name = "description",
            length = 255
    )
    private String description;
    @Column(
            name = "status",
            length = 25
    )
    private String status;
    @Column(
            name = "med_prescribed",
            length = 255
    )
    private boolean med_prescribed;
    @Column(
            name = "future_visit_needed",
            length = 25
    )
    private boolean future_visit_needed;

    public ExitPlanning() {
    }

    public ExitPlanning(int plan_ID, int patient_id, int manager_id, String title, String start_date, String end_date, String description, String status, boolean med_prescribed, boolean future_visit_needed) {
        this.plan_ID = plan_ID;
        this.patient_id = patient_id;
        this.manager_id = manager_id;
        this.title = title;
        this.start_date = start_date;
        this.end_date = end_date;
        this.description = description;
        this.status = status;
        this.med_prescribed = med_prescribed;
        this.future_visit_needed = future_visit_needed;
    }

    public int getPlan_ID() {
        return this.plan_ID;
    }

    public void setPlan_ID(int plan_ID) {
        this.plan_ID = plan_ID;
    }

    public int getPatient_id() {
        return this.patient_id;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }

    public int getManager_id() {
        return this.manager_id;
    }

    public void setManager_id(int manager_id) {
        this.manager_id = manager_id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStart_date() {
        return this.start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return this.end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isMed_prescribed() {
        return this.med_prescribed;
    }

    public void setMed_prescribed(boolean med_prescribed) {
        this.med_prescribed = med_prescribed;
    }

    public boolean isFuture_visit_needed() {
        return this.future_visit_needed;
    }

    public void setFuture_visit_needed(boolean future_visit_needed) {
        this.future_visit_needed = future_visit_needed;
    }
}
