package com.quentin.tech.accounts.mapper;

import com.quentin.tech.accounts.dto.AccountsDto;
import com.quentin.tech.accounts.entity.Accounts;

public class AccountsMapper {
    public static AccountsDto mapToAccountsDto(Accounts accounts, AccountsDto accountsDto){
        accountsDto.setAccountNumber(accounts.getAccountNumber());
        accountsDto.setAccountType(accounts.getAccountType());
        accountsDto.setBranchAddress(accounts.getBranchAddress());

        return accountsDto;
    }

    public static Accounts mapToAccounts(AccountsDto accountsDto, Accounts accounts){
        accounts.setAccountNumber(accountsDto.getAccountNumber());
        accountsDto.setAccountType(accountsDto.getAccountType());
        accountsDto.setBranchAddress(accountsDto.getBranchAddress());

        return accounts;
    }
}
