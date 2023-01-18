import Versions.composeVersion

object Dependencies {


    //Kotlin
    const val  coreKtx = "androidx.core:core-ktx:1.7.0"

    //Compose
    const val composeUi =  "androidx.compose.ui:ui:$composeVersion"
    const val  uiTollingPreview =  "androidx.compose.ui:ui-tooling-preview:$composeVersion"

    //Material
    const val  material3 = "androidx.compose.material3:material3:1.0.0-alpha01"

    //Android core
    const val lifecycleRuntimeKtx = "androidx.lifecycle:lifecycle-runtime-ktx:2.3.1"
    const val  activityCompose = "androidx.activity:activity-compose:1.3.1"
    const val viewModelCompose  = "androidx.lifecycle:lifecycle-viewmodel-compose:1.0.0-alpha07"
    const val navigationCompose = "androidx.navigation:navigation-compose:2.4.0-alpha08"
    const val hiltNavigationCompose = "androidx.hilt:hilt-navigation-compose:1.0.0-alpha03"
    //Retrofit
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofitVersion}"
    //Gson Converter
    const val gson_converter =  "com.squareup.retrofit2:converter-gson:${Versions.retrofitVersion}"
    //Gson
    const val gson = "com.google.code.gson:gson:${Versions.gsonVersion}"

    //OkHttp
    const val okhttp = "com.squareup.okhttp3:okhttp:${Versions.okhttpVersion}"
    //Logging
    const val logging = "com.squareup.okhttp3:logging-interceptor:${Versions.loggingInterceptorVersion}"

    //dagger hilt
    const val hilt = "com.google.dagger:hilt-android:${Versions.hiltVersion}"
    const val hiltCompiler =  "com.google.dagger:hilt-compiler:${Versions.hiltVersion}"
    //hilt viewmodel
    const val hilt_lifecycle_view_model = "androidx.hilt:hilt-lifecycle-viewmodel:${Versions.hiltLifecycleViewModel}"

    //internal libs
    const val coreInternal = ":core"


    //tests libs
    const val jUnit4 = "junit:junit:4.13.2"
    const val  jUnitJupiter = "org.junit.jupiter:junit-jupiter"
    const val extJunit4 = "androidx.test.ext:junit:1.1.3"
    const val  espressoCore = "androidx.test.espresso:espresso-core:3.4.0"
    const val  uiComposeTestJunit4 = "androidx.compose.ui:ui-test-junit4:$composeVersion"
    const val uiTolling =  "androidx.compose.ui:ui-tooling:$composeVersion"
    const val uiTestManifest =  "androidx.compose.ui:ui-test-manifest:$composeVersion"
}