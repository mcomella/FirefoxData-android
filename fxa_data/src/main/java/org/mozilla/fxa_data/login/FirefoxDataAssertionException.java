/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

package org.mozilla.fxa_data.login;

/**
 * An Exception indicating an Assertion has failed. Semantically equivalent to {@link AssertionError},
 * this is useful when a callback only takes Exception (and its extensions).
 */
class FirefoxDataAssertionException extends Exception {
    FirefoxDataAssertionException(final String message) { super(message); }
    FirefoxDataAssertionException(final String message, final Throwable cause) { super(message, cause); }
}
