package com.example.firstprojectspringandkotlin.repository.mock


import com.example.firstprojectspringandkotlin.repository.ExampleDataSourceImpl
import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test

class ExampleDataSourceImplTest {

    private val mockDataSource = ExampleDataSourceImpl()

    @Test
    fun `should provide a collection of banks`() {

        //given

        //when
        val banks = mockDataSource.retrieveBanks()
        //then

        assertThat(banks.size).isGreaterThanOrEqualTo(3)

    }

    @Test
    fun `should provide some mock data`() {

        //given


        //when
        val banks = mockDataSource.retrieveBanks()


        //then

        assertThat(banks).allMatch { it.accountNumber.isNotBlank() }
        assertThat(banks).allMatch { it.trust != 0.0 }
        assertThat(banks).allMatch { it.trancationFee != 0 }
    }
}