package za.ac.nwu.ac.domain.tm.persistence;


import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@EqualsAndHashCode
@ToString
@Entity
@Table(name="ACCOUNT_TRANSACTION")
public class AccountTransaction implements Serializable {

//    private int transactionID;
//    private int accountTypeId;
//    private int memberId;
//    private int amount;
//    private LocalDate transactionDate;
    @Id
    @Column(name="ACCOUNT_TX_ID")
    private int transactionId;

    @Column(name="ACCOUNT_TYPE_ID")
    private AccountType accountTypeId;

    @Column(name="MEMBER_ID")
    private int memberId;

    @Column(name="AMOUNT")
    private int amount;

    @Column(name="TX_DATE")
    private LocalDate transactionDate;

    public AccountTransaction() {
    }

    public AccountTransaction(int transactionId, AccountType accountTypeId, int memberId, int amount, LocalDate transactionDate) {
        this.transactionId = transactionId;
        this.accountTypeId = accountTypeId;
        this.memberId = memberId;
        this.amount = amount;
        this.transactionDate = transactionDate;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="ACCOUNT_TYPE_ID")
    public AccountType getAccountTypeId() {
        return accountTypeId;
    }

    public void setAccountTypeId(AccountType accountTypeId) {
        this.accountTypeId = accountTypeId;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }
}
