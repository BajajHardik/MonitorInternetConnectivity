package com.internetconnectivity.connectivitystatus

import android.content.Context
import android.widget.Toast
import androidx.lifecycle.Lifecycle
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ConnectivityStatus(context: Context) {

    private val connectivityStatus:ConnectivityMonitor = CheckConnectivity(context)

    private val scope = CoroutineScope(Dispatchers.Main)

//    inline fun monitorConnectivityStatus(
//        crossinline onAvailable:()->Unit={ },
//        crossinline onLost: () -> Unit={ },
//        crossinline unAvailable: () -> Unit={ },
//        crossinline losing: () -> Unit={ }
//    )=CoroutineScope(Dispatchers.Main).launch {
//        connectivityStatus.observer().collect{
//            when(it) {
//                ConnectivityMonitor.Status.Available -> onAvailable()
//                ConnectivityMonitor.Status.UnAvailable -> unAvailable()
//                ConnectivityMonitor.Status.Losing -> losing()
//                ConnectivityMonitor.Status.Lost -> onLost()
//            }
//        }
//    }


    fun available(onAvailable:()->Unit) = scope.launch{

            connectivityStatus.observer().collect{
                if(it == ConnectivityMonitor.Status.Available){
                    onAvailable()
                }
            }


    }

    fun unAvailable(unAvailable:()->Unit) = scope.launch{
            connectivityStatus.observer().collect{
                if(it == ConnectivityMonitor.Status.UnAvailable){
                    unAvailable()
                }
            }

    }

    fun losing(losing:()->Unit) = scope.launch{
            connectivityStatus.observer().collect{
                if(it == ConnectivityMonitor.Status.Losing){
                    losing()
                }
            }

    }

    fun onLost(onLost:()->Unit)=scope.launch{
            connectivityStatus.observer().collect{
                if(it == ConnectivityMonitor.Status.Lost){
                    onLost()
                }
            }

    }


    
}