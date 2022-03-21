package com.prashant.tab_layout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.fragment.app.Fragment;

public class C extends Fragment {
    public C() {
        // Required empty public constructor
    }
    public WebView WebView_c;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.fragment_c, container, false);
        WebView_c = (WebView) v.findViewById(R.id.webview_c);
        WebView_c.loadUrl("https://tio.run/#c-gcc");

        // Enable Javascript
        WebSettings webSettings = WebView_c.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Force links and redirects to open in the WebView instead of in a browser
        WebView_c.setWebViewClient(new WebViewClient());
        return v;
    }
}