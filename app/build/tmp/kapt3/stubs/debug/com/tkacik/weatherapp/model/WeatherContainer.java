package com.tkacik.weatherapp.model;

import java.lang.System;

@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0002\u0010\u0016J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0015H\u00c6\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\u000b\u0010/\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010!J\u000b\u00102\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\u0011\u00105\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012H\u00c6\u0003J\u008c\u0001\u00106\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u00c6\u0001\u00a2\u0006\u0002\u00107J\t\u00108\u001a\u00020\u0005H\u00d6\u0001J\u0013\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010<H\u00d6\u0003J\t\u0010=\u001a\u00020\u0005H\u00d6\u0001J\t\u0010>\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020\u0005H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0013\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\'\u0010\u001aR\u0019\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+\u00a8\u0006D"}, d2 = {"Lcom/tkacik/weatherapp/model/WeatherContainer;", "Landroid/os/Parcelable;", "clouds", "Lcom/tkacik/weatherapp/model/Clouds;", "dt", "", "dtTxt", "", "main", "Lcom/tkacik/weatherapp/model/Main;", "pop", "", "rain", "Lcom/tkacik/weatherapp/model/Rain;", "sys", "Lcom/tkacik/weatherapp/model/Sys;", "visibility", "weather", "", "Lcom/tkacik/weatherapp/model/Weather;", "wind", "Lcom/tkacik/weatherapp/model/Wind;", "(Lcom/tkacik/weatherapp/model/Clouds;Ljava/lang/Integer;Ljava/lang/String;Lcom/tkacik/weatherapp/model/Main;Ljava/lang/Double;Lcom/tkacik/weatherapp/model/Rain;Lcom/tkacik/weatherapp/model/Sys;Ljava/lang/Integer;Ljava/util/List;Lcom/tkacik/weatherapp/model/Wind;)V", "getClouds", "()Lcom/tkacik/weatherapp/model/Clouds;", "getDt", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDtTxt", "()Ljava/lang/String;", "getMain", "()Lcom/tkacik/weatherapp/model/Main;", "getPop", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getRain", "()Lcom/tkacik/weatherapp/model/Rain;", "getSys", "()Lcom/tkacik/weatherapp/model/Sys;", "getVisibility", "getWeather", "()Ljava/util/List;", "getWind", "()Lcom/tkacik/weatherapp/model/Wind;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/tkacik/weatherapp/model/Clouds;Ljava/lang/Integer;Ljava/lang/String;Lcom/tkacik/weatherapp/model/Main;Ljava/lang/Double;Lcom/tkacik/weatherapp/model/Rain;Lcom/tkacik/weatherapp/model/Sys;Ljava/lang/Integer;Ljava/util/List;Lcom/tkacik/weatherapp/model/Wind;)Lcom/tkacik/weatherapp/model/WeatherContainer;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class WeatherContainer implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable()
    private final com.tkacik.weatherapp.model.Clouds clouds = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer dt = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "dt_txt")
    private final java.lang.String dtTxt = null;
    @org.jetbrains.annotations.Nullable()
    private final com.tkacik.weatherapp.model.Main main = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double pop = null;
    @org.jetbrains.annotations.Nullable()
    private final com.tkacik.weatherapp.model.Rain rain = null;
    @org.jetbrains.annotations.Nullable()
    private final com.tkacik.weatherapp.model.Sys sys = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer visibility = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.tkacik.weatherapp.model.Weather> weather = null;
    @org.jetbrains.annotations.Nullable()
    private final com.tkacik.weatherapp.model.Wind wind = null;
    public static final android.os.Parcelable.Creator<com.tkacik.weatherapp.model.WeatherContainer> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.tkacik.weatherapp.model.WeatherContainer copy(@org.jetbrains.annotations.Nullable()
    com.tkacik.weatherapp.model.Clouds clouds, @org.jetbrains.annotations.Nullable()
    java.lang.Integer dt, @org.jetbrains.annotations.Nullable()
    java.lang.String dtTxt, @org.jetbrains.annotations.Nullable()
    com.tkacik.weatherapp.model.Main main, @org.jetbrains.annotations.Nullable()
    java.lang.Double pop, @org.jetbrains.annotations.Nullable()
    com.tkacik.weatherapp.model.Rain rain, @org.jetbrains.annotations.Nullable()
    com.tkacik.weatherapp.model.Sys sys, @org.jetbrains.annotations.Nullable()
    java.lang.Integer visibility, @org.jetbrains.annotations.Nullable()
    java.util.List<com.tkacik.weatherapp.model.Weather> weather, @org.jetbrains.annotations.Nullable()
    com.tkacik.weatherapp.model.Wind wind) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public WeatherContainer() {
        super();
    }
    
    public WeatherContainer(@org.jetbrains.annotations.Nullable()
    com.tkacik.weatherapp.model.Clouds clouds, @org.jetbrains.annotations.Nullable()
    java.lang.Integer dt, @org.jetbrains.annotations.Nullable()
    java.lang.String dtTxt, @org.jetbrains.annotations.Nullable()
    com.tkacik.weatherapp.model.Main main, @org.jetbrains.annotations.Nullable()
    java.lang.Double pop, @org.jetbrains.annotations.Nullable()
    com.tkacik.weatherapp.model.Rain rain, @org.jetbrains.annotations.Nullable()
    com.tkacik.weatherapp.model.Sys sys, @org.jetbrains.annotations.Nullable()
    java.lang.Integer visibility, @org.jetbrains.annotations.Nullable()
    java.util.List<com.tkacik.weatherapp.model.Weather> weather, @org.jetbrains.annotations.Nullable()
    com.tkacik.weatherapp.model.Wind wind) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tkacik.weatherapp.model.Clouds component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tkacik.weatherapp.model.Clouds getClouds() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getDt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDtTxt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tkacik.weatherapp.model.Main component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tkacik.weatherapp.model.Main getMain() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getPop() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tkacik.weatherapp.model.Rain component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tkacik.weatherapp.model.Rain getRain() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tkacik.weatherapp.model.Sys component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tkacik.weatherapp.model.Sys getSys() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getVisibility() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.tkacik.weatherapp.model.Weather> component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.tkacik.weatherapp.model.Weather> getWeather() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tkacik.weatherapp.model.Wind component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tkacik.weatherapp.model.Wind getWind() {
        return null;
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<com.tkacik.weatherapp.model.WeatherContainer> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.tkacik.weatherapp.model.WeatherContainer createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.tkacik.weatherapp.model.WeatherContainer[] newArray(int size) {
            return null;
        }
    }
}