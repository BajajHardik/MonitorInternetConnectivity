package com.internetConnectivity.monitorinternetconnectivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.internetconnectivity.connectivitystatus.ConnectivityStatus
import kotlinx.coroutines.CoroutineScope

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        connectivityStatus.available {
//            Toast.makeText(this@MainActivity,"Adfadf",Toast.LENGTH_LONG).show()
//        }
//
//        connectivityStatus.onLost {
//            Toast.makeText(this@MainActivity,"Internet Connection Lost",Toast.LENGTH_LONG).show()
//        }


//        connectivityStatus.monitorConnectivityStatus(onAvailable = {
//            Toast.makeText(this@MainActivity,"Adfadf",Toast.LENGTH_LONG).show()
//        },
//        onLost = {
//            Toast.makeText(this@MainActivity,"Adfadfdsfdfsgf",Toast.LENGTH_LONG).show()
//        })

    }

    override fun onResume() {
        super.onResume()
        val connectivityStatus = ConnectivityStatus(this)
        connectivityStatus.available {
            Toast.makeText(this@MainActivity,"Adfadf",Toast.LENGTH_LONG).show()
        }

        connectivityStatus.onLost {
            Toast.makeText(this@MainActivity,"Adfgsdgsafgadf",Toast.LENGTH_LONG).show()
        }
    }
}