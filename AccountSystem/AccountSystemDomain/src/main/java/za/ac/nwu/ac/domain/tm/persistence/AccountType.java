package za.ac.nwu.ac.domain.tm.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name="ACCOUNT_TYPE")
public class AccountType implements Serializable {

    @Id
    @Column(name="ACCOUNT_TYPE_ID")
    private int accountTypeId;

    @Column(name="MNEMONIC")
    private String mnemonic;

    private String accountTypeName;

    @Column(name="CREATION_DATE")
    private LocalDate creationDate;

    private Set<AccountTransaction>accountTransactions;

    public AccountType(int accountTypeId, String mnemonic, String accountTypeName, LocalDate creationDate) {
        this.accountTypeId = accountTypeId;
        this.mnemonic = mnemonic;
        this.accountTypeName = accountTypeName;
        this.creationDate = creationDate;
    }

    public AccountType( String mnemonic, String accountTypeName, LocalDate creationDate) {
        this.mnemonic = mnemonic;
        this.accountTypeName = accountTypeName;
        this.creationDate = creationDate;
    }

    public AccountType() {
    }


    @OneToMany(targetEntity=AccountTransaction.class,fetch=FetchType.LAZY,mappedBy = "accountType",orphanRemoval = true,cascade=CascadeType.PERSIST)
    public Set<AccountTransaction> getAccountTransactions(){
        return getAccountTransactions();
    }

    public void setAccountTransactions(Set<AccountTransaction> accountTransactions){
        this.accountTransactions=accountTransactions;
    }

    public int getAccountTypeId() {
        return accountTypeId;
    }

    public void setAccountTypeId(int accountTypeId) {
        this.accountTypeId = accountTypeId;
    }

    public String getMnemonic() {
        return mnemonic;
    }

    public void setMnemonic(String mnemonic) {
        this.mnemonic = mnemonic;
    }

    public String getAccountTypeName() {
        return accountTypeName;
    }

    public void setAccountTypeName(String accountTypeName) {
        this.accountTypeName = accountTypeName;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountType that = (AccountType) o;
        return Objects.equals(accountTypeId, that.accountTypeId) && Objects.equals(mnemonic, that.mnemonic) && Objects.equals(accountTypeName, that.accountTypeName) && Objects.equals(creationDate, that.creationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountTypeId, mnemonic, accountTypeName, creationDate);
    }

    @Override
    public String toString() {
        return "AccountType{" +
                "AccountTypeId=" + accountTypeId +
                ", Mnemonic='" + mnemonic + '\'' +
                ", AccountTypeName='" + accountTypeName + '\'' +
                ", creationDate=" + creationDate +
                '}';
    }
}
