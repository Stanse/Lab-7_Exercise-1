package com.mybank.batch;

import com.mybank.domain.Account;
import com.mybank.domain.Bank;
import com.mybank.domain.Customer;
import com.mybank.domain.SavingsAccount;

public class AccumulateSavingsBatch {
    private Bank theBank;

    public void doBatch(){
        int numOfCustmrs = theBank.getNumOfCustomers();
        for(int custNum = 0; custNum < numOfCustmrs; custNum++){
            Customer customer = theBank.getCustomer(custNum);
            for (int curAcc = 0; curAcc < customer.getNumOfAccounts(); curAcc++){
                if(customer.getAccount(curAcc) instanceof SavingsAccount){
                    ((SavingsAccount) customer.getAccount(curAcc)).accumulateInterest();
                }
            }
        }
    }

    public void setBank(Bank aBank){
        theBank = aBank;
    }
}
