package com.internetConnectivity.monitorinternetconnectivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.internetconnectivity.connectivitystatus.ConnectivityStatus

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val connectivityStatus = ConnectivityStatus(this)
        connectivityStatus.available {
            Toast.makeText(this@MainActivity,"Adfadf",Toast.LENGTH_LONG).show()
        }

        connectivityStatus.onLost {
            Toast.makeText(this@MainActivity,"Internet Connection Lost",Toast.LENGTH_LONG).show()
        }




    }
}