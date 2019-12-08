@file:Suppress("unused")

object Versions {
    // top-level versions
    const val gradle  = "4.0.+"
    const val jacoco = "0.8.3"
    const val mavenGradle = "2.0"
    const val bintray = "1.8.1"

    // kotlin
    const val kotlin = "1.3.50"
    const val ktx = "1.0.1"
    const val kotlinCoroutines = "1.3.2"

    // Android libraries
    const val appCompatKtx = "1.0.0"
    const val constraintLayoutKtx = "1.1.3"
    const val archComponentsKtx = "2.1.0"
    const val glide = "4.0.0"
    const val navigationKtx = "1.0.0-alpha07"
    const val coreKtx = "1.0.0"
    const val multiDexKtx = "2.0.0"
    const val playServices = "15.0.1"
    const val lifecycleViewModelKtx = "2.1.0"

    // Third party libraries
    const val dagger = "2.21"
    const val assistedInject = "0.3.3"
    const val retrofit = "2.6.0"
    const val okhttp = "3.13.0"
    const val rxjava = "2.2.7"
    const val rxAndroid = "2.1.1"
    const val reactiveNetwork = "3.0.2"
    const val jetbrainsAnnotations = "17.0.0"
    const val threeTenBp = "1.3.8"
    const val threeTenABp = "1.1.2"
    const val hockeyAppSdkVersion = "5.1.1"
    const val sentryVersion = "1.7.21"

    // Unit Testing
    const val robolectric = "3.8"
    const val junit = "4.12"
    const val mockito = "2.0.0"
    const val mockitoKotlin = "1.6.0"
    const val powermock = "2.0.0"
    const val archUnit = "0.10.2"
    const val archCore = "1.1.1"
    const val kluent = "1.48"
    const val assertj = "3.11.1"
    const val junit5 = "5.2.0"
    const val junitPlugin = "1.5.1.0"
    const val mockk = "1.9.3"

    // Acceptance Testing
    const val runner = "1.1.0"
    const val espresso = "3.1.0"
    const val rxIdler = "0.9.1"
    const val orchestrator = "1.1.0"

    // Development
    const val leakCanary = "1.6.3"
    const val chuck = "1.1.0"
    const val stetho = "1.5.0"

    // Image loading
    const val picasso = "2.71828"

    // Vector Animations
    const val lottie = "2.7.0" // version 2.8.0 requires androidx, so don't update

    // Database
    const val room = "1.1.1"

    // Quality
    const val checkstyle = "8.18"
    const val ktlint = "0.30.0"

    // Arch components
    const val archComponents = "1.1.1"

    // Android tools
    const val androidTools = "26.3.1"
    const val androidUiAutomator = "2.2.0"

    // Arrow
    const val arrowVersion = "0.8.2"

    // Flexbox
    const val flexbox = "1.0.0"

    // Spek
    const val spek = "2.0.7"

}

object Android {
    const val buildTools = "28.0.3"
    const val compileSdk = 28
    const val targetSdk = 28
    const val minSdk = 21
    const val testRunner = "androidx.test.runner.AndroidJUnitRunner"
}

object ProjectDependencies {
    const val androidGradlePlugin    = "com.android.tools.build:gradle:${Versions.gradle}"
    const val kotlinGradlePlugin     = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    const val mavenGradlePlugin      = "com.github.dcendents:android-maven-gradle-plugin:${Versions.mavenGradle}"
    const val bintrayPlugin          = "com.jfrog.bintray.gradle:gradle-bintray-plugin:${Versions.bintray}"
    const val junit5Plugin          = "de.mannodermaus.gradle.plugins:android-junit5:${Versions.junitPlugin}"
}

object MainApplicationDependencies {
    const val kotlin                            = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
    const val kotlin8                           = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
    const val kotlinReflect                     = "org.jetbrains.kotlin:kotlin-reflect:${Versions.kotlin}"
    const val kotlinCoroutines                  = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.kotlinCoroutines}"
    const val kotlinCoroutinesAndroid           = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.kotlinCoroutines}"
    const val ktxCore                           = "androidx.core:core-ktx:${Versions.coreKtx}"
    const val viewmodelLifecycle                = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycleViewModelKtx}"
    const val navigation                        = "android.arch.navigation:navigation-fragment-ktx:${Versions.navigationKtx}"
    const val navigationUi                      = "android.arch.navigation:navigation-ui-ktx:${Versions.navigationKtx}"
    const val archComponents                    = "androidx.lifecycle:lifecycle-extensions:${Versions.archComponentsKtx}"
    const val archComponentsCompiler            = "androidx.lifecycle:lifecycle-compiler:${Versions.archComponentsKtx}"
    const val archComponentsCommon              = "androidx.lifecycle:lifecycle-common-java8:${Versions.archComponentsKtx}"
    const val archComponentsRuntime             = "androidx.lifecycle:lifecycle-runtime:${Versions.archComponentsKtx}"
    const val glide                             = "com.github.bumptech.glide:glide:${Versions.glide}"
    const val appCompat                         = "androidx.appcompat:appcompat:${Versions.appCompatKtx}"
    const val multiDex                          = "androidx.multidex:multidex:${Versions.multiDexKtx}"
    const val cardView                          = "androidx.cardview:cardview:${Versions.appCompatKtx}"
    const val constraintLayout                  = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayoutKtx}"
    const val recyclerView                      = "androidx.recyclerview:recyclerview:${Versions.appCompatKtx}"
    const val design                            = "com.google.android.material:material:${Versions.appCompatKtx}"
    const val androidAnnotations                = "androidx.annotation:annotation:${Versions.appCompatKtx}"
    const val daggerCompiler                    = "com.google.dagger:dagger-compiler:${Versions.dagger}"
    const val dagger                            = "com.google.dagger:dagger:${Versions.dagger}"
    const val assistedInjectAnnotations         = "com.squareup.inject:assisted-inject-annotations-dagger2:${Versions.assistedInject}"
    const val assistedInjectProcessor           = "com.squareup.inject:assisted-inject-processor-dagger2:${Versions.assistedInject}"
    const val flexbox                           = "com.google.android:flexbox:${Versions.flexbox}"
    const val retrofit                          = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val retrofitGson                      = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    const val retrofitRxAdapter                 = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit}"
    const val retrofitMoshiConverter             = "com.squareup.retrofit2:converter-moshi:${Versions.retrofit}"
    const val okhttpLoggingInterceptor          = "com.squareup.okhttp3:logging-interceptor:${Versions.okhttp}"
    const val okhttp                            = "com.squareup.okhttp3:okhttp:${Versions.okhttp}"
    const val picasso                           = "com.squareup.picasso:picasso:${Versions.picasso}"
    const val lottie                            = "com.airbnb.android:lottie:${Versions.lottie}"
    const val rxjava2                           = "io.reactivex.rxjava2:rxjava:${Versions.rxjava}"
    const val rxandroid                         = "io.reactivex.rxjava2:rxandroid:${Versions.rxAndroid}"
    const val room                              = "android.arch.persistence.room:runtime:${Versions.room}"
    const val roomRx                            = "android.arch.persistence.room:rxjava2:${Versions.room}"
    const val roomCompiler                      = "android.arch.persistence.room:compiler:${Versions.room}"
    const val archComponentLifeCycleExtensions  = "android.arch.lifecycle:extensions:${Versions.archComponents}"
    const val archComponentLifeCycleCompiler    = "android.arch.lifecycle:compiler:${Versions.archComponents}"
    const val lintapi                           = "com.android.tools.lint:lint-api:${Versions.androidTools}"
    const val lintchecks                        = "com.android.tools.lint:lint-checks:${Versions.androidTools}"
    const val reactiveNetwork                   = "com.github.pwittchen:reactivenetwork-rx2:${Versions.reactiveNetwork}"
    const val jetbrainsAnnotations              = "org.jetbrains:annotations:${Versions.jetbrainsAnnotations}"
    const val mediaRouter                       = "androidx.mediarouter:mediarouter:${Versions.appCompatKtx}"
    const val percentLibrary                    = "androidx.percentlayout:percentlayout:${Versions.appCompatKtx}"
    const val threeTenABp                       = "com.jakewharton.threetenabp:threetenabp:${Versions.threeTenABp}"
    const val playServicesAds                   = "com.google.android.gms:play-services-ads:${Versions.playServices}"
    const val hockeySdk                         = "net.hockeyapp.android:HockeySDK:${Versions.hockeyAppSdkVersion}"
    const val sentry                            = "io.sentry:sentry-android:${Versions.sentryVersion}"
    const val slf4Nop                           = "org.slf4j:slf4j-nop:${Versions.sentryVersion}"
    const val arrowCore                         = "io.arrow-kt:arrow-core:${Versions.arrowVersion}"
}

object UnitTestingDependencies {
    const val kotlin                    = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
    const val kotlinTest                = "org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlin}"
    const val kotlinCoroutineTest       = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.kotlinCoroutines}"
    const val mockitoKotlin             = "com.nhaarman:mockito-kotlin:${Versions.mockitoKotlin}"
    const val robolectric               = "org.robolectric:robolectric:${Versions.robolectric}"
    const val robolectricMultidex       = "org.robolectric:shadows-multidex:${Versions.robolectric}"
    const val junit                     = "junit:junit:${Versions.junit}"
    const val mockito                   = "com.nhaarman.mockitokotlin2:mockito-kotlin:${Versions.mockito}"
    const val archComponentCoreTesting  = "android.arch.core:core-testing:${Versions.archComponents}"
    const val powermockJunit            = "org.powermock:powermock-module-junit4:${Versions.powermock}"
    const val powermockJunitRule        = "org.powermock:powermock-module-junit4-rule:${Versions.powermock}"
    const val powermock                 = "org.powermock:powermock-api-mockito2:${Versions.powermock}"
    const val powermockXstream          = "org.powermock:powermock-classloading-xstream:${Versions.powermock}"
    const val threeTenBp                = "org.threeten:threetenbp:${Versions.threeTenBp}"
    const val archunit                  = "com.tngtech.archunit:archunit:${Versions.archUnit}"
    const val archCore                  = "android.arch.core:core-testing:${Versions.archCore}"
    const val kluent                    = "org.amshove.kluent:kluent:${Versions.kluent}"
    const val kluentAndroid             = "org.amshove.kluent:kluent-android:${Versions.kluent}"
    const val junit5_jupiter            = "org.junit.jupiter:junit-jupiter-api:${Versions.junit5}"
    const val junit5_jupiter_runtime    = "org.junit.jupiter:junit-jupiter-engine:${Versions.junit5}"
    const val junit5_jupiter_params     = "org.junit.jupiter:junit-jupiter-params:${Versions.junit5}"
    const val junit5_vintage            = "org.junit.vintage:junit-vintage-engine:${Versions.junit5}"
    const val assertj                   = "org.assertj:assertj-core:${Versions.assertj}"
    const val mockk                     = "io.mockk:mockk:${Versions.mockk}"
    const val spekDsl                   = "org.spekframework.spek2:spek-dsl-jvm:${Versions.spek}"
    const val spekRunner                = "org.spekframework.spek2:spek-runner-junit5:${Versions.spek}"
}

object AcceptanceTestingDependencies {
    const val testRunner            = "androidx.test:runner:${Versions.runner}"
    const val testRules             = "androidx.test:rules:${Versions.runner}"
    const val espressoCore          = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    const val espressoIntents       = "androidx.test.espresso:espresso-intents:${Versions.espresso}"
    const val espressoContrib       = "androidx.test.espresso:espresso-contrib:${Versions.espresso}"
    const val orchestrator          = "androidx.test:orchestrator:${Versions.orchestrator}"
    const val androidAnnotations    = "androidx.annotation:annotation:${Versions.appCompatKtx}"
    const val mockWebServer         = "com.squareup.okhttp3:mockwebserver:${Versions.okhttp}"
    const val rxIdler               = "com.squareup.rx.idler:rx2-idler:${Versions.rxIdler}"
    const val roomTesting           = "android.arch.persistence.room:testing:${Versions.archComponents}"
}

object DevelopmentDependencies {
    const val leakCanary            = "com.squareup.leakcanary:leakcanary-android:${Versions.leakCanary}"
    const val leakCanaryFragment    = "com.squareup.leakcanary:leakcanary-support-fragment:${Versions.leakCanary}"
    const val leakCanaryNoop        = "com.squareup.leakcanary:leakcanary-android-no-op:${Versions.leakCanary}"
    const val chuck                 = "com.readystatesoftware.chuck:library:${Versions.chuck}"
    const val stetho                = "com.facebook.stetho:stetho:${Versions.stetho}"
    const val stethoOkHttp3         = "com.facebook.stetho:stetho-okhttp3:${Versions.stetho}"
    const val uiAutomator           = "androidx.test.uiautomator:${Versions.androidUiAutomator}"
}

object QualityDependencies {
    const val checkstyle = "com.puppycrawl.tools:checkstyle:${Versions.checkstyle}"
    const val ktlint = "com.github.shyiko:ktlint:${Versions.ktlint}"
}