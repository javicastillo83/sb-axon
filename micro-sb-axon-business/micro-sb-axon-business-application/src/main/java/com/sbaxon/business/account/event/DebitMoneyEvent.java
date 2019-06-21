package com.sbaxon.business.account.event;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DebitMoneyEvent {

   private String uuid;
   private double amount;
}
