package com.sun;

import javax.persistence.*;
import java.math.BigDecimal;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name ="ExchangeValue",schema = "microservices")
public class ExchangeValue {
@Id
@GeneratedValue(strategy = IDENTITY)
    private Long id;
@Column(name = "ValueFrom")
    private String from;
    @Column(name = "Valueto")
    private String to;
    @Column(name = "conversionMultiple")
    private BigDecimal conversionMultiple;
    @Column(name = "port")
    private int port;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BigDecimal getConversionMultiple() {
        return conversionMultiple;
    }

    public void setConversionMultiple(BigDecimal conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
