plugins {
    id("com.android.application")
}

android {
    namespace = "com.botostore.marketplace"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.botostore.marketplace"
        minSdk = 23
        targetSdk = 35
        versionCode = 1
        versionName = "1.0.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }
}
