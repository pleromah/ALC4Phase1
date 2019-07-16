package com.example.alc4phase1;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class AboutALC extends AppCompatActivity {

    //private WebView webView;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);
        //this.setTitle("About ALC");

        // initiate a web view
        WebView simpleWebView=(WebView) findViewById(R.id.webView1);
        simpleWebView.getSettings().setJavaScriptEnabled(true);
        simpleWebView.setWebViewClient(new WebViewClient());
        // specify the url of the web page in loadUrl function
        simpleWebView.loadUrl("https://andela.com/alc/");
        //setContentView(simpleWebView );


    }

}
