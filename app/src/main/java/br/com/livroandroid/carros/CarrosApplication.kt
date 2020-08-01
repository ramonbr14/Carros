package br.com.livroandroid.carros

import android.app.Application
import android.util.Log

class CarrosApplication : Application(){
    private val TAG = "CarrosApplication"
    //Chamado quando o Android cria o processo do App PAG 214
    override fun onCreate() {
        super.onCreate()
            //Salva a instancia para termos acesso como singleton
            appInstance = this
        }
    companion object {
           //Singleton da Classe Application
            private var appInstance: CarrosApplication? = null
            fun getInstance(): CarrosApplication {
                if(appInstance == null){
                    throw IllegalStateException("Configure a classe de application no AndroidManifest.xml")
                }
                return appInstance!!
            }
        }
        // Chamado quando o android finaliza o processo do Aplicativo
        override fun onTerminate(){
           super.onTerminate()
            Log.d(TAG,"CarrosApplication.onTerminate()")
        }
    }
