# channel-app
Simple app to test Kotlin Channel

**Channel**

<a href="https://github.com/raheemadamboev/channel-app/blob/master/app-debug.apk">Demo app</a>

This app is to test Kotlin Channel. Channel is only one time event. If you use LiveData or StateFlow, when configuration changes the event shown again, so if you wanna show error snackbar, LiveData and StateFlow show it again when configuration changes. Channel is to rescue and easily send events to activity or fragments. So channel makes it easier to do business logic in viewmodels and send event to activity or fragment. So activity or fragment will not make decisions they only update UI as it is planned.

<img src="https://i.imgur.com/wNprwTe.png" alt="Italian Trulli" width="900" height="300">

**Screenshots:**

<img src="https://i.imgur.com/DtB6CDH.jpg" alt="Italian Trulli" width="200" height="434"> <img src="https://i.imgur.com/rz1heaO.jpg" alt="Italian Trulli" width="200" height="434">

**Key points:**

- Kotlin Coroutines
- Viewmodel
- Channel
- Flow
- ViewBinding
