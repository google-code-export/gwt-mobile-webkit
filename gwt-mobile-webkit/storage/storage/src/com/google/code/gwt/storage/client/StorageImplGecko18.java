/*
 * Copyright 2009 Bart Guijt and others.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.google.code.gwt.storage.client;

/**
 * Firefox-specific implementation of a Storage.
 * 
 * @author bguijt
 */
public class StorageImplGecko18 extends StorageImpl {

  @Override
  public native void clear(Storage storage) /*-{
    if (storage == $wnd.localStorage) {
      storage.clear();
    } else {
      for (var i=storage.length; i--; i>=0) {
        storage.removeItem(storage.key(i));
      }
    }
  }-*/;
}
