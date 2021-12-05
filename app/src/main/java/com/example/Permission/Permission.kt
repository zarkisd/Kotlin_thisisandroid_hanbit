package com.example.Permission

import android.Manifest
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.example.basicsyntax.R
import com.example.basicsyntax.databinding.ActivityMainBinding
import com.example.basicsyntax.databinding.ActivityPermissionBinding

class Permission : AppCompatActivity() {

    val binding by lazy { ActivityPermissionBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        initLayout()
    }

    fun initLayout() {
        binding.btnCheck.setOnClickListener {
            initialize()
        }
    }

    private fun initialize() {

        val cameraPermission = ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA)
        if (cameraPermission == PackageManager.PERMISSION_GRANTED) {
            Log.d("Tag", "permission grant")
            startProcess()
        } else {
            Log.d("Tag", "permission no")
            requestPermission()
        }

    }

    private fun startProcess() {
        binding.text1.text = "test finish"
    }

    fun requestPermission() {
        ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.CAMERA), 99)
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        when (requestCode) {
            99 -> {
                if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    startProcess()
                } else {
                    finish()
                }
            }
        }
    }
}