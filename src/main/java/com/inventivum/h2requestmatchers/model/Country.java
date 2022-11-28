package com.inventivum.h2requestmatchers.model;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "country", schema = "core")
@AttributeOverride(name = "id", column = @Column(name = "country_id", columnDefinition = "uuid"))
public class Country extends Audit {

    @Column(name = "name")
    private String name;

    @Column(name = "iso3_code", unique = true)
    private String iso3Code;

    @Column(name = "iso3_short_code", unique = true)
    private String iso3ShortCode;

    @Column(name = "dialling_code")
    private String diallingCode;

    public Country() {
    }

    public Country(UUID id, LocalDateTime createdOn, LocalDateTime deletedOn, LocalDateTime lastUpdatedOn, String name,
                   String iso3Code, String iso3ShortCode, String diallingCode)
    {
        super(id, createdOn, deletedOn, lastUpdatedOn);
        this.name = name;
        this.iso3Code = iso3Code;
        this.iso3ShortCode = iso3ShortCode;
        this.diallingCode = diallingCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIso3Code() {
        return iso3Code;
    }

    public void setIso3Code(String iso3Code) {
        this.iso3Code = iso3Code;
    }

    public String getIso3ShortCode() {
        return iso3ShortCode;
    }

    public void setIso3ShortCode(String iso3ShortCode) {
        this.iso3ShortCode = iso3ShortCode;
    }

    public String getDiallingCode() {
        return diallingCode;
    }

    public void setDiallingCode(String diallingCode) {
        this.diallingCode = diallingCode;
    }
}
