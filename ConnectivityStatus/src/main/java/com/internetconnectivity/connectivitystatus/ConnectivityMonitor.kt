package com.internetconnectivity.connectivitystatus

import kotlinx.coroutines.flow.Flow

interface ConnectivityMonitor {
    fun observer(): Flow<Status>

    enum class Status{
        Available,UnAvailable,Losing,Lost
    }
}