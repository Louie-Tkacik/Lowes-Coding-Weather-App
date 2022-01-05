package com.tkacik.weatherapp.model;

import java.lang.System;

@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\"\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0012J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0012J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0012J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0012J\u0010\u0010 \u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010!\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010\"\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010#\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJz\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010%J\t\u0010&\u001a\u00020\u0005H\u00d6\u0001J\u0013\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u00d6\u0003J\t\u0010+\u001a\u00020\u0005H\u00d6\u0001J\t\u0010,\u001a\u00020-H\u00d6\u0001J\u0019\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u0005H\u00d6\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0012R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0015\u0010\u0012R\u001a\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0016\u0010\u0012R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0017\u0010\u000fR\u001a\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0018\u0010\u000fR\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0019\u0010\u000fR\u001a\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u001a\u0010\u000f\u00a8\u00063"}, d2 = {"Lcom/tkacik/weatherapp/model/Main;", "Landroid/os/Parcelable;", "feelsLike", "", "grndLevel", "", "humidity", "pressure", "seaLevel", "temp", "tempKf", "tempMax", "tempMin", "(Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "getFeelsLike", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getGrndLevel", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHumidity", "getPressure", "getSeaLevel", "getTemp", "getTempKf", "getTempMax", "getTempMin", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lcom/tkacik/weatherapp/model/Main;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class Main implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "feels_like")
    private final java.lang.Double feelsLike = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "grnd_level")
    private final java.lang.Integer grndLevel = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer humidity = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer pressure = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "sea_level")
    private final java.lang.Integer seaLevel = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double temp = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "temp_kf")
    private final java.lang.Double tempKf = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "temp_max")
    private final java.lang.Double tempMax = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "temp_min")
    private final java.lang.Double tempMin = null;
    public static final android.os.Parcelable.Creator<com.tkacik.weatherapp.model.Main> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.tkacik.weatherapp.model.Main copy(@org.jetbrains.annotations.Nullable()
    java.lang.Double feelsLike, @org.jetbrains.annotations.Nullable()
    java.lang.Integer grndLevel, @org.jetbrains.annotations.Nullable()
    java.lang.Integer humidity, @org.jetbrains.annotations.Nullable()
    java.lang.Integer pressure, @org.jetbrains.annotations.Nullable()
    java.lang.Integer seaLevel, @org.jetbrains.annotations.Nullable()
    java.lang.Double temp, @org.jetbrains.annotations.Nullable()
    java.lang.Double tempKf, @org.jetbrains.annotations.Nullable()
    java.lang.Double tempMax, @org.jetbrains.annotations.Nullable()
    java.lang.Double tempMin) {
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
    
    public Main() {
        super();
    }
    
    public Main(@org.jetbrains.annotations.Nullable()
    java.lang.Double feelsLike, @org.jetbrains.annotations.Nullable()
    java.lang.Integer grndLevel, @org.jetbrains.annotations.Nullable()
    java.lang.Integer humidity, @org.jetbrains.annotations.Nullable()
    java.lang.Integer pressure, @org.jetbrains.annotations.Nullable()
    java.lang.Integer seaLevel, @org.jetbrains.annotations.Nullable()
    java.lang.Double temp, @org.jetbrains.annotations.Nullable()
    java.lang.Double tempKf, @org.jetbrains.annotations.Nullable()
    java.lang.Double tempMax, @org.jetbrains.annotations.Nullable()
    java.lang.Double tempMin) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getFeelsLike() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getGrndLevel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getHumidity() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPressure() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getSeaLevel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getTemp() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getTempKf() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getTempMax() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getTempMin() {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.tkacik.weatherapp.model.Main> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.tkacik.weatherapp.model.Main createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.tkacik.weatherapp.model.Main[] newArray(int size) {
            return null;
        }
    }
}