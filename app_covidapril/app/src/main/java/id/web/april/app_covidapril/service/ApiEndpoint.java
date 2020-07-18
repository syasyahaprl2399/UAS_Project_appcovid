/*
 * Made With Love
 * Author @Moh Husni Mubaraq
 * Not for Commercial Purpose
 */

package id.web.april.app_covidapril.service;

import java.util.List;

import id.web.april.app_covidapril.model.HistoryModel;
import id.web.april.app_covidapril.model.IndonesiaProvinsiModel;
import id.web.april.app_covidapril.model.IndonesiaSummaryModel;
import id.web.april.app_covidapril.model.WorldSummaryModel;
import id.web.april.app_covidapril.model.news.NewsResponse;
import id.web.april.app_covidapril.utilities.AppUtils;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiEndpoint {
    //Endpoint riwayat
    @GET(AppUtils.END_POINT_WORLD_HISTORY)
    Call<List<HistoryModel>> getHistoryList(@Path("date") String date);

    //Endpointt Ringkasan Dunia
    @GET(AppUtils.END_POINT_SUMMARY_WORLD)
    Call<WorldSummaryModel> getSummaryWorld();

    //Endpoint Ringkasan Indonesia
    @GET(AppUtils.ENDPOINT_SUMMARY_INDONESIA)
    Call<List<IndonesiaSummaryModel>> getSummaryIdn();

    //Endpoint Provinsi Indonesia
    @GET(AppUtils.ENDPOINT_INDONESIA_PROVINSI)
    Call<List<IndonesiaProvinsiModel>> getProvince();

    @GET(AppUtils.ENDPOINT_TOP_HEADLINE_NEWS)
    Call<NewsResponse> getNews(@Query("country") String countryCode,
                               @Query("category") String category,
                               @Query("apiKey") String apiKey);

}
