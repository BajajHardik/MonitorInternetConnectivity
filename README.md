# MonitorInternetConnectivity

MonitorInternetConnectivity is an android library that lets you keep track of the internet connection like when the internet is available,lost, onLosing...


## Usage

Dependency

    repositories {
        ...
        maven {url 'https://jitpack.io'}
    }

Include the library in your build.gradle

    dependencies{ 
        implementation 'com.github.BajajHardik:MonitorInternetConnectivity:1.0'
    }

This is how you can use this library in your android project:

    val connectivityStatus = ConncetivityStatus(context)

    connectivityStatus.onAvailable{
        // write your code let say a feature in your app requires internet connection
    }

    connectivityStatus.onLost{
        //when the connection is lost
    }

    connectivityStatus.onLosing{
        
    }


## License

[MIT LICENSE](https://github.com/BajajHardik/MonitorInternetConnectivity/blob/master/LICENSE)
