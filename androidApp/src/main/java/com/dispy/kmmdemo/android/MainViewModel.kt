package com.dispy.kmmdemo.android

import androidx.lifecycle.*
import com.dispy.kmmdemo.model.DataRepository
import com.dispy.kmmdemo.model.remote.ktor.CafeResponseItem
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

/**
 * Created by Dispy-Yang on 2022/05/22
 *
 * @author Dispy-Yang
 * @since 2022/5/22
 */
class MainViewModel : ViewModel() {
    private val dataRepository: DataRepository = DataRepository()
    private val cafeList = MutableLiveData<List<CafeResponseItem>>()
    val cafeListLiveData: LiveData<List<CafeResponseItem>> = Transformations.map(cafeList) { it }

    fun fetchCafeData(city: String = "") {
        viewModelScope.launch {
            val result = async { dataRepository.fetchCafesFromNetwork(city) }
            cafeList.value = result.await()
        }
    }
}