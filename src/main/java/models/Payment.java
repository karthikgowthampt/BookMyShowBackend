package models;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;
import models.enums.PaymentMode;
import models.enums.PaymentProvider;
import models.enums.PaymentStatus;

@Getter
@Setter
@Entity
public class Payment extends BaseModel{
    private String referenceId;

    @Enumerated
    private PaymentMode paymentMode;

    private double amount;

    @Enumerated
    private PaymentProvider paymentProvider;

    @Enumerated
    private PaymentStatus paymentStatus;
}
