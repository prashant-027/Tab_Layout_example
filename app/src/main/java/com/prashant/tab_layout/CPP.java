package com.prashant.tab_layout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.fragment.app.Fragment;

public class CPP extends Fragment {
    public CPP() {
        // Required empty public constructor
    }
    public WebView WebView_cpp;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_cpp, container, false);
        WebView_cpp = (WebView) v.findViewById(R.id.webview_cpp);
        WebView_cpp.loadUrl("https://tio.run/#cpp-gcc");

        // Enable Javascript
        WebSettings webSettings = WebView_cpp.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Force links and redirects to open in the WebView instead of in a browser
        WebView_cpp.setWebViewClient(new WebViewClient());
        return v;
    }
}