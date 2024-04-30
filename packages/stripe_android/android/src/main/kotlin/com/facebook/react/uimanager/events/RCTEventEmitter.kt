package com.facebook.react.uimanager.events

import com.facebook.react.bridge.WritableMapStripe
import io.flutter.plugin.common.MethodChannel

class RCTEventEmitter(private val channel: MethodChannel) {

    fun receiveEvent(viewTag: Any, eventName: String, serializeEventData: WritableMapStripe?) {
        channel.invokeMethod(eventName, serializeEventData)
    }
}
