package com.facebook.react.uimanager

import com.facebook.react.uimanager.events.Event
import com.facebook.react.uimanager.events.EventDispatcherStripe
import com.facebook.react.uimanager.events.RCTEventEmitterStripe
import io.flutter.plugin.common.MethodChannel

class UIManagerModuleStripe(channel: MethodChannel) {

    private val rctInstance: RCTEventEmitterStripe = RCTEventEmitterStripe(channel)

    val eventDispatcher: EventDispatcherStripe = object : EventDispatcherStripe {
        override fun dispatchEvent(event: Event<*>) {
            event.dispatch(rctInstance)
        }
    }
}
