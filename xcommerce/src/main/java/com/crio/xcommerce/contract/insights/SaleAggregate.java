
package com.crio.xcommerce.contract.insights;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class SaleAggregate {

  private Double totalSales;
  private List<SaleAggregateByMonth> aggregateByMonths;

}

