/*
 * Copyright (c) 2002-2024 Gargoyle Software Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.htmlunit.javascript.host.media;

import static org.htmlunit.javascript.configuration.SupportedBrowser.CHROME;
import static org.htmlunit.javascript.configuration.SupportedBrowser.EDGE;
import static org.htmlunit.javascript.configuration.SupportedBrowser.FF;
import static org.htmlunit.javascript.configuration.SupportedBrowser.FF_ESR;
import static org.htmlunit.javascript.configuration.SupportedBrowser.IE;

import org.htmlunit.javascript.configuration.JsxClass;
import org.htmlunit.javascript.configuration.JsxConstant;
import org.htmlunit.javascript.configuration.JsxConstructor;
import org.htmlunit.javascript.host.event.EventTarget;

/**
 * A JavaScript object for {@code TextTrack}.
 *
 * @author Ahmed Ashour
 * @author Ronald Brill
 */
@JsxClass
public class TextTrack extends EventTarget {

    /** Constant for {@code NONE}. */
    @JsxConstant(IE)
    public static final int NONE = 0;
    /** Constant for {@code LOADING}. */
    @JsxConstant(IE)
    public static final int LOADING = 1;
    /** Constant for {@code LOADED}. */
    @JsxConstant(IE)
    public static final int LOADED = 2;
    /** Constant for {@code ERROR}. */
    @JsxConstant(IE)
    public static final int ERROR = 3;
    /** Constant for {@code DISABLED}. */
    @JsxConstant(IE)
    public static final int DISABLED = 0;
    /** Constant for {@code HIDDEN}. */
    @JsxConstant(IE)
    public static final int HIDDEN = 1;
    /** Constant for {@code SHOWING}. */
    @JsxConstant(IE)
    public static final int SHOWING = 2;

    /**
     * Creates an instance.
     */
    public TextTrack() {
    }

    /**
     * JavaScript constructor.
     */
    @Override
    @JsxConstructor({CHROME, EDGE, FF, FF_ESR})
    public void jsConstructor() {
        super.jsConstructor();
    }
}
