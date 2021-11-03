package com.example.reto3.reservas.model;

public class StatusReportDTO {
    private Integer completed;
    private Integer cancelled;

    public StatusReportDTO() {
    }

    public StatusReportDTO(Integer completed, Integer cancelled) {
        this.completed = completed;
        this.cancelled = cancelled;
    }

    public Integer getCompleted() {
        return completed;
    }

    public void setCompleted(Integer completed) {
        this.completed = completed;
    }

    public Integer getCancelled() {
        return cancelled;
    }

    public void setCancelled(Integer cancelled) {
        this.cancelled = cancelled;
    }
}
