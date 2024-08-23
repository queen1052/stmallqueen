package stmallqueen.domain;

import java.util.*;
import lombok.*;
import stmallqueen.domain.*;
import stmallqueen.infra.AbstractEvent;

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
}
