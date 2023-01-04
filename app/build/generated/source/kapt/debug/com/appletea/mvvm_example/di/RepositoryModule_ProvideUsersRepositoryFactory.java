// Generated by Dagger (https://dagger.dev).
package com.appletea.mvvm_example.di;

import com.appletea.mvvm_example.data.remote.UserApi;
import com.appletea.mvvm_example.data.repository.UserRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("dagger.hilt.android.scopes.ActivityRetainedScoped")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RepositoryModule_ProvideUsersRepositoryFactory implements Factory<UserRepository> {
  private final Provider<UserApi> userApiProvider;

  public RepositoryModule_ProvideUsersRepositoryFactory(Provider<UserApi> userApiProvider) {
    this.userApiProvider = userApiProvider;
  }

  @Override
  public UserRepository get() {
    return provideUsersRepository(userApiProvider.get());
  }

  public static RepositoryModule_ProvideUsersRepositoryFactory create(
      Provider<UserApi> userApiProvider) {
    return new RepositoryModule_ProvideUsersRepositoryFactory(userApiProvider);
  }

  public static UserRepository provideUsersRepository(UserApi userApi) {
    return Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideUsersRepository(userApi));
  }
}
