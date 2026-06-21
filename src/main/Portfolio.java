package com.wellsfargo.counselor.entity;

import javax.persistence.*;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long portfolioId;

    private String portfolioName;

    @OneToOne
    @JoinColumn(name = "client_id")
    private Client client;

    // Default constructor
    public Portfolio() {}

    public Portfolio(String portfolioName, Client client) {
        this.portfolioName = portfolioName;
        this.client = client;
    }

    public Long getPortfolioId() { return portfolioId; }

    public String getPortfolioName() { return portfolioName; }
    public void setPortfolioName(String portfolioName) { this.portfolioName = portfolioName; }

    public Client getClient() { return client; }
    public void setClient(Client client) { this.client = client; }
}
