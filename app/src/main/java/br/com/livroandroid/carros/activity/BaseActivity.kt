package br.com.livroandroid.carros.activity

import android.annotation.SuppressLint
import android.content.Context
import android.support.v7.app.AppCompatActivity

@SuppressLint("Registered")

open class BaseActivity : AppCompatActivity(){
    // Pagina 212
    protected val context: Context get() = this
    //MEtodos comuns a todas as activitys

}