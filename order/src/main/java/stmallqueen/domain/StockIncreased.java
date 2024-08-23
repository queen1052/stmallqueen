package stmallqueen.domain;

import java.util.*;
import lombok.*;
import stmallqueen.domain.*;
import stmallqueen.infra.AbstractEvent;

@Data
@ToString
public class StockIncreased extends AbstractEvent {

    private Long id;
    private String productName;
    private String productImg;
    private Integer stock;
    private Date registerDt;
    private String status;
}
