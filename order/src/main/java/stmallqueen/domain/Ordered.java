package stmallqueen.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import stmallqueen.domain.*;
import stmallqueen.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class Ordered extends AbstractEvent {

    private Long id;
    private String userId;
    private Integer qty;
    private String productName;
    private String productId;
    private Date orderDt;
    private String status;
    private String address;

    public Ordered() {
        super();
    }
}
//>>> DDD / Domain Event
