# (weather) Android Clean Architecture 
WeatherAPI.com é um poderoso provedor gratuito de API de clima e geolocalização totalmente gerenciado
que fornece extensas APIs que vão desde a previsão do tempo, clima histórico, clima futuro,
alertas meteorológicos, dados de qualidade do ar, pesquisa de IP e astronomia até esportes, fuso horário e geolocalização.

### ⚠️NOTE
Este App está em construção o intuito é sair da minha zona de conforto e utilizar as stacks mas recentes do android neste projeto, evoluir e atualizar.
com um arquitetura escálavel e introduzir vários conceitos de build, CI/CD, Test, etc

## Built With 🛠
- [Kotlin](https://kotlinlang.org/) - Linguagem oficial recomendado para desenvolvimento android e bem manera de desenvolver cheios de açucares que facilita a vida do dev .
- [Coroutines](https://kotlinlang.org/docs/reference/coroutines-overview.html) - Para trabalhar com dados asincronos.
- [Flow](https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines.flow/-flow/) - Fluxo de dados para emitir valores sequencialmente.
- [Compose](https://developer.android.com/jetpack) - O Jetpack Compose é um kit de ferramentas moderno para criar IUs nativas

- [Android Architecture Components](https://developer.android.com/topic/libraries/architecture) - Coleção de bibliotecas que ajudam você a projetar aplicativos robustos, testáveis e sustentáveis.
    - [LiveData](https://developer.android.com/topic/libraries/architecture/livedata) - Objetos de dados que notificam exibições quando o banco de dados subjacente é alterado.
    - [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel) - Stores UI-related data that isn't destroyed on UI changes.
- [Dependency Injection](https://developer.android.com/training/dependency-injection)
    - [Hilt](https://dagger.dev/hilt) - roda em cima do dagger bem facil de utilizar e intuitiva.
- [Retrofit](https://square.github.io/retrofit/) - Para requisições HTTP em Android integração com Kotlin e Java.
- [Mockito](https://github.com/mockito/mockito) - Para mock e criar testes unitários