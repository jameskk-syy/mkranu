package com.emtech.loanapp.LoanSchedule;

import com.emtech.loanapp.Loan.Loan;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class LoanSchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Double installmentAmount;
    private Double principalAmount;
    private Double interestAmount;
    private Date repaymentDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "loan_sn", nullable = false)
    private Loan loan;
}
