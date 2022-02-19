/*
 * This file is part of the Scandit Data Capture SDK
 *
 * Copyright (C) 2019- Scandit AG. All rights reserved.
 */

package com.scandit.capacitor.datacapture.core.data.defaults

import com.scandit.capacitor.datacapture.core.data.SerializableData
import com.scandit.capacitor.datacapture.core.testing.OpenForTesting
import org.json.JSONArray
import org.json.JSONObject

@OpenForTesting
data class SerializableCameraDefaults(
    private val cameraSettingsDefault: SerializableCameraSettingsDefault,
    private val defaultPosition: String?,
    private val availablePositions: JSONArray
) : SerializableData {

    override fun toJson(): JSONObject = JSONObject(
        mapOf(
            FIELD_CAMERA_SETTINGS_DEFAULTS to cameraSettingsDefault.toJson(),
            FIELD_DEFAULT_POSITION to defaultPosition,
            FIELD_AVAILABLE_POSITIONS to availablePositions
        )
    )

    companion object {
        private const val FIELD_CAMERA_SETTINGS_DEFAULTS = "Settings"
        private const val FIELD_DEFAULT_POSITION = "defaultPosition"
        private const val FIELD_AVAILABLE_POSITIONS = "availablePositions"
    }
}
