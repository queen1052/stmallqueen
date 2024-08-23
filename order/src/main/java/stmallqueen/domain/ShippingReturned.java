package stmallqueen.domain;

import java.util.*;
import lombok.*;
import stmallqueen.domain.*;
import stmallqueen.infra.AbstractEvent;

@Data
@ToString
public class ShippingReturned extends AbstractEvent {

    private Long id;
    private String orderId;
    private String userId;
    private String productName;
    private Integer qty;
    private Date deliveryDate;
    private String status;
}
