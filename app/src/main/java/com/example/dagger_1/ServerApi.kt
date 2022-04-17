package com.example.dagger_1

import dagger.assisted.Assisted
import dagger.assisted.AssistedInject

class ServerApi @AssistedInject constructor(val networkUtils: NetworkUtils, @Assisted val host: String) {

}
