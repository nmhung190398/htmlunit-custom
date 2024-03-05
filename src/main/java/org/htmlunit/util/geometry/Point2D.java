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
package org.htmlunit.util.geometry;

/**
 * Simple 2D point.
 *
 * @author Ronald Brill
 */
public class Point2D {
    private final double myX_;
    private final double myY_;

    public Point2D(final double x, final double y) {
        myX_ = x;
        myY_ = y;
    }

    public double getX() {
        return myX_;
    }

    public double getY() {
        return myY_;
    }

    @Override
    public String toString() {
        return "Point2D (" + myX_ + ", " + myY_ + ")";
    }
}
