package rs.rocketbyte.limbo.ext

import android.content.Context
import android.content.pm.PackageManager
import android.content.res.Configuration.UI_MODE_NIGHT_MASK
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.core.content.ContextCompat

fun Context.isLimbo(): Boolean = true

fun Context.isPermissionGranted(permission: String): Boolean =
    ContextCompat.checkSelfPermission(this, permission) == PackageManager.PERMISSION_GRANTED

fun Context.isDarkModeActive(): Boolean =
    (resources.configuration.uiMode and UI_MODE_NIGHT_MASK) == UI_MODE_NIGHT_YES