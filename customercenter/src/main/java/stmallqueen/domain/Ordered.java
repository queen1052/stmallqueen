package stmallqueen.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;
import stmallqueen.infra.AbstractEvent;

@Data
public class Ordered extends AbstractEvent {

    private Long id;
    private String userId;
    private Integer qty;
    private String productName;
    private String ProductId;
    private Date orderDt;
    private String status;
    private String address;
}
