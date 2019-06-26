package com.sbaxon.business.account.command;

import lombok.Data;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Data
public class TransferAccountCommand {

    @TargetAggregateIdentifier
    private String srcAccountUUID;

    private String dstAccountUUID;

    private double amount;

}
