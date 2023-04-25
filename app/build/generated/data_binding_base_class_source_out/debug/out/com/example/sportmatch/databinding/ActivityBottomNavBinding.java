// Generated by view binder compiler. Do not edit!
package com.example.sportmatch.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.sportmatch.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityBottomNavBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final BottomNavigationView bottomNavigationView;

  @NonNull
  public final RecyclerView mainRecycler;

  @NonNull
  public final TextView textView;

  private ActivityBottomNavBinding(@NonNull RelativeLayout rootView,
      @NonNull BottomNavigationView bottomNavigationView, @NonNull RecyclerView mainRecycler,
      @NonNull TextView textView) {
    this.rootView = rootView;
    this.bottomNavigationView = bottomNavigationView;
    this.mainRecycler = mainRecycler;
    this.textView = textView;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityBottomNavBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityBottomNavBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_bottom_nav, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityBottomNavBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bottomNavigationView;
      BottomNavigationView bottomNavigationView = ViewBindings.findChildViewById(rootView, id);
      if (bottomNavigationView == null) {
        break missingId;
      }

      id = R.id.main_recycler;
      RecyclerView mainRecycler = ViewBindings.findChildViewById(rootView, id);
      if (mainRecycler == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      return new ActivityBottomNavBinding((RelativeLayout) rootView, bottomNavigationView,
          mainRecycler, textView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
