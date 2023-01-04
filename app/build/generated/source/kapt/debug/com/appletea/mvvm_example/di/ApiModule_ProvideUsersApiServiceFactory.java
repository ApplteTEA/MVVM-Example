// Generated by Dagger (https://dagger.dev).
package com.appletea.mvvm_example.di;

import com.appletea.mvvm_example.data.remote.UserApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import retrofit2.Retrofit;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ApiModule_ProvideUsersApiServiceFactory implements Factory<UserApi> {
  private final Provider<Retrofit> retrofitProvider;

  public ApiModule_ProvideUsersApiServiceFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public UserApi get() {
    return provideUsersApiService(retrofitProvider.get());
  }

  public static ApiModule_ProvideUsersApiServiceFactory create(
      Provider<Retrofit> retrofitProvider) {
    return new ApiModule_ProvideUsersApiServiceFactory(retrofitProvider);
  }

  public static UserApi provideUsersApiService(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(ApiModule.INSTANCE.provideUsersApiService(retrofit));
  }
}
