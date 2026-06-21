package com.wellsfargo.counselor.entity;
import javax.persistence.*;
@Entity
public class FinancialAdvisor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long advisorId;
    private String name;
    private String email;
    private String phone;
    @OneToMany(mappedBy = "advisor")
    private List<Client> clients;
    public FinancialAdvisor(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }
    public Long getAdvisorId() { return advisorId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
}

