/*
 * Copyright (c) 2015 Ennova S.r.l.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 * documentation files (the "Software"), to deal in the Software without restriction including without limitation
 * the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software,
 * and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions
 *  of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT
 * NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 * IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package it.ennova.rxwifi;

import android.support.annotation.NonNull;

import it.ennova.rxwifi.internals.WifiFrequency;

/**
 * This class represents the minimum amount of information needed for showing the different networks
 * on a graph
 */
public class WiFiNetwork {

    private final String SSID;
    private final String BSSID;
    private final String capabilities;
    private final int channel;
    private final int strength;
    private final WifiFrequency frequency;

    public WiFiNetwork(@NonNull String SSID, @NonNull String BSSID, @NonNull String capabilities,
                       int channel, int strength, WifiFrequency frequency) {

        this.SSID = SSID;
        this.BSSID = BSSID;
        this.capabilities = capabilities;
        this.channel = channel;
        this.strength = strength;
        this.frequency = frequency;
    }

    @NonNull
    public String getSSID() {
        return SSID;
    }

    @NonNull
    public String getBSSID() {
        return BSSID;
    }

    @NonNull
    public String getCapabilities() {
        return capabilities;
    }

    public int getChannel() {
        return channel;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WiFiNetwork that = (WiFiNetwork) o;

        return BSSID.equals(that.BSSID);

    }

    @Override
    public int hashCode() {
        return BSSID.hashCode();
    }

    @Override
    public String toString() {
        return "WiFiNetwork{" +
                "SSID='" + SSID + '\'' +
                ", BSSID='" + BSSID + '\'' +
                ", capabilities='" + capabilities + '\'' +
                ", channel=" + channel +
                ", strength=" + strength +
                ", frequency=" + frequency +
                '}';
    }
}
