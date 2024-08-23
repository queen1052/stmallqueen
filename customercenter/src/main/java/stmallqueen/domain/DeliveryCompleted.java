package stmallqueen.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;
import stmallqueen.infra.AbstractEvent;

@Data
public class DeliveryCompleted extends AbstractEvent {

    private Long id;
    private String orderId;
    private String userId;
    private String productName;
    private Integer qty;
    private Date deliveryDate;
    private String status;
}
