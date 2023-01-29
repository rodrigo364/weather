import Versions.activityComposeVersion
import Versions.coilVersion
import Versions.composeVersion
import Versions.corektxVersion
import Versions.espressoCoreVersion
import Versions.extJunitVersion
import Versions.fontsGoogleVersion
import Versions.hiltCompilerVersion
import Versions.hiltNavigationComposeVersion
import Versions.junitVersion
import Versions.lifecycleRuntimektxVersion
import Versions.material3Version
import Versions.navigationComposeVersion
import Versions.viewModelComposeVersion

object Dependencies {


    //Kotlin
    const val  coreKtx = "androidx.core:core-ktx:$corektxVersion"

    //Compose UI
    const val composeUi =  "androidx.compose.ui:ui:$composeVersion"
    //Compose - Ui Tooling-Preview
    const val  uiTollingPreview =  "androidx.compose.ui:ui-tooling-preview:$composeVersion"

    //Material 3
    const val  material3 = "androidx.compose.material3:material3:$material3Version"

    /*Android core*/
    const val lifecycleRuntimeKtx = "androidx.lifecycle:lifecycle-runtime-ktx:$lifecycleRuntimektxVersion"
    const val  activityCompose = "androidx.activity:activity-compose:$activityComposeVersion"
    const val viewModelCompose  = "androidx.lifecycle:lifecycle-viewmodel-compose:$viewModelComposeVersion"
    const val navigationCompose = "androidx.navigation:navigation-compose:$navigationComposeVersion"
    const val hiltNavigationCompose = "androidx.hilt:hilt-navigation-compose:$hiltNavigationComposeVersion"
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
    const val hiltCompilerX = "androidx.hilt:hilt-compiler:$hiltCompilerVersion"

    //android fonts compose
    const val fontsGoogle = "androidx.compose.ui:ui-text-google-fonts:$fontsGoogleVersion"
    //coil
    const val coil = "io.coil-kt:coil-compose:$coilVersion"


    //internal libs
    const val coreInternal = ":core"


    //tests libs
    const val jUnit4 = "junit:junit:$junitVersion"
    const val  jUnitJupiter = "org.junit.jupiter:junit-jupiter"
    const val extJunit4 = "androidx.test.ext:junit:$extJunitVersion"
    const val  espressoCore = "androidx.test.espresso:espresso-core:$espressoCoreVersion"
    const val  uiComposeTestJunit4 = "androidx.compose.ui:ui-test-junit4:$composeVersion"
    const val uiTolling =  "androidx.compose.ui:ui-tooling:$composeVersion"
    const val uiTestManifest =  "androidx.compose.ui:ui-test-manifest:$composeVersion"
}