package idnull.znz.myapplication.utils

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import idnull.znz.myapplication.R
import org.junit.Before

import org.junit.Test

class ResourceCompareTest{
   private lateinit var resourceCompare:ResourceCompare

    @Before
    fun setup(){
        resourceCompare  = ResourceCompare()
    }

    @Test
    fun stringResourceSameAsGivenString_returnTrue(){
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceCompare.isEqual(context, R.string.app_name, "My Application")
        assertThat(result).isTrue()
    }
    @Test
    fun stringResourceDifferentAsGivenString_returnFalse(){
        val context = ApplicationProvider.getApplicationContext<Context>()

        val result = resourceCompare.isEqual(context, R.string.app_name, "My An")
        assertThat(result).isFalse()
    }




}