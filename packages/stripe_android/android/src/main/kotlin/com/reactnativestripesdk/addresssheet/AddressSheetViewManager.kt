package com.reactnativestripesdk.addresssheet

import com.facebook.react.bridge.ReadableArrayStripe
import com.facebook.react.bridge.ReadableMapStripe
import com.facebook.react.common.MapBuilder
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.annotations.ReactProp

class AddressSheetViewManager : SimpleViewManager<AddressSheetView>() {
  override fun getName() = "AddressSheetView"

  override fun getExportedCustomDirectEventTypeConstants(): MutableMap<String, Any> {
    return MapBuilder.of(
      AddressSheetEvent.ON_SUBMIT, MapBuilder.of("registrationName", "onSubmitAction"),
      AddressSheetEvent.ON_ERROR, MapBuilder.of("registrationName", "onErrorAction"))
  }

  @ReactProp(name = "visible")
  fun setVisible(view: AddressSheetView, visibility: Boolean) {
    view.setVisible(visibility)
  }

  @ReactProp(name = "appearance")
  fun setAppearance(view: AddressSheetView, appearance: ReadableMapStripe) {
    view.setAppearance(appearance)
  }

  @ReactProp(name = "defaultValues")
  fun setDefaultValues(view: AddressSheetView, defaults: ReadableMapStripe) {
    view.setDefaultValues(defaults)
  }

  @ReactProp(name = "additionalFields")
  fun setAdditionalFields(view: AddressSheetView, fields: ReadableMapStripe) {
    view.setAdditionalFields(fields)
  }

  @ReactProp(name = "allowedCountries")
  fun setAllowedCountries(view: AddressSheetView, countries: ReadableArrayStripe) {
    view.setAllowedCountries(countries.toArrayList().filterIsInstance<String>())
  }

  @ReactProp(name = "autocompleteCountries")
  fun setAutocompleteCountries(view: AddressSheetView, countries: ReadableArrayStripe) {
    view.setAutocompleteCountries(countries.toArrayList().filterIsInstance<String>())
  }

  @ReactProp(name = "primaryButtonTitle")
  fun setPrimaryButtonTitle(view: AddressSheetView, title: String) {
    view.setPrimaryButtonTitle(title)
  }

  @ReactProp(name = "sheetTitle")
  fun setSheetTitle(view: AddressSheetView, title: String) {
    view.setSheetTitle(title)
  }

  @ReactProp(name = "googlePlacesApiKey")
  fun setGooglePlacesApiKey(view: AddressSheetView, key: String) {
    view.setGooglePlacesApiKey(key)
  }

  override fun createViewInstance(reactContext: ThemedReactContext): AddressSheetView {
    return AddressSheetView(reactContext)
  }
}
