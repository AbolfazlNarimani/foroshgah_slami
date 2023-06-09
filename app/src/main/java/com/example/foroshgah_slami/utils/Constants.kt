package com.example.foroshgah_slami.utils

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.provider.MediaStore
import android.webkit.MimeTypeMap

object Constants {
    const val USERS: String = "users"
    const val MYSHOPPAL_PREFERENCES: String = "MayShopPalPrefs"
    const val LOGGED_IN_USERNAME: String = "logged_in_username"
    const val EXTRA_USER_DETAILS: String = "extra_user_details"
    const val READ_STORAGE_PERMISSION_CODE = 2
    const val PICK_IMAGE_REQUEST_CODE = 1
    const val MALE: String = "male"
    const val FEMALE: String = "female"
    const val MOBILE: String = "mobile"
    const val GENDER: String = "gender"
    const val IMAGE: String = "image"
    const val USER_PROFILE_IMAGE: String = "user_profile_image"
    const val COMPLETE_PROFILE: String = "profileCompleted"
    const val FIRST_NAME: String = "firstName"
    const val LAST_NAME: String = "lastName"

    fun showImageChooser(activity: Activity) {
        // An internal for launching the image selection of phone storage
        val galleryIntent = Intent(
            Intent.ACTION_PICK,
            MediaStore.Images.Media.EXTERNAL_CONTENT_URI
        )
        // Lunches the image selection of phone storage using the constant code
        activity.startActivityForResult(galleryIntent, PICK_IMAGE_REQUEST_CODE)
    }


    fun getFileExtension(activity: Activity, uri: Uri?): String? {
        /*
        * MimetypeMap : Tow_way map that maps MIME_types to file extensions and vice versa.
        *
        * getSingleton(): Get the singleton instance of MimeTypeMap.
        *
        * getExtensionFromMimeType: Return the registered extensions for the given MIME type.
        *
        * contentResolver.getType: Return the MIME type of the given content URL.
        */
        return MimeTypeMap.getSingleton()
            .getExtensionFromMimeType(activity.contentResolver.getType(uri!!))
    }
}