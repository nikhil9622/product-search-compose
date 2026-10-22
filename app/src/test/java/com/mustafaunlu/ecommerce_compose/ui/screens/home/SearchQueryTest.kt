package com.mustafaunlu.ecommerce_compose.ui.screens.home

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class SearchQueryTest {
    @Test
    fun `blank query loads all products`() {
        assertTrue(shouldLoadAllProducts(""))
        assertTrue(shouldLoadAllProducts("   "))
    }

    @Test
    fun `non blank query keeps search active`() {
        assertFalse(shouldLoadAllProducts("phone"))
    }
}
