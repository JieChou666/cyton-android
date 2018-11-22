package org.nervos.neuron.plugin;

import android.content.Context;
import android.content.Intent;
import android.webkit.JavascriptInterface;

import org.nervos.neuron.activity.AddWebsiteActivity;
import org.nervos.neuron.activity.colleactWebsite.CollectWebsiteActivity;

public class AppTabPlugin {

    private Context mContext;

    public AppTabPlugin(Context context) {
        mContext = context;
    }

    public void toWebCollection() {
        mContext.startActivity(new Intent(mContext, CollectWebsiteActivity.class));
    }

}
