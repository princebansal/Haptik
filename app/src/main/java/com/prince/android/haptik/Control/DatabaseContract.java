/*
 * Copyright (c) 2016. Created by Prince Bansal on 16-08-2016.
 */

package com.prince.android.haptik.Control;

import android.net.Uri;


public class DatabaseContract {


    //Content Types
    public static final String CONTENT_TYPE_DIR_MESSAGE = "com.prince.android.cursor.dir/haptik.message";
    public static final String CONTENT_ITEM_TYPE_MESSAGE = "com.prince.android.cursor.item/haptik.message";

    public static final String AUTHORITY = "com.prince.android.provider";
    // content://<authority>/<path to type>
    public static final Uri CONTENT_URI_MESSAGE = Uri.parse("content://" + AUTHORITY + "/messages");


}
