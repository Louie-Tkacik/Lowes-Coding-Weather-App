package com.tkacik.weatherapp.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\'\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000bH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/tkacik/weatherapp/adapter/AdapterWeather;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/tkacik/weatherapp/adapter/AdapterWeather$WeatherViewHolder;", "weatherContainerList", "", "Lcom/tkacik/weatherapp/model/WeatherContainer;", "weatherContainerSelected", "Lkotlin/Function1;", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "WeatherViewHolder", "app_debug"})
public final class AdapterWeather extends androidx.recyclerview.widget.RecyclerView.Adapter<com.tkacik.weatherapp.adapter.AdapterWeather.WeatherViewHolder> {
    private final java.util.List<com.tkacik.weatherapp.model.WeatherContainer> weatherContainerList = null;
    private final kotlin.jvm.functions.Function1<com.tkacik.weatherapp.model.WeatherContainer, kotlin.Unit> weatherContainerSelected = null;
    
    public AdapterWeather(@org.jetbrains.annotations.NotNull()
    java.util.List<com.tkacik.weatherapp.model.WeatherContainer> weatherContainerList, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.tkacik.weatherapp.model.WeatherContainer, kotlin.Unit> weatherContainerSelected) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.tkacik.weatherapp.adapter.AdapterWeather.WeatherViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.tkacik.weatherapp.adapter.AdapterWeather.WeatherViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/tkacik/weatherapp/adapter/AdapterWeather$WeatherViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/tkacik/weatherapp/databinding/ItemWeatherBinding;", "(Lcom/tkacik/weatherapp/databinding/ItemWeatherBinding;)V", "load", "", "weatherContainer", "Lcom/tkacik/weatherapp/model/WeatherContainer;", "app_debug"})
    public static final class WeatherViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.tkacik.weatherapp.databinding.ItemWeatherBinding binding = null;
        
        public WeatherViewHolder(@org.jetbrains.annotations.NotNull()
        com.tkacik.weatherapp.databinding.ItemWeatherBinding binding) {
            super(null);
        }
        
        public final void load(@org.jetbrains.annotations.NotNull()
        com.tkacik.weatherapp.model.WeatherContainer weatherContainer) {
        }
    }
}