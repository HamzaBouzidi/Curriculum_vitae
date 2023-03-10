package com.example.curriculumvitaev2

import android.content.Context
import android.view.inputmethod.InputMethodManager
import android.widget.EditText

fun EditText.on(actionId: Int, func: () -> Unit) {
    setOnEditorActionListener { _, receivedActionId, _ ->

        if (actionId == receivedActionId) func()

        true
    }
}

fun EditText.hideKeyboard() {
    val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    imm.hideSoftInputFromWindow(this.windowToken, 0)
}