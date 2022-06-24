package com.example.testcases_kotlin

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test

class ResourceComparerTest
{
    private var  resourceComparer =ResourceComparer()

    @Before
    fun setup()
    {
        resourceComparer = ResourceComparer()
    }

    @After
    fun teardown()
    {

    }

    @Test
    fun StringResourceSameGivenString_returnsTrue()
    {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer.isEqual(context,R.string.app_name, "Testcases_kotlin")
        assertThat(result).isTrue()
    }

    @Test
    fun StringResourceDifferentGivenString_returnsFalse()
    {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer.isEqual(context,R.string.app_name, "athul")
        assertThat(result).isFalse()
    }
}