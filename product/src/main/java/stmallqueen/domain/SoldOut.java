package stmallqueen.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import stmallqueen.domain.*;
import stmallqueen.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class SoldOut extends AbstractEvent {

    private Long id;
    private String productName;
    private String productImg;
    private Integer stock;
    private Date registerDt;
    private String status;

    public SoldOut(Inventory aggregate) {
        super(aggregate);
    }

    public SoldOut() {
        super();
    }
}
//>>> DDD / Domain Event
