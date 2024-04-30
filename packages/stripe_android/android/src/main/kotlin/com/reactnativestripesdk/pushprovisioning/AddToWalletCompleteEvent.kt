package com.reactnativestripesdk.pushprovisioning
import com.facebook.react.bridge.WritableMapStripe
import com.facebook.react.uimanager.events.Event
import com.facebook.react.uimanager.events.RCTEventEmitter

internal class AddToWalletCompleteEvent constructor(viewTag: Int, private val error: WritableMapStripe?) : Event<AddToWalletCompleteEvent>(viewTag) {
  override fun getEventName(): String {
    return EVENT_NAME
  }

  override fun dispatch(rctEventEmitter: RCTEventEmitter) {
    rctEventEmitter.receiveEvent(viewTag, eventName, serializeEventData())
  }

  private fun serializeEventData(): WritableMapStripe? {
    return error
  }

  companion object {
    const val EVENT_NAME = "onCompleteAction"
  }
}
