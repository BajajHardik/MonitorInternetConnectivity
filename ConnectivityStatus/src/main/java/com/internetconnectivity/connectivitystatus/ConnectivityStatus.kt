package com.internetconnectivity.connectivitystatus

import android.content.Context
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ConnectivityStatus(context: Context) {

    private val connectivityStatus:ConnectivityMonitor = CheckConnectivity(context)


    fun available(onAvailable:()->Unit){

        CoroutineScope(Dispatchers.Main).launch {
            connectivityStatus.observer().collect{
                if(it == ConnectivityMonitor.Status.Available){
                    onAvailable()
                }
            }
        }

    }

    fun unAvailable(unAvailable:()->Unit){
        CoroutineScope(Dispatchers.Main).launch {
            connectivityStatus.observer().collect{
                if(it == ConnectivityMonitor.Status.UnAvailable){
                    unAvailable()
                }
            }

        }
    }

    fun losing(losing:()->Unit){
        CoroutineScope(Dispatchers.Main).launch {
            connectivityStatus.observer().collect{
                if(it == ConnectivityMonitor.Status.Losing){
                    losing()
                }
            }

        }
    }

    fun onLost(onLost:()->Unit){
        CoroutineScope(Dispatchers.Main).launch {
            connectivityStatus.observer().collect{
                if(it == ConnectivityMonitor.Status.Lost){
                    onLost()
                }
            }

        }
    }
    
}