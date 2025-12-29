package com.mildlytv.iptvbox;
import android.os.Bundle;
import android.webkit.*;
import android.net.http.SslError;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WebView webView = new WebView(this);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public void onReceivedSslError(WebView v, SslErrorHandler h, SslError e) { h.proceed(); }
        });
        setContentView(webView);
        webView.loadUrl("http://bore.pub:35130/MildlyTV/login.jsp");
    }
}
