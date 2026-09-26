package model;
import lombok.Builder;
import lombok.Data;
import enums.PaymentStatus;
import java.time.LocalDateTime;

@Builder
@Data
public class Ticket {
    private String ticketId;
    private Vehicle vehicle;
    private LocalDateTime entryTime;
    private String floorId;
    private String spotId;
    private PaymentStatus paymentStatus = PaymentStatus.PENDING;
   
}