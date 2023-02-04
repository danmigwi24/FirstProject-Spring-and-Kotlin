package com.example.firstprojectspringandkotlin.repository.interfaces

import com.example.firstprojectspringandkotlin.model.Bank


interface ExampleDataSource {

    fun retrieveBanks(): Collection<Bank>
    fun retrieveBank(accountNumber: String): Bank
    fun addBank(bank: Bank): Bank
    fun updateBank(bank: Bank): Bank
    fun deleteBank(accountNumber: String)
}