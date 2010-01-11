/*
 * Copyright 2010 Bart Guijt and others.
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

package com.google.code.gwt.geolocation.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Represents the Google Gears Factory class.
 * 
 * @author bguijt
 * 
 * @see <a href="http://code.google.com/apis/gears/api_factory.html">Google Gears Factory</a>
 */
public final class GearsFactory extends JavaScriptObject {

  protected GearsFactory() {
  }
  
  /**
   * Returns an instance of the Gears factory.
   * 
   * <p>Most of this code is from <code>gears_init.js</code>.</p>
   */
  public native static GearsFactory getInstance() /*-{
    // We are already defined. Hooray!
    // Mind you: We're *not* using $wnd on purpose here!
    if (window.google && google.gears) {
      return google.gears.factory;
    }
  
    var factory = null;
  
    // Firefox
    if (typeof GearsFactory != "undefined") {
      factory = new GearsFactory();
    } else {
      // IE
      try {
        factory = new ActiveXObject("Gears.Factory");
        // privateSetGlobalObject is only required and supported on IE Mobile on
        // WinCE.
        if (factory.getBuildInfo().indexOf("ie_mobile") != -1) {
          factory.privateSetGlobalObject(this);
        }
      } catch (e) {
        // Safari
        if ((typeof navigator.mimeTypes != "undefined")
             && navigator.mimeTypes["application/x-googlegears"]) {
          factory = document.createElement("object");
          factory.style.display = "none";
          factory.width = 0;
          factory.height = 0;
          factory.type = "application/x-googlegears";
          document.documentElement.appendChild(factory);
        }
      }
    }
  
    // *Do not* define any objects if Gears is not installed. This mimics the
    // behavior of Gears defining the objects in the future.
    if (!factory) {
      return null;
    }
  
    // Now set up the objects, being careful not to overwrite anything.
    //
    // Note: In Internet Explorer for Windows Mobile, you can't add properties to
    // the window object. However, global objects are automatically added as
    // properties of the window object in all browsers.
    if (!window.google) {
      google = {};
    }
  
    if (!google.gears) {
      google.gears = {factory: factory};
    }
    
    return factory;
  }-*/;
  
  public native Geolocation createGeolocation() /*-{
    return this.create("beta.geolocation");
  }-*/;

  public native String getVersion() /*-{
    return this.version;
  }-*/;
  
  public native String getBuildInfo() /*-{
    return this.getBuildInfo();
  }-*/;
}
