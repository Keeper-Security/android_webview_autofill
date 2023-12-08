package com.keepersecurity.webviewtest

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebViewClient
import com.keepersecurity.webviewtest.databinding.WebviewLayoutBinding

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = WebviewLayoutBinding.inflate(layoutInflater)

        binding.webview.loadUrl("https://facebook.com")
        val webSettings: WebSettings = binding.webview.settings
        binding.webview.webViewClient = WebViewClient()
        webSettings.javaScriptEnabled = true

        setContentView(binding.root)
    }
}