package com.mapbox.services.android.navigation.v5.navigation;

import okhttp3.Call;
import okhttp3.EventListener;

class NavigationRouteEventListener extends EventListener {

  private final ElapsedTime time;

  NavigationRouteEventListener() {
    this(new ElapsedTime());
  }

  NavigationRouteEventListener(ElapsedTime time) {
    this.time = time;
  }

  @Override
  public void callStart(Call call) {
    super.callStart(call);
    time.start();
  }

  @Override
  public void callEnd(Call call) {
    super.callEnd(call);
    time.end();
  }

  ElapsedTime getTime() {
    return time;
  }
}