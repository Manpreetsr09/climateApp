package man.run2.myclimateapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import man.run2.myclimateapp.Api.Constant
import man.run2.myclimateapp.Api.NetworkResponse
import man.run2.myclimateapp.Api.RetrofitInstance

import man.run2.myclimateapp.Api.WheatherModel

class WeatherViewModel : ViewModel() {

    private val weatherApi = RetrofitInstance.weatherApi
private val _weatherResult = MutableLiveData<NetworkResponse<WheatherModel>>()
     val weatherResult : LiveData<NetworkResponse<WheatherModel>> = _weatherResult


    fun getData(city : String){
      _weatherResult.value = NetworkResponse.Loading
       viewModelScope.launch {
    try {
      val response =  weatherApi.getWeather(Constant.apiKey,city)
    if(response.isSuccessful){
        response.body()?.let {
            _weatherResult.value =  NetworkResponse.Success(it)
        }
    }else {
        _weatherResult.value = NetworkResponse.Error("Failed to load Data")
    }
    }
    catch (e : Exception){
        _weatherResult.value = NetworkResponse.Error("Failed to load Data")


    }    }
    }
}