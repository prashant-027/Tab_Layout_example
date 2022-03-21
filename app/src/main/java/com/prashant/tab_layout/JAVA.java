package com.prashant.tab_layout;

import android.os.Bundle;
//import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.fragment.app.Fragment;

public class JAVA extends Fragment {
    public JAVA() {
        // Required empty public constructor
    }
    public WebView WebView_java;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_java, container, false);
        WebView_java = (WebView) v.findViewById(R.id.webview_java);
        WebView_java.loadUrl("https://tio.run/#java-jdk");

        // Enable Javascript
        WebSettings webSettings = WebView_java.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Force links and redirects to open in the WebView instead of in a browser
        WebView_java.setWebViewClient(new WebViewClient());
        return v;
    }
}