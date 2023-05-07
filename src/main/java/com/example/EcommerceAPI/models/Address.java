package com.example.EcommerceAPI.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer addressId;

    @NotBlank(message = "Name is required")
    private String name;

    @NotBlank(message = "landmark is required")
    private String landmark;

    @NotBlank(message = "Phone number is required")
    @Pattern(regexp = "\\d{10}", message = "Phone number must be 10 digits")
    @Column(name = "phone_number")
    private String phoneNumber;

    @Pattern(regexp = "\\d{6}", message = "Zip code must be 6 digits")
    private String zipCode;


    @Enumerated(EnumType.STRING)
    private State state;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
