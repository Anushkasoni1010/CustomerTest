package com.example.customer.Model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "customers")
public class CustomersModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="email",nullable=false,unique=true)
    private String email;
    @Column(name="first_name",nullable=true)
    private String first_name;
    @Column(name="last_name",nullable=true)
    private String last_name;
    @Column(name="ip",nullable=true)
    private String ip;
    @Column(name="latitude",nullable=true)
    private float latitude;
    @Column(name="longitude",nullable=true)
    private float longitude;
    @Column(name="created_at",nullable=false)
    private String created_at;
    @Column(name="updated_at",columnDefinition = "varchar(255) default Null ")
    private String updated_at;

    public CustomersModel() {
    }

    public CustomersModel(Long id, String email, String first_name, String last_name, String ip, float latitude, float longitude, String created_at, String updated_at) {
        this.id = id;
        this.email = email;
        this.first_name = first_name;
        this.last_name = last_name;
        this.ip = ip;
        this.latitude = latitude;
        this.longitude = longitude;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }
}
