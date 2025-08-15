package com.example.ordertracker.model;

import java.time.LocalDateTime;

public class OrderStatusUpdate {
    private String orderId;
    private String status;
    private String message;
    private LocalDateTime timestamp;

    public OrderStatusUpdate() {}

    public OrderStatusUpdate(String orderId, String status, String message) {
        this.orderId = orderId;
        this.status = status;
        this.message = message;
        this.timestamp = LocalDateTime.now();
    }

    public String getOrderId() { return orderId; }
    public void setOrderId(String orderId) { this.orderId = orderId; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    public LocalDateTime getTimestamp() { return timestamp; }
    public void setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; }
}
