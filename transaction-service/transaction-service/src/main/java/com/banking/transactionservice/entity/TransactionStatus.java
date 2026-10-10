package com.banking.transactionservice.entity;

/**
 * Transaction lifecycle flow
 *
 * PENDING->PROCESSING->COMPLETED(clean transaction)
 *                     ->PENDING VERIFICATION(suspicious detected)
 *                     ->completed(verified)
 *                     ->FLAGGED(SAGA REFUND)
 *                     ->FAILED
 *                     ->FlAGGED
 */
public enum TransactionStatus {
    PENDING,
    PROCESSING,
    PENDING_VERIFICATION,
    COMPLETED,
    FAILED,
    FLAGGED
}
