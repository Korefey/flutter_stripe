package com.reactnativestripesdk

import com.facebook.react.uimanager.SimpleViewManagerStripe
import com.facebook.react.uimanager.ThemedReactContextStripe
import com.facebook.react.uimanager.annotations.ReactPropStripe

class GooglePayButtonManager : SimpleViewManagerStripe<GooglePayButtonView?>() {
  override fun getName(): String {
    return REACT_CLASS
  }

  override fun onAfterUpdateTransaction(view: GooglePayButtonView) {
    super.onAfterUpdateTransaction(view)

    view.initialize()
  }

  @ReactPropStripe(name = "type")
  fun type(view: GooglePayButtonView, buttonType: Int) {
    view.setType(buttonType)
  }

  @ReactPropStripe(name = "appearance")
  fun appearance(view: GooglePayButtonView, appearance: Int) {
    view.setAppearance(appearance)
  }

  @ReactPropStripe(name = "borderRadius")
  fun borderRadius(view: GooglePayButtonView, borderRadius: Int) {
    view.setBorderRadius(borderRadius)
  }

  override fun createViewInstance(reactContext: ThemedReactContextStripe): GooglePayButtonView {
    return GooglePayButtonView(reactContext)
  }

  companion object {
    const val REACT_CLASS = "GooglePayButton"
  }
}
