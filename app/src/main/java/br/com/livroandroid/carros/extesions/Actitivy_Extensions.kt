package br.com.livroandroid.carros.extesions

import android.app.Activity
import android.support.annotation.IdRes
import android.support.annotation.StringRes
import android.support.v4.app.Fragment
import android.support.v7.app.ActionBar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.View
//import android.view.View
import android.widget.Toast
//import android.widget.Toolbar

// findViewById + setOnclickListener

fun AppCompatActivity.onClick(@IdRes viewId: Int, onClick: (v: android.view.View?) -> Unit) {
    val view = findViewById<View>(viewId)
    view.setOnClickListener { onClick(it)}
}
//Mostra um Toast

fun Activity.toast(message: CharSequence,  lenght: Int = Toast.LENGTH_SHORT) = Toast.makeText(this, message, lenght).show()
fun Activity.toast(@StringRes message: Int, lenght: Int = Toast.LENGTH_SHORT) = Toast.makeText(this, message, lenght).show()

//Configura a Toalbar

fun AppCompatActivity.setupToolbar(@IdRes id: Int, title: String? = null, upNavigation: Boolean = false): ActionBar {
 val toolbar = findViewById<Toolbar>(id)
    setSupportActionBar(toolbar)
    if( title != null) {
        supportActionBar?.title = title
    }
    supportActionBar?.setDisplayHomeAsUpEnabled(upNavigation)
    return supportActionBar!!
}
// Adiciona o fragmento no layout

fun AppCompatActivity.addFragment(@IdRes layoutId: Int, fragment: Fragment){
    fragment.arguments = intent.extras
    val ft = supportFragmentManager.beginTransaction()
    ft.add(layoutId,fragment)
    ft.commit()
}


