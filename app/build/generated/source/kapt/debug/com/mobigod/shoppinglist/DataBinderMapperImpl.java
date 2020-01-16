package com.mobigod.shoppinglist;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.mobigod.shoppinglist.databinding.ActivityHomeBindingImpl;
import com.mobigod.shoppinglist.databinding.ActivityStartBindingImpl;
import com.mobigod.shoppinglist.databinding.AddShoppingListBindingImpl;
import com.mobigod.shoppinglist.databinding.ShoppingItemBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYHOME = 1;

  private static final int LAYOUT_ACTIVITYSTART = 2;

  private static final int LAYOUT_ADDSHOPPINGLIST = 3;

  private static final int LAYOUT_SHOPPINGITEM = 4;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(4);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.mobigod.shoppinglist.R.layout.activity_home, LAYOUT_ACTIVITYHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.mobigod.shoppinglist.R.layout.activity_start, LAYOUT_ACTIVITYSTART);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.mobigod.shoppinglist.R.layout.add_shopping_list, LAYOUT_ADDSHOPPINGLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.mobigod.shoppinglist.R.layout.shopping_item, LAYOUT_SHOPPINGITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYHOME: {
          if ("layout/activity_home_0".equals(tag)) {
            return new ActivityHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_home is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSTART: {
          if ("layout/activity_start_0".equals(tag)) {
            return new ActivityStartBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_start is invalid. Received: " + tag);
        }
        case  LAYOUT_ADDSHOPPINGLIST: {
          if ("layout/add_shopping_list_0".equals(tag)) {
            return new AddShoppingListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for add_shopping_list is invalid. Received: " + tag);
        }
        case  LAYOUT_SHOPPINGITEM: {
          if ("layout/shopping_item_0".equals(tag)) {
            return new ShoppingItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for shopping_item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(2);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "shopItem");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(4);

    static {
      sKeys.put("layout/activity_home_0", com.mobigod.shoppinglist.R.layout.activity_home);
      sKeys.put("layout/activity_start_0", com.mobigod.shoppinglist.R.layout.activity_start);
      sKeys.put("layout/add_shopping_list_0", com.mobigod.shoppinglist.R.layout.add_shopping_list);
      sKeys.put("layout/shopping_item_0", com.mobigod.shoppinglist.R.layout.shopping_item);
    }
  }
}
