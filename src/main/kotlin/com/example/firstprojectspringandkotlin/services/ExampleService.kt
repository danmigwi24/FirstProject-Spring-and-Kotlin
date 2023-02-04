package com.example.firstprojectspringandkotlin.services

import com.example.firstprojectspringandkotlin.model.Bank
import com.example.firstprojectspringandkotlin.repository.interfaces.ExampleDataSource
import org.springframework.stereotype.Service

@Service
class ExampleService(private val dataSource: ExampleDataSource) {
    fun getBanks(): Collection<Bank> {
        return dataSource.retrieveBanks()
    }

    fun getBank(accountNumber: String): Bank =dataSource.retrieveBank(accountNumber)
    fun addBank(bank: Bank): Bank =dataSource.addBank(bank)
    fun updateBank(bank: Bank): Bank =dataSource.updateBank(bank)
    fun deleteBank(accountNumber: String) =dataSource.deleteBank(accountNumber)
}